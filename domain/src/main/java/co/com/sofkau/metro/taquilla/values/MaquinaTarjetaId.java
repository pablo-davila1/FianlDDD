package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.Identity;

public class MaquinaTarjetaId extends Identity {
    public MaquinaTarjetaId(String id) {
        super(id);
    }

    public static MaquinaTarjetaId of(String id) {
        return new MaquinaTarjetaId(id);
    }
}
