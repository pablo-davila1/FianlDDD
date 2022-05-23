package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanico;

public class ModificarTelefonoMecanico extends Command {
    private NombreMecanico nombremecanico;
    private TelefonoMecanico telefonomecanico;

    public ModificarTelefonoMecanico(NombreMecanico nombremecanico, TelefonoMecanico telefonomecanico) {
        this.nombremecanico = nombremecanico;
        this.telefonomecanico = telefonomecanico;
    }

    public NombreMecanico getNombremecanico() {
        return nombremecanico;
    }

    public TelefonoMecanico getTelefonomecanico() {
        return telefonomecanico;
    }
}
