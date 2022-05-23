package co.com.sofkau.metro.tren;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.metro.tren.events.TelefonoMecanicoModificado;
import co.com.sofkau.metro.tren.events.TelefonoPasajeroCambiado;
import co.com.sofkau.metro.tren.events.TrenCreado;

import java.util.HashSet;
import java.util.Set;

public class TrenEventChange extends EventChange {
    public TrenEventChange(Tren tren){
        apply((TrenCreado event)->{
            tren.conductor = new HashSet<>();
            tren.pasajero = new HashSet<>();
            tren.mecanico = new HashSet<>();
            tren.marca = event.getMarca();
        });

        apply((TelefonoPasajeroCambiado event)->{
            var telPasajeroId = event.getPasajeroid();
            var telefonoPasajero =new Pasajero(telPasajeroId, event.getNombrepasajero(), event.getTelefonopasajero());
            tren.pasajero = (Set<Pasajero>) telPasajeroId;
        });

        apply((TelefonoMecanicoModificado event)->{
            var telMecanicoId = event.getMecanicoid();
            var telMecanico =new Mecanico(telMecanicoId, event.getNombremecanico(), event.getTelefonomecanico());
            tren.mecanico = (Set<Mecanico>) telMecanicoId;
        });



    }

}
