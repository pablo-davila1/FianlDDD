package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.estacion.values.Cargo;
import co.com.sofkau.metro.estacion.values.EmpleadosEstacionId;
import co.com.sofkau.metro.estacion.values.NombreEstacion;

public class EmpleadosEstacion extends Entity<EmpleadosEstacionId> {
    protected NombreEstacion nombreEstacion;
    protected Cargo cargo;

    public EmpleadosEstacion(EmpleadosEstacionId entityId, NombreEstacion nombreEstacion, Cargo cargo) {
        super(entityId);
        this.nombreEstacion = nombreEstacion;
        this.cargo = cargo;
    }

    public NombreEstacion getNombreEstacion() {
        return nombreEstacion;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
