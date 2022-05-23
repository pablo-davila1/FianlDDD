package co.com.sofkau.metro.estacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.estacion.values.AscensorId;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.PesoMax;

public class MantenimientoAscensor extends Command {
    private EstacionId estacionid;
    private AscensorId ascensorid;
    private PesoMax pesomax;

    public MantenimientoAscensor(EstacionId estacionid, AscensorId ascensorid, PesoMax pesomax) {
        this.estacionid = estacionid;
        this.ascensorid = ascensorid;
        this.pesomax = pesomax;
    }

    public EstacionId getEstacionid() {
        return estacionid;
    }

    public AscensorId getAscensorid() {
        return ascensorid;
    }

    public PesoMax getPesomax() {
        return pesomax;
    }
}
