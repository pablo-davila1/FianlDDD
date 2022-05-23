package co.com.sofkau.metro.estacion.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Registro implements ValueObject<String> {
    private final String value;

    public Registro(String value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public String value() {
        return value;
    }

}
