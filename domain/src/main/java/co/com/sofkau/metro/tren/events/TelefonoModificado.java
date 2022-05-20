package co.com.sofkau.metro.tren.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.values.MecanicoId;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanico;

public class TelefonoModificado extends DomainEvent {
    private final MecanicoId mecanicoid;
    private final NombreMecanico nombremecanico;
    private final TelefonoMecanico telefonomecanico;

    public TelefonoModificado(String type, MecanicoId mecanicoid, NombreMecanico nombremecanico, TelefonoMecanico telefonomecanico) {
        super("co.com.sofkau.metro.tren.events.TelefonoModificado");
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

    public TelefonoMecanico getTelefonomecanico() {
        return telefonomecanico;
    }
}
