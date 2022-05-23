package co.com.sofkau.metro.estacion.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.values.Referencia;

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
