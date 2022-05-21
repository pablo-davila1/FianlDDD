package co.com.sofkau.metro.estacion.values;

import co.com.sofka.domain.generic.Identity;

public class EstacionId extends Identity {
    public EstacionId(String id) {
        super(id);
    }

    public EstacionId() {
    }

    public static EstacionId of(String id) {
        return new EstacionId(id);
    }
}
