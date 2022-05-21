package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.Identity;

public class EmpleadosTaquillaId extends Identity {
    public EmpleadosTaquillaId(String id) {
        super(id);
    }

    public static EmpleadosTaquillaId of(String id) {
        return new EmpleadosTaquillaId(id);
    }
}
