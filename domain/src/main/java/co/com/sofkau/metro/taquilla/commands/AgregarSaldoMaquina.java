package co.com.sofkau.metro.taquilla.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofkau.metro.taquilla.values.Saldo;
import co.com.sofkau.metro.taquilla.values.Usuario;

public class AgregarSaldoMaquina extends Command {
    private Usuario usuario;
    private Saldo saldo;

    public AgregarSaldoMaquina(Usuario usuario, Saldo saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
