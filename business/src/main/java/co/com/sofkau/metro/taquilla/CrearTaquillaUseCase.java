package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.taquilla.commands.CrearTaquilla;

public class CrearTaquillaUseCase extends UseCase<RequestCommand<CrearTaquilla>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearTaquilla> crearTaquillaRequestCommand) {
        var command = crearTaquillaRequestCommand.getCommand();

        var taquilla = new Taquilla(
                command.getTaquillaid(),
                command.getHoraapertura()
        );

        emit().onResponse(new ResponseEvents(taquilla.getUncommittedChanges()));

    }
}
