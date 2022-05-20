package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanico;

import java.util.Collections;

public class ModificarTelefono extends Command {
    private NombreMecanico nombremecanico;
    private TelefonoMecanico telefonomecanico;

    public ModificarTelefono(NombreMecanico nombremecanico, TelefonoMecanico telefonomecanico) {
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
