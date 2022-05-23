package co.com.sofkau.metro.taquilla.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.taquilla.values.*;

public class SaldoMaquinaAgregado extends DomainEvent {
    private final MaquinaTarjetaId maquinatarjetaid;
    private final Usuario usuario;
    private final Saldo saldo;

    public SaldoMaquinaAgregado(MaquinaTarjetaId maquinatarjetaid, Usuario usuario, Saldo saldo) {
        super("co.com.sofkau.metro.taquilla.events.SaldoMaquinaAgregado");
        this.maquinatarjetaid = maquinatarjetaid;
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public MaquinaTarjetaId getMaquinatarjetaid() {
        return maquinatarjetaid;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Saldo getSaldo() {
        return saldo;
    }
}
