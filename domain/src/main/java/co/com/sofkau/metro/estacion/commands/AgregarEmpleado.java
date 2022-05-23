package co.com.sofkau.metro.estacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.estacion.values.Cargo;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.NombreEstacion;

public class AgregarEmpleado extends Command {
    private EstacionId estacionid;
    private NombreEstacion nombreestacion;
    private Cargo cargo;

    public AgregarEmpleado(EstacionId estacionid, NombreEstacion nombreestacion, Cargo cargo) {
        this.estacionid = estacionid;
        this.nombreestacion = nombreestacion;
        this.cargo = cargo;
    }

    public EstacionId getEstacionid() {
        return estacionid;
    }

    public NombreEstacion getNombreestacion() {
        return nombreestacion;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
