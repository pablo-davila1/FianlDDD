package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.Identity;
import co.com.sofkau.metro.estacion.values.EstacionId;

public class TaquillaId extends Identity {
    public TaquillaId(String id) {
        super(id);
    }

    public static TaquillaId of(String id) {
        return new TaquillaId(id);
    }
}
