package co.com.sofkau.metro.tren.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombreConductor implements ValueObject<String> {
    private final String value;

    public NombreConductor(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
