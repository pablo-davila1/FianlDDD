package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.events.TrenCreado;
import co.com.sofkau.metro.tren.values.TrenId;
import co.com.sofkau.metro.tren.values.Marca;

import java.util.List;
import java.util.Set;

public class Tren extends AggregateEvent<TrenId> {
    protected Set<Conductor> conductor;
    protected Set<Pasajero> pasajero;
    protected Set<Mecanico>mecanico;
    protected Marca marca;


    public Tren(TrenId entityId, Marca marca) {
        super(entityId);
        appendChange(new TrenCreado(marca)).apply();
        subscribe(new TrenEventChange(this));
    }

    public Tren(TrenId entityId) {
        super(entityId);
        subscribe(new TrenEventChange(this));
    }
    public static Tren from(TrenId entityId, List<DomainEvent> events){
            var tren = new Tren(entityId);
        events.forEach(tren::applyEvent);
            return tren;
    }

    public Set<Conductor> getConductor() {
        return conductor;
    }

    public Set<Pasajero> getPasajero() {
        return pasajero;
    }

    public Set<Mecanico> getMecanico() {
        return mecanico;
    }

    public Marca getMarca() {
        return marca;
    }
}
