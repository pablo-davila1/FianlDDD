package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TelefonoTaquilla implements ValueObject<String> {
    private final String value;

    public TelefonoTaquilla(String value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public String value() {
            return value;
    }
}
