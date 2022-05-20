package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.tren.values.NombrePasajero;
import co.com.sofkau.metro.tren.values.PasajeroId;
import co.com.sofkau.metro.tren.values.TelefonoPasajero;

public class Pasajero extends Entity<PasajeroId> {
    protected NombrePasajero nombrepasajero;
    protected TelefonoPasajero telefonopasajero;
    public Pasajero(PasajeroId entityId) {
        super(entityId);
    }

    public Pasajero(PasajeroId entityId, NombrePasajero nombrepasajero, TelefonoPasajero telefonopasajero) {
        super(entityId);
        this.nombrepasajero = nombrepasajero;
        this.telefonopasajero = telefonopasajero;
    }

    public NombrePasajero getNombrepasajero() {
        return nombrepasajero;
    }

    public TelefonoPasajero getTelefonopasajero() {
        return telefonopasajero;
    }
}
