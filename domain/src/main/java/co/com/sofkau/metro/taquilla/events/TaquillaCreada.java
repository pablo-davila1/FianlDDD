package co.com.sofkau.metro.taquilla.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.taquilla.values.HoraApertura;

public class TaquillaCreada extends DomainEvent {
    private final HoraApertura horaapertura;

    public TaquillaCreada( HoraApertura horaapertura) {
        super("co.com.sofkau.metro.taquilla.events.TaquillaCreada");
        this.horaapertura = horaapertura;
    }

    public HoraApertura getHoraapertura() {
        return horaapertura;
    }
}
