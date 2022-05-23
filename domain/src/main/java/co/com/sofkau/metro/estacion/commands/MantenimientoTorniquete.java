package co.com.sofkau.metro.estacion.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.estacion.values.Registro;

public class MantenimientoTorniquete extends Command {
    private Registro registro;

    public MantenimientoTorniquete( Registro registro) {
        this.registro = registro;
    }

    public Registro getRegistro() {
        return registro;
    }
}
