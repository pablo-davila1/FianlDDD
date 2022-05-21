package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.taquilla.values.HoraApertura;
import co.com.sofkau.metro.taquilla.values.TaquillaId;

public class CrearTaquilla extends Command {
    private TaquillaId taquillaid;
    private HoraApertura horaapertura;

    public CrearTaquilla(TaquillaId taquillaid, HoraApertura horaapertura) {
        this.taquillaid = taquillaid;
        this.horaapertura = horaapertura;
    }

    public TaquillaId getTaquillaid() {
        return taquillaid;
    }

    public HoraApertura getHoraapertura() {
        return horaapertura;
    }
}
