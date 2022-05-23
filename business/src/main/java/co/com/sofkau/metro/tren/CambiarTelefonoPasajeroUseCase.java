package co.com.sofkau.metro.tren;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.taquilla.Taquilla;
import co.com.sofkau.metro.taquilla.commands.MostrarFacturaTaquilla;
import co.com.sofkau.metro.tren.commands.CambiarTelefonoPasajero;

public class CambiarTelefonoPasajeroUseCase  extends UseCase<RequestCommand<CambiarTelefonoPasajero>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarTelefonoPasajero> cambiarTelefonoPasajeroRequestCommand) {
        var command = cambiarTelefonoPasajeroRequestCommand.getCommand();

        var tren = Tren.from(
                command.getTrenid(),repository().getEventsBy(command.getTrenid().value())
        );

        tren.cambiarTelefonoPasajero(command.getNombrepasajero(),command.getTelefonopasajero());
        emit().onResponse(new ResponseEvents(tren.getUncommittedChanges()));
    }
}
