package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.taquilla.values.TaquillaId;

import java.util.Set;

public class Taquilla extends AggregateEvent<TaquillaId> {
    protected MaquinaTarjeta maquinaTarjeta;
    protected Set<EmpleadosTaquilla> empleado;
    protected Set<Factura> factura;

    public Taquilla(TaquillaId entityId) {
        super(entityId);
    }
}
