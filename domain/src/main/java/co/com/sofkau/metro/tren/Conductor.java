package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.tren.values.ConductorId;

public class Conductor extends Entity<ConductorId> {
    public Conductor(ConductorId entityId) {
        super(entityId);
    }
}
