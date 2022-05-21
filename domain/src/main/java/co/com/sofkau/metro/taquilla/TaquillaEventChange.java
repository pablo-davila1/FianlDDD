package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;

import java.util.HashSet;

public class TaquillaEventChange extends EventChange {
    public TaquillaEventChange(Taquilla taquilla){
        apply((TaquillaCreada event)->{
            taquilla.horaapertura = event.getHoraapertura();
            taquilla.maquinaTarjeta = new HashSet<>();
            taquilla.empleado = new HashSet<>();
            taquilla.factura = new HashSet<>();
        });
    }
}
