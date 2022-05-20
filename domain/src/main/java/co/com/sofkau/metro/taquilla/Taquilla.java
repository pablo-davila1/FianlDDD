package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.taquilla.values.HoraApertura;
import co.com.sofkau.metro.taquilla.values.TaquillaId;

import java.util.Set;

public class Taquilla extends AggregateEvent<TaquillaId> {
    protected MaquinaTarjeta maquinaTarjeta;
    protected Set<EmpleadosTaquilla> empleado;
    protected Set<Factura> factura;
    protected HoraApertura horaapertura;

    public Taquilla(TaquillaId entityId) {
        super(entityId);
    }

    public MaquinaTarjeta getMaquinaTarjeta() {
        return maquinaTarjeta;
    }

    public Set<EmpleadosTaquilla> getEmpleado() {
        return empleado;
    }

    public Set<Factura> getFactura() {
        return factura;
    }

    public HoraApertura getHoraapertura() {
        return horaapertura;
    }
}
