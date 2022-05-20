package co.com.sofkau.metro.tren.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.values.ConductorId;
import co.com.sofkau.metro.tren.values.NombreConductor;
import co.com.sofkau.metro.tren.values.Ruta;

public class RutaAsignada extends DomainEvent {
    private final ConductorId conductorid;
    private final NombreConductor nombreonductor;
    private final Ruta ruta;

    public RutaAsignada(String type, ConductorId conductorid, NombreConductor nombreonductor, Ruta ruta) {
        super("co.com.sofkau.metro.tren.events.RutaAsignada");
        this.conductorid = conductorid;
        this.nombreonductor = nombreonductor;
        this.ruta = ruta;
    }

    public ConductorId getConductorid() {
        return conductorid;
    }

    public NombreConductor getNombreonductor() {
        return nombreonductor;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
