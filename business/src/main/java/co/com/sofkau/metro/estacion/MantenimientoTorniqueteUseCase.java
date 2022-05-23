package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.estacion.commands.MantenimientoAscensor;
import co.com.sofkau.metro.estacion.commands.MantenimientoTorniquete;

public class MantenimientoTorniqueteUseCase  extends UseCase<RequestCommand<MantenimientoTorniquete>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<MantenimientoTorniquete> mantenimientoTorniqueteRequestCommand) {
        var command = mantenimientoTorniqueteRequestCommand.getCommand();

        var estacion = Estacion.from(
                command.getEstacionid(),repository().getEventsBy(command.getEstacionid().value())
        );

        estacion.mantenimientoTorniquete(command.getRegistro());
        emit().onResponse(new ResponseEvents(estacion.getUncommittedChanges()));
    }
}
