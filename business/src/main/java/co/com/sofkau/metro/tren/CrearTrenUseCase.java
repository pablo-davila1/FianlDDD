package co.com.sofkau.metro.tren;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofkau.metro.taquilla.commands.CrearTaquilla;
import co.com.sofkau.metro.tren.commands.CrearTren;

public class CrearTrenUseCase extends UseCase<RequestCommand<CrearTren>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearTren> crearTrenRequestCommand) {
        var command = crearTrenRequestCommand.getCommand();

        var tren=new Tren(
                command.getTrenid(),
                command.getMarca()
        );
        emit().onResponse(new ResponseEvents(tren.getUncommittedChanges()));
    }
}
