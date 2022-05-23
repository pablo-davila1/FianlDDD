package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.Identity;

public class TaquillaId extends Identity {
    public TaquillaId(String id) {
        super(id);
    }

    public TaquillaId() {
    }

    public static TaquillaId of(String id) {
        return new TaquillaId(id);
    }
}
