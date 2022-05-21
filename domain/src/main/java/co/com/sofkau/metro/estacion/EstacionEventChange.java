package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.metro.estacion.events.EstacionCreada;

import java.util.HashSet;

public class EstacionEventChange extends EventChange {

    public EstacionEventChange(Estacion estacion) {
        apply((EstacionCreada event) -> {
            estacion.referencia = event.getReferencia();
            estacion.torniquete =new HashSet<>();
            estacion.ascensor =new HashSet<>();
            estacion.empleados = new HashSet<>();
        });
    }
}
