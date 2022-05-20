package co.com.sofkau.metro.tren.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.values.NombrePasajero;
import co.com.sofkau.metro.tren.values.PasajeroId;
import co.com.sofkau.metro.tren.values.TelefonoPasajero;

public class TelefonoPasajeroCambiado extends DomainEvent {
    private final PasajeroId pasajeroid;
    private final NombrePasajero nombrepasajero;
    private final TelefonoPasajero telefonopasajero;

    public TelefonoPasajeroCambiado(String type, PasajeroId pasajeroid, NombrePasajero nombrepasajero, TelefonoPasajero telefonopasajero) {
        super("co.com.sofkau.metro.tren.events.TelefonoPasajeroCambiado");
        this.pasajeroid = pasajeroid;
        this.nombrepasajero = nombrepasajero;
        this.telefonopasajero = telefonopasajero;
    }

    public PasajeroId getPasajeroid() {
        return pasajeroid;
    }

    public NombrePasajero getNombrepasajero() {
        return nombrepasajero;
    }

    public TelefonoPasajero getTelefonopasajero() {
        return telefonopasajero;
    }
}
