package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.taquilla.commands.CambiarTelefonoEmpleado;

public class CambiarTelefonoEmpleadoUseCase extends UseCase<RequestCommand<CambiarTelefonoEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CambiarTelefonoEmpleado> cambiarTelefonoEmpleadoRequestCommand) {
        var command = cambiarTelefonoEmpleadoRequestCommand.getCommand();

        var taquilla = Taquilla.from(
                command.getTaquillaid(),repository().getEventsBy(command.getTaquillaid().value())
        );


        emit().onResponse(new ResponseEvents(taquilla.getUncommittedChanges()));


    }
}
