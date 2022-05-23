package co.com.sofkau.metro.tren.values;

import co.com.sofka.domain.generic.Identity;

public class TelefonoMecanicoId extends Identity {
    public TelefonoMecanicoId(String id) {
        super(id);
    }

    public TelefonoMecanicoId() {
    }

    public static TelefonoMecanicoId of(String id) {
        return new TelefonoMecanicoId(id);
    }
}
