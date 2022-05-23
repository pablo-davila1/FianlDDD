package co.com.sofkau.metro.taquilla.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.taquilla.values.FacturaId;
import co.com.sofkau.metro.taquilla.values.Monto;

public class FacturaTaquillaMostrada extends DomainEvent {
    private final FacturaId facturaid;
    private final Monto monto;

    public FacturaTaquillaMostrada(FacturaId facturaid, Monto monto) {
        super("co.com.sofkau.metro.taquilla.events.FacturaTaquillaMostrada");
        this.facturaid = facturaid;
        this.monto = monto;
    }

    public FacturaId getFacturaid() {
        return facturaid;
    }

    public Monto getMonto() {
        return monto;
    }
}
