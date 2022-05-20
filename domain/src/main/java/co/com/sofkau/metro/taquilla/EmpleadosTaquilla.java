package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.taquilla.values.EmpleadosTaquillaId;
import co.com.sofkau.metro.taquilla.values.NombreTaquilla;
import co.com.sofkau.metro.taquilla.values.TelefonoTaquilla;

public class EmpleadosTaquilla extends Entity<EmpleadosTaquillaId> {
    protected NombreTaquilla nombretaquilla;
    protected TelefonoTaquilla telefonotaquilla;
    public EmpleadosTaquilla(EmpleadosTaquillaId entityId) {
        super(entityId);
    }

    public NombreTaquilla getNombretaquilla() {
        return nombretaquilla;
    }

    public TelefonoTaquilla getTelefonotaquilla() {
        return telefonotaquilla;
    }
}
