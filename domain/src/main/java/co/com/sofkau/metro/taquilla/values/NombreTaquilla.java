package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreTaquilla implements ValueObject<String> {
    private final String value;

    public NombreTaquilla(String value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public String value() {
        return value;
    }
}
