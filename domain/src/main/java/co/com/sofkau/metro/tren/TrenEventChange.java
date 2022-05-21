package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.metro.taquilla.Taquilla;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.tren.events.TrenCreado;

import java.util.HashSet;

public class TrenEventChange extends EventChange {
    public TrenEventChange(Tren tren){
        apply((TrenCreado event)->{
            tren.conductor = new HashSet<>();
            tren.pasajero = new HashSet<>();
            tren.mecanico = new HashSet<>();
            tren.marca = event.getMarca();
        });
    }
    /*
       protected Set<Conductor> conductor;
    protected Set<Pasajero> pasajero;
    protected Set<Mecanico>mecanico;
    protected Marca marca;
     */
}
