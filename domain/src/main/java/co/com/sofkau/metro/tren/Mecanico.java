package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.tren.values.MecanicoId;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanicoId;

public class Mecanico extends Entity<MecanicoId> {
    protected NombreMecanico nombremecanico;
    protected TelefonoMecanicoId telefonomecanico;




    public Mecanico(MecanicoId entityId, NombreMecanico nombremecanico, TelefonoMecanicoId telefonomecanico) {
        super(entityId);
        this.nombremecanico = nombremecanico;
        this.telefonomecanico = telefonomecanico;
    }

    public NombreMecanico getNombremecanico() {
        return nombremecanico;
    }

    public TelefonoMecanicoId getTelefonomecanico() {
        return telefonomecanico;
    }

}
