package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.values.NombreTaquilla;
import co.com.sofkau.metro.taquilla.values.TaquillaId;
import co.com.sofkau.metro.taquilla.values.TelefonoTaquilla;

public class CambiarTelefonoEmpleado extends Command {
    private TaquillaId taquillaid;
    private NombreTaquilla nombretaquilla;
    private TelefonoTaquilla telefonotaquilla;

    public CambiarTelefonoEmpleado(TaquillaId taquillaid, NombreTaquilla nombretaquilla, TelefonoTaquilla telefonotaquilla) {
        this.taquillaid = taquillaid;
        this.nombretaquilla = nombretaquilla;
        this.telefonotaquilla = telefonotaquilla;
    }

    public TaquillaId getTaquillaid() {
        return taquillaid;
    }

    public NombreTaquilla getNombretaquilla() {
        return nombretaquilla;
    }

    public TelefonoTaquilla getTelefonotaquilla() {
        return telefonotaquilla;
    }
}
