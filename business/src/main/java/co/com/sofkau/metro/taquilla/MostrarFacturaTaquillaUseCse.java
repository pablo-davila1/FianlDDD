package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.taquilla.commands.CambiarTelefonoEmpleado;
import co.com.sofkau.metro.taquilla.commands.MostrarFacturaTaquilla;

public class MostrarFacturaTaquillaUseCse  extends UseCase<RequestCommand<MostrarFacturaTaquilla>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<MostrarFacturaTaquilla> mostrarFacturaTaquillaRequestCommand) {
        var command = mostrarFacturaTaquillaRequestCommand.getCommand();

        var taquilla = Taquilla.from(
                command.getTaquillaid(),repository().getEventsBy(command.getTaquillaid().value())
        );

        taquilla.mostrarFactura(command.getMonto());
        emit().onResponse(new ResponseEvents(taquilla.getUncommittedChanges()));
    }

}
