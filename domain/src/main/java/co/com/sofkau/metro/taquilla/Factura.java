package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.taquilla.values.FacturaId;
import co.com.sofkau.metro.taquilla.values.Monto;

public class Factura extends Entity<FacturaId> {
    protected Monto monto;

    public Factura(FacturaId entityId, Monto monto) {
        super(entityId);
        this.monto = monto;
    }

    public Monto getMonto() {
        return monto;
    }
}
