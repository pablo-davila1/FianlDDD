package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.estacion.commands.MantenimientoAscensor;

public class MantenimientoAscensorUseCase extends UseCase<RequestCommand<MantenimientoAscensor>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<MantenimientoAscensor> mantenimientoAscensorRequestCommand) {
        var command = mantenimientoAscensorRequestCommand.getCommand();

        var estacion = Estacion.from(
                command.getEstacionid(),repository().getEventsBy(command.getEstacionid().value())
        );

        estacion.mantenimientoAsensor(command.getPesomax());
        emit().onResponse(new ResponseEvents(estacion.getUncommittedChanges()));


    }
}
