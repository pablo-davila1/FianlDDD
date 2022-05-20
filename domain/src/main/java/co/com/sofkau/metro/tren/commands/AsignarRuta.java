package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.NombreConductor;
import co.com.sofkau.metro.tren.values.Ruta;

public class AsignarRuta extends Command {
    private NombreConductor nombreonductor;
    private Ruta ruta;

    public AsignarRuta(NombreConductor nombreonductor, Ruta ruta) {
        this.nombreonductor = nombreonductor;
        this.ruta = ruta;
    }

    public NombreConductor getNombreonductor() {
        return nombreonductor;
    }

    public Ruta getRuta() {
        return ruta;
    }
}
