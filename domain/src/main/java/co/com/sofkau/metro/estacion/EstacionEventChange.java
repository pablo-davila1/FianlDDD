package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.EventChange;
import co.com.sofkau.metro.estacion.commands.MantenimientoTorniquete;
import co.com.sofkau.metro.estacion.events.EmpleadoAgregado;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.events.MantenimientoAscensorHecho;
import co.com.sofkau.metro.estacion.events.MantenimientoTorniqueteHecho;
import co.com.sofkau.metro.estacion.values.EmpleadosEstacionId;
import co.com.sofkau.metro.estacion.values.Registro;
import co.com.sofkau.metro.estacion.values.TorniqueteId;

import java.util.HashSet;
import java.util.Set;

public class EstacionEventChange extends EventChange {

    public EstacionEventChange(Estacion estacion) {
        apply((EstacionCreada event) -> {
            estacion.referencia = event.getReferencia();
            estacion.torniquete =new HashSet<>();
            estacion.ascensor =new HashSet<>();
            estacion.empleados = new HashSet<>();
        });

        apply((EmpleadoAgregado event)->{
            var empleadoEstacionId = event.getEmpleadosestacionid();
            var empleadoEstacion =new EmpleadosEstacion(empleadoEstacionId, event.getNombreestacion(),event.getCargo());
            estacion.empleados = (Set<EmpleadosEstacion>) empleadoEstacion;
        });

        apply((MantenimientoAscensorHecho event)->{
            var ascensorId = event.getAscensorid();
            var ascensor =new Ascensor(ascensorId, event.getPesomax());
            estacion.ascensor = (Set<Ascensor>) ascensorId;
        });

        apply((MantenimientoTorniqueteHecho event)->{
            var torniqueteId = event.getTorniqueteid();
            var torniquete =new Torniquete(torniqueteId, event.getRegistro());
            estacion.torniquete = (Set<Torniquete>) torniqueteId;
        });



    }

}
