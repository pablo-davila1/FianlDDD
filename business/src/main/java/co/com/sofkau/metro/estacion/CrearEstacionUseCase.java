package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.estacion.commands.CrearEstacion;

public class CrearEstacionUseCase extends UseCase<RequestCommand<CrearEstacion>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearEstacion> crearEstacionRequestCommand) {
        var command =crearEstacionRequestCommand.getCommand();

        var estacion = new Estacion(
            command.getEstacionid(),
            command.getReferencia()
        );

    emit().onResponse(new ResponseEvents(estacion.getUncommittedChanges()));
    }
}
