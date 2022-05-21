package co.com.sofkau.metro.estacion;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.estacion.values.Registro;
import co.com.sofkau.metro.estacion.values.TorniqueteId;

public class Torniquete extends Entity<TorniqueteId> {
    protected Registro registro;

    public Torniquete(TorniqueteId entityId, Registro registro) {
        super(entityId);
        this.registro = registro;
    }


    public Registro getRegistro() {
        return registro;
    }


}
