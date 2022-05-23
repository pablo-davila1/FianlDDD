package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanico;
import co.com.sofkau.metro.tren.values.TrenId;

public class ModificarTelefonoMecanico extends Command {
    private TrenId trenid;
    private NombreMecanico nombremecanico;
    private TelefonoMecanico telefonomecanico;

    public ModificarTelefonoMecanico(TrenId trenid, NombreMecanico nombremecanico, TelefonoMecanico telefonomecanico) {
        this.trenid = trenid;
        this.nombremecanico = nombremecanico;
        this.telefonomecanico = telefonomecanico;
    }

    public TrenId getTrenid() {
        return trenid;
    }

    public NombreMecanico getNombremecanico() {
        return nombremecanico;
    }

    public TelefonoMecanico getTelefonomecanico() {
        return telefonomecanico;
    }
}
