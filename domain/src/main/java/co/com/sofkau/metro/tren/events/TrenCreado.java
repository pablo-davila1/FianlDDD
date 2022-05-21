package co.com.sofkau.metro.tren.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.values.Marca;

public class TrenCreado extends DomainEvent {
    private final Marca marca;

    public TrenCreado( Marca marca) {
        super("co.com.sofkau.metro.tren.events.TrenCreado");
        this.marca = marca;
    }

    public Marca getMarca() {
        return marca;
    }
}
