package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.tren.values.ConductorId;
import co.com.sofkau.metro.tren.values.NombreConductor;
import co.com.sofkau.metro.tren.values.Ruta;

public class Conductor extends Entity<ConductorId> {
    protected NombreConductor nombretren;
    protected Ruta ruta;
    public Conductor(ConductorId entityId) {
        super(entityId);
    }

    public NombreConductor getNombretren() {
        return nombretren;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
