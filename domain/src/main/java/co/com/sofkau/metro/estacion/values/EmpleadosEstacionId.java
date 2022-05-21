package co.com.sofkau.metro.estacion.values;

import co.com.sofka.domain.generic.Identity;

public class EmpleadosEstacionId extends Identity {
    public EmpleadosEstacionId(String id) {
        super(id);
    }

    public static EmpleadosEstacionId of(String id) {
        return new EmpleadosEstacionId(id);
    }
}
