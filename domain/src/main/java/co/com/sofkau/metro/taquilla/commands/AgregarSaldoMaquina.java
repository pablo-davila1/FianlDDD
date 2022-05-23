package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.values.Saldo;
import co.com.sofkau.metro.taquilla.values.TaquillaId;
import co.com.sofkau.metro.taquilla.values.Usuario;

public class AgregarSaldoMaquina extends Command {
    private TaquillaId taquillaid;
    private Usuario usuario;
    private Saldo saldo;

    public AgregarSaldoMaquina(TaquillaId taquillaid, Usuario usuario, Saldo saldo) {
        this.taquillaid = taquillaid;
        this.usuario = usuario;
        this.saldo = saldo;
    }


    public TaquillaId getTaquillaid() {
        return taquillaid;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
