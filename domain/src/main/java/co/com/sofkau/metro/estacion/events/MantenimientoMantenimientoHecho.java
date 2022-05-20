package co.com.sofkau.metro.estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.values.Registro;
import co.com.sofkau.metro.estacion.values.TorniqueteId;

public class MantenimientoMantenimientoHecho extends DomainEvent {
    private final TorniqueteId torniqueteid;
    private final Registro registro;

    public MantenimientoMantenimientoHecho(String type, TorniqueteId torniqueteid, Registro registro) {
        super("co.com.sofkau.metro.estacion.events.MantenimientoMantenimientoHecho");
        this.torniqueteid = torniqueteid;
        this.registro = registro;
    }

    public TorniqueteId getTorniqueteid() {
        return torniqueteid;
    }

    public Registro getRegistro() {
        return registro;
    }
}
