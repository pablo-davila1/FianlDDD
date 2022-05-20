package co.com.sofkau.metro.estacion.commands;

import co.com.sofkau.metro.estacion.values.Cargo;
import co.com.sofkau.metro.estacion.values.NombreEstacion;

public class AgregarEmpleado {
    private NombreEstacion nombreestacion;
    private Cargo cargo;

    public AgregarEmpleado(NombreEstacion nombreestacion, Cargo cargo) {
        this.nombreestacion = nombreestacion;
        this.cargo = cargo;
    }

    public NombreEstacion getNombreestacion() {
        return nombreestacion;
    }

    public Cargo getCargo() {
        return cargo;
    }
}
