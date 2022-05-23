package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.estacion.commands.MantenimientoTorniquete;
import co.com.sofkau.metro.taquilla.commands.AgregarSaldoMaquina;

public class AgregarSaldoMaquinaUseCase extends UseCase<RequestCommand<AgregarSaldoMaquina>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarSaldoMaquina> agregarSaldoMaquinaRequestCommand) {
        var command = agregarSaldoMaquinaRequestCommand.getCommand();

        var taquilla = Taquilla.from(
                command.getTaquillaid(),repository().getEventsBy(command.getTaquillaid().value())
        );

        taquilla.agregarSaldo(command.getUsuario(),command.getSaldo());
        emit().onResponse(new ResponseEvents(taquilla.getUncommittedChanges()));

    }
}
