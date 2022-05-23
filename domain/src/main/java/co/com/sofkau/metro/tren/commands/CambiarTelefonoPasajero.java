package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.NombrePasajero;
import co.com.sofkau.metro.tren.values.TelefonoPasajero;
import co.com.sofkau.metro.tren.values.TrenId;

public class CambiarTelefonoPasajero extends Command {
    private TrenId trenid;
    private NombrePasajero nombrepasajero;
    private TelefonoPasajero telefonopasajero;


    public CambiarTelefonoPasajero(TrenId trenid, NombrePasajero nombrepasajero, TelefonoPasajero telefonopasajero) {
        this.trenid = trenid;
        this.nombrepasajero = nombrepasajero;
        this.telefonopasajero = telefonopasajero;
    }

    public TrenId getTrenid() {
        return trenid;
    }

    public NombrePasajero getNombrepasajero() {
        return nombrepasajero;
    }

    public TelefonoPasajero getTelefonopasajero() {
        return telefonopasajero;
    }
}
