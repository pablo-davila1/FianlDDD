package co.com.sofkau.metro.estacion.values;

import co.com.sofka.domain.generic.Identity;

public class AscensorId extends Identity {
    public AscensorId(String id) {
        super(id);
    }

    public AscensorId() {
    }

    public static AscensorId of(String id) {
        return new AscensorId(id);
    }
}
