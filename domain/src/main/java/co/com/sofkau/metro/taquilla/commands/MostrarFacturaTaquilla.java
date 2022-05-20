package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.values.Monto;

public class MostrarFacturaTaquilla extends Command {
    private Monto monto;

    public MostrarFacturaTaquilla(Monto monto) {
        this.monto = monto;
    }

    public Monto getMonto() {
        return monto;
    }
}
