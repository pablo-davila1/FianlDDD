package co.com.sofkau.metro.tren.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.tren.values.Marca;
import co.com.sofkau.metro.tren.values.TrenId;

public class CrearTren extends Command {
    private TrenId trenid;
    private Marca marca;

    public CrearTren(TrenId trenid, Marca marca) {
        this.trenid = trenid;
        this.marca = marca;
    }

    public TrenId getTrenid() {
        return trenid;
    }

    public Marca getMarca() {
        return marca;
    }
}
