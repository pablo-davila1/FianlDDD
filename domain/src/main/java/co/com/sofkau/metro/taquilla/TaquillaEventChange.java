package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.metro.taquilla.events.FacturaTaquillaMostrada;
import co.com.sofkau.metro.taquilla.events.SaldoMaquinaAgregado;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.taquilla.events.TelefonoEmpleadocambiado;
import co.com.sofkau.metro.taquilla.values.EmpleadosTaquillaId;
import co.com.sofkau.metro.taquilla.values.TelefonoTaquilla;

import java.util.HashSet;
import java.util.Set;

public class TaquillaEventChange extends EventChange {
    public TaquillaEventChange(Taquilla taquilla){
        apply((TaquillaCreada event)->{
            taquilla.horaapertura = event.getHoraapertura();
            taquilla.maquinaTarjeta = new HashSet<>();
            taquilla.empleado = new HashSet<>();
            taquilla.factura = new HashSet<>();
        });

        apply((SaldoMaquinaAgregado event)->{
            var maquinaSaldoId = event.getMaquinatarjetaid();
            var maquinaSaldo =new MaquinaTarjeta(maquinaSaldoId,event.getUsuario(), event.getSaldo());
            taquilla.maquinaTarjeta = (Set<MaquinaTarjeta>) maquinaSaldo;
        });

        apply((FacturaTaquillaMostrada event)->{
            var facturaId = event.getFacturaid();
            var facturaTaquilla =new Factura(facturaId, event.getMonto());
            taquilla.factura = (Set<Factura>) facturaTaquilla;
        });




    }
}
