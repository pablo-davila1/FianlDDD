package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.events.EmpleadoAgregado;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.events.MantenimientoAscensorHecho;
import co.com.sofkau.metro.estacion.events.MantenimientoTorniqueteHecho;
import co.com.sofkau.metro.estacion.values.*;


import java.util.List;
import java.util.Set;

public class Estacion extends AggregateEvent<EstacionId>{
    protected Set<EmpleadosEstacion> empleados;
    protected Set<Ascensor> ascensor;
    protected Set<Torniquete>torniquete;

    protected Referencia referencia;

    public Estacion(EstacionId entityId, Referencia referencia) {
        super(entityId);
        appendChange(new EstacionCreada(referencia)).apply();
        subscribe(new EstacionEventChange(this));
    }

    public Estacion(EstacionId entityId) {
        super(entityId);
        subscribe(new EstacionEventChange(this));
    }

    public static Estacion from(EstacionId entityId, List<DomainEvent> events){
        var estacion = new Estacion(entityId);
        events.forEach(estacion::applyEvent);
        return estacion;
    }


    public void AgregarEmpleadoEstacion(NombreEstacion nombreestacion, Cargo cargo) {
        var empleadoEstacionId = new EmpleadosEstacionId();
        appendChange(new EmpleadoAgregado(empleadoEstacionId, nombreestacion, cargo)).apply();
    }
    public void mantenimientoAsensor(PesoMax pesomax) {
        var ascensorId = new AscensorId();
        appendChange(new MantenimientoAscensorHecho(ascensorId, pesomax)).apply();
    }
    public void mantenimientoTorniquete(Registro registro) {
        var torniqueteId = new TorniqueteId();
        appendChange(new MantenimientoTorniqueteHecho(torniqueteId, registro)).apply();
    }







    public Set<EmpleadosEstacion> getEmpleados() {
        return empleados;
    }

    public Set<Ascensor> getAscensor() {
        return ascensor;
    }

    public Set<Torniquete> getTorniquete() {
        return torniquete;
    }

    public Referencia getReferencia() {
        return referencia;
    }
}
