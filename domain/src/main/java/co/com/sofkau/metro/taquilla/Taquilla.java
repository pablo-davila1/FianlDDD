package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.metro.taquilla.values.*;
import co.com.sofkau.metro.taquilla.events.FacturaTaquillaMostrada;
import co.com.sofkau.metro.taquilla.events.SaldoMaquinaAgregado;
import co.com.sofkau.metro.taquilla.values.*;

import java.util.Set;

public class Taquilla extends AggregateEvent<TaquillaId> {
    protected Set<MaquinaTarjeta> maquinaTarjeta;
    protected Set<EmpleadosTaquilla> empleado;
    protected Set<Factura> factura;
    protected HoraApertura horaapertura;

    public Taquilla(TaquillaId entityId, Set<MaquinaTarjeta> maquinaTarjeta, Set<EmpleadosTaquilla> empleado, Set<Factura> factura, HoraApertura horaapertura) {
        super(entityId);
        appendChange(new TaquillaCreada(horaapertura)).apply();
        subscribe(new TaquillaEventChange(this));
    }

    public void agregarSaldo(Usuario usuario, Saldo saldo) {
        var maquinaId = new MaquinaTarjetaId();
        appendChange(new SaldoMaquinaAgregado(maquinaId, usuario,saldo)).apply();
    }

    public void mostrarFactura(Monto monto) {
        var facturaId = new FacturaId();
        appendChange(new FacturaTaquillaMostrada(facturaId, monto)).apply();
    }

    public Taquilla(TaquillaId entityId) {
        super(entityId);
    }

    public Set<MaquinaTarjeta> getMaquinaTarjeta() {
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
