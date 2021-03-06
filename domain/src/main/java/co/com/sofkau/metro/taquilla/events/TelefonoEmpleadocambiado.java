package co.com.sofkau.metro.taquilla.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.taquilla.values.EmpleadosTaquillaId;
import co.com.sofkau.metro.taquilla.values.NombreTaquilla;
import co.com.sofkau.metro.taquilla.values.TelefonoTaquilla;

public class TelefonoEmpleadocambiado extends DomainEvent {
    private final EmpleadosTaquillaId empleadostaquillaid;
    private final NombreTaquilla nombretaquilla;

    //Para settiar
    public void setTelefonotaquilla(TelefonoTaquilla telefonotaquilla) {
        this.telefonotaquilla = telefonotaquilla;
    }

    private  TelefonoTaquilla telefonotaquilla;

    public TelefonoEmpleadocambiado( EmpleadosTaquillaId empleadostaquillaid, NombreTaquilla nombretaquilla, TelefonoTaquilla telefonotaquilla) {
        super("co.com.sofkau.metro.taquilla.events.TelefonoEmpleadocambiado");
        this.empleadostaquillaid = empleadostaquillaid;
        this.nombretaquilla = nombretaquilla;
        this.telefonotaquilla = telefonotaquilla;
    }

    public EmpleadosTaquillaId getEmpleadostaquillaid() {
        return empleadostaquillaid;
    }

    public NombreTaquilla getNombretaquilla() {
        return nombretaquilla;
    }

    public TelefonoTaquilla getTelefonotaquilla() {
        return telefonotaquilla;
    }
}
