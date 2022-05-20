package co.com.sofkau.metro.estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.values.AscensorId;
import co.com.sofkau.metro.estacion.values.PesoMax;

public class MantenimientoAscensorHecho extends DomainEvent {
    private final AscensorId ascensorid;
    private final PesoMax pesomax;

    public MantenimientoAscensorHecho(String type, AscensorId ascensorid, PesoMax pesomax) {
        super("co.com.sofkau.metro.estacion.events.MantenimientoAscensorHecho");
        this.ascensorid = ascensorid;
        this.pesomax = pesomax;
    }

    public AscensorId getAscensorid() {
        return ascensorid;
    }

    public PesoMax getPesomax() {
        return pesomax;
    }
}
