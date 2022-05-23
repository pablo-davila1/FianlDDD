package co.com.sofkau.metro.tren;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.tren.commands.CambiarTelefonoPasajero;
import co.com.sofkau.metro.tren.commands.ModificarTelefonoMecanico;

public class ModificarTelefonoMecanicoUseCase extends UseCase<RequestCommand<ModificarTelefonoMecanico>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ModificarTelefonoMecanico> modificarTelefonoMecanicoRequestCommand) {
        var command = modificarTelefonoMecanicoRequestCommand.getCommand();
        var tren = Tren.from(
                command.getTrenid(),repository().getEventsBy(command.getTrenid().value())
        );
        tren.modificarTelefonomecanico(command.getNombremecanico(),command.getTelefonomecanico());
        emit().onResponse(new ResponseEvents(tren.getUncommittedChanges()));

    }
}
