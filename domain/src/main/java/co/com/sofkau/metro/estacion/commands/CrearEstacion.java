package co.com.sofkau.metro.estacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.Referencia;

public class CrearEstacion extends Command {
    private EstacionId estacionid;
    private Referencia referencia;

    public CrearEstacion(EstacionId estacionid, Referencia referencia) {
        this.estacionid = estacionid;
        this.referencia = referencia;
    }

    public EstacionId getEstacionid() {
        return estacionid;
    }

    public Referencia getReferencia() {
        return referencia;
    }
}
