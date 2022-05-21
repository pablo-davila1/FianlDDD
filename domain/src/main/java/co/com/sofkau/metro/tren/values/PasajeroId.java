package co.com.sofkau.metro.tren.values;

import co.com.sofka.domain.generic.Identity;

public class PasajeroId extends Identity {
    public PasajeroId(String id) {
        super(id);
    }

    public PasajeroId() {
    }

    public static PasajeroId of(String id) {
        return new PasajeroId(id);
    }
}
