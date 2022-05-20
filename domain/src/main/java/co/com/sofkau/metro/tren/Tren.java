package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.tren.values.Marca;
import co.com.sofkau.metro.tren.values.TrenId;

import java.util.Set;

public class Tren extends AggregateEvent<TrenId> {
    protected Conductor conductor;
    protected Set<Pasajero> pasajero;
    protected Set<Mecanico>mecanico;
    protected Marca marca;


    public Tren(TrenId entityId, Conductor conductor, Set<Pasajero> pasajero, Set<Mecanico> mecanico, Marca marca) {
        super(entityId);
        this.conductor = conductor;
        this.pasajero = pasajero;
        this.mecanico = mecanico;
        this.marca = marca;
    }

    public Conductor getConductor() {
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
