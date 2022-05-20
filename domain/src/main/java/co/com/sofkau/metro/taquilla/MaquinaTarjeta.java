package co.com.sofkau.metro.taquilla;

import co.com.sofka.domain.generic.Entity;
import co.com.sofkau.metro.taquilla.values.MaquinaTarjetaId;
import co.com.sofkau.metro.taquilla.values.Saldo;
import co.com.sofkau.metro.taquilla.values.Usuario;

public class MaquinaTarjeta extends Entity<MaquinaTarjetaId> {
    protected Usuario usuario;
    protected Saldo saldo;
    public MaquinaTarjeta(MaquinaTarjetaId entityId) {
        super(entityId);
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }
}
