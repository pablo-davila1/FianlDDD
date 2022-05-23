package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.estacion.commands.AgregarEmpleado;

public class AgregarEmpleadoUseCase  extends UseCase<RequestCommand<AgregarEmpleado>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<AgregarEmpleado> agregarEmpleadoRequestCommand) {
        var command = agregarEmpleadoRequestCommand.getCommand();

        var estacion = Estacion.from(
                command.getEstacionid(),repository().getEventsBy(command.getEstacionid().value())
        );
        estacion.AgregarEmpleadoEstacion(command.getNombreestacion(), command.getCargo());
        emit().onResponse(new ResponseEvents(estacion.getUncommittedChanges()));

    }
}
