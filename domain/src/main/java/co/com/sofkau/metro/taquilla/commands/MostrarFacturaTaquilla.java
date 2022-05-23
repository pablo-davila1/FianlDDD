package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.values.Monto;
import co.com.sofkau.metro.taquilla.values.TaquillaId;

public class MostrarFacturaTaquilla extends Command {
    private TaquillaId taquillaid;
    private Monto monto;

    public MostrarFacturaTaquilla(TaquillaId taquillaid, Monto monto) {
        this.taquillaid = taquillaid;
        this.monto = monto;
    }

    public Monto getMonto() {
        return monto;
    }

    public TaquillaId getTaquillaid() {
        return taquillaid;
    }
}
