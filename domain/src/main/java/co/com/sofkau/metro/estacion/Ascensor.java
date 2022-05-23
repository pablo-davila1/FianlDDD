package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.estacion.values.AscensorId;
import co.com.sofkau.metro.estacion.values.PesoMax;

public class Ascensor extends Entity<AscensorId> {
    protected PesoMax pesomax;

    public Ascensor(AscensorId entityId, PesoMax pesomax) {
        super(entityId);
        this.pesomax = pesomax;
    }


    public PesoMax getPesomax() {
        return pesomax;
    }
}
