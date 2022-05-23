package co.com.sofkau.metro.taquilla.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Usuario implements ValueObject<String> {
    private final String value;

    public Usuario(String value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public String value() {
        return value;
    }
}
