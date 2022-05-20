package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.values.NombreTaquilla;
import co.com.sofkau.metro.taquilla.values.TelefonoTaquilla;

public class cambiarTelefonoEmpleado extends Command {
    private NombreTaquilla nombretaquilla;
    private TelefonoTaquilla telefonotaquilla;

    public cambiarTelefonoEmpleado(NombreTaquilla nombretaquilla, TelefonoTaquilla telefonotaquilla) {
        this.nombretaquilla = nombretaquilla;
        this.telefonotaquilla = telefonotaquilla;
    }

    public NombreTaquilla getNombretaquilla() {
        return nombretaquilla;
    }

    public TelefonoTaquilla getTelefonotaquilla() {
        return telefonotaquilla;
    }
}
