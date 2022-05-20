package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.NombrePasajero;
import co.com.sofkau.metro.tren.values.TelefonoPasajero;

public class CambiarTelefonoPasajero extends Command {
    private NombrePasajero nombrepasajero;
    private TelefonoPasajero telefonopasajero;

    public CambiarTelefonoPasajero(NombrePasajero nombrepasajero, TelefonoPasajero telefonopasajero) {
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
