package co.com.sofkau.metro.estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.EmpleadosEstacion;
import co.com.sofkau.metro.estacion.Torniquete;
import co.com.sofkau.metro.estacion.values.Referencia;

import java.util.Set;

public class EstacionCreada extends DomainEvent {
    private final Referencia referencia;


    public EstacionCreada(Referencia referencia) {
        super("co.com.sofkau.metro.estacion.events.EstacionCreada");
        this.referencia = referencia;
    }

    public Referencia getReferencia() {
        return referencia;
    }

}
