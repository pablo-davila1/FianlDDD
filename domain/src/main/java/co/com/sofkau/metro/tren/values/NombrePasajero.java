package co.com.sofkau.metro.tren.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NombrePasajero implements ValueObject<String > {
    private final String value;

    public NombrePasajero(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }
}
