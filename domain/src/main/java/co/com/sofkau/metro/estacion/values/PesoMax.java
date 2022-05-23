package co.com.sofkau.metro.estacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PesoMax implements ValueObject<String> {
    private final String value;

    public PesoMax(String value) {
        this.value = Objects.requireNonNull(value);
    }
    @Override
    public String value() {
        return value;
    }
}
