package co.com.sofkau.metro.estacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.estacion.values.PesoMax;

public class MantenimientoAscensor extends Command {
    private PesoMax pesomax;

    public MantenimientoAscensor(PesoMax pesomax) {
        this.pesomax = pesomax;
    }

    public PesoMax getPesomax() {
        return pesomax;
    }
}
