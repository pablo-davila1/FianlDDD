package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.tren.values.ConductorId;
import co.com.sofkau.metro.tren.values.Ruta;
import co.com.sofkau.metro.tren.values.NombreConductor;

public class Conductor extends Entity<ConductorId> {
    protected NombreConductor nombretren;
    protected Ruta ruta;

    public Conductor(ConductorId entityId, NombreConductor nombretren, Ruta ruta) {
        super(entityId);
        this.nombretren = nombretren;
        this.ruta = ruta;
    }

    public NombreConductor getNombretren() {
        return nombretren;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
