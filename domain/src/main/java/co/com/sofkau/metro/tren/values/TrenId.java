package co.com.sofkau.metro.tren.values;

import co.com.sofka.domain.generic.Identity;

public class TrenId extends Identity {
    public TrenId(String id) {
        super(id);
    }

    public static TrenId of(String id) {
        return new TrenId(id);
    }
}
