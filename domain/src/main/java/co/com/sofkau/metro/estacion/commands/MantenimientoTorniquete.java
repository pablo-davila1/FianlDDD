package co.com.sofkau.metro.estacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.Registro;

public class MantenimientoTorniquete extends Command {
    private EstacionId estacionid;
    private Registro registro;

    public MantenimientoTorniquete(EstacionId estacionid, Registro registro) {
        this.estacionid = estacionid;
        this.registro = registro;
    }

    public Registro getRegistro() {
        return registro;
    }

    public EstacionId getEstacionid() {
        return estacionid;
    }
}
