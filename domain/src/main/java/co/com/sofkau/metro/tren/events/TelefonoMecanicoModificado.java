package co.com.sofkau.metro.tren.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.values.MecanicoId;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanicoId;

public class TelefonoMecanicoModificado extends DomainEvent {
    private final MecanicoId mecanicoid;
    private final NombreMecanico nombremecanico;
    private final TelefonoMecanicoId telefonomecanico;



    public TelefonoMecanicoModificado(String type, MecanicoId mecanicoid, NombreMecanico nombremecanico, TelefonoMecanicoId telefonomecanico) {
        super(type);
        this.mecanicoid = mecanicoid;
        this.nombremecanico = nombremecanico;
        this.telefonomecanico = telefonomecanico;
    }

    public MecanicoId getMecanicoid() {
        return mecanicoid;
    }

    public NombreMecanico getNombremecanico() {
        return nombremecanico;
    }

    public TelefonoMecanicoId getTelefonomecanico() {
        return telefonomecanico;
    }
}
