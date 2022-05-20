package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.taquilla.EmpleadosTaquilla;

import java.util.Set;

public class Estacion extends AggregateEvent<EstacionId>{
    protected Set<EmpleadosEstacion> empleados;
    protected Ascensor ascensor;
    protected Set<Torniquete>torniquete;

    public Estacion(EstacionId entityId) {
        super(entityId);
    }
}
