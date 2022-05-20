package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.tren.values.MecanicoId;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanico;

public class Mecanico extends Entity<MecanicoId> {
    protected NombreMecanico nombremecanico;
    protected TelefonoMecanico telefonomecanico;

    public Mecanico(MecanicoId entityId) {
        super(entityId);
    }

    public NombreMecanico getNombremecanico() {
        return nombremecanico;
    }

    public TelefonoMecanico getTelefonomecanico() {
        return telefonomecanico;
    }
}
