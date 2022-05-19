package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.tren.values.TrenId;

import java.util.Set;

public class Tren extends AggregateEvent<TrenId> {
    protected Conductor conductor;
    protected Set<Pasajero> pasajero;
    protected Set<Mecanico>mecanico;

    public Tren(TrenId entityId) {
        super(entityId);
    }
}
