package co.com.sofkau.metro.estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.values.Cargo;
import co.com.sofkau.metro.estacion.values.EmpleadosEstacionId;
import co.com.sofkau.metro.estacion.values.NombreEstacion;

public class EmpleadoAgregado extends DomainEvent {
    private final EmpleadosEstacionId empleadosestacionid;
    private final NombreEstacion nombreestacion;
    private final Cargo cargo;


    public EmpleadoAgregado(EmpleadosEstacionId empleadosestacionid, NombreEstacion nombreestacion, Cargo cargo) {
        super("co.com.sofkau.metro.estacion.events.EmpleadoAgregado");
        this.empleadosestacionid = empleadosestacionid;
        this.nombreestacion = nombreestacion;
        this.cargo = cargo;
    }

    public EmpleadosEstacionId getEmpleadosestacionid() {
        return empleadosestacionid;
    }

    public NombreEstacion getNombreestacion() {
        return nombreestacion;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
