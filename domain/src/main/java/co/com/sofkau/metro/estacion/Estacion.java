package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.Referencia;

import java.util.Set;

public class Estacion extends AggregateEvent<EstacionId>{
    protected Set<EmpleadosEstacion> empleados;
    protected Ascensor ascensor;
    protected Set<Torniquete>torniquete;
    protected Referencia referencia;

    public Estacion(EstacionId entityId, Set<EmpleadosEstacion> empleados, Ascensor ascensor, Set<Torniquete> torniquete, Referencia referencia) {
        super(entityId);
        this.empleados = empleados;
        this.ascensor = ascensor;
        this.torniquete = torniquete;
        this.referencia = referencia;
    }

    public Set<EmpleadosEstacion> getEmpleados() {
        return empleados;
    }

    public Ascensor getAscensor() {
        return ascensor;
    }

    public Set<Torniquete> getTorniquete() {
        return torniquete;
    }

    public Referencia getReferencia() {
        return referencia;
    }
}
