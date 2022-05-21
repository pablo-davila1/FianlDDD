package co.com.sofkau.metro.tren.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.metro.taquilla.values.EmpleadosTaquillaId;

public class ConductorId extends Identity {
    public ConductorId(String id) {
        super(id);
    }

    public static ConductorId of(String id) {
        return new ConductorId(id);
    }
}
