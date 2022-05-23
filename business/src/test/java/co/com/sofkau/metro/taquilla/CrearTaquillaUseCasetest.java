package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.metro.estacion.CrearEstacionUseCase;
import co.com.sofkau.metro.taquilla.commands.CrearTaquilla;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.taquilla.values.HoraApertura;
import co.com.sofkau.metro.taquilla.values.TaquillaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrearTaquillaUseCasetest {
    private CrearTaquillaUseCase useCase;

    @BeforeEach
    public void setup() {useCase = new CrearTaquillaUseCase();}

    @Test
    public void CrearTaquillaHappyPass(){
        //arrange
        var taquillaid = TaquillaId.of("xxx");
        var hora = new HoraApertura("DDD");
        var command = new CrearTaquilla(taquillaid,hora);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        var taquillacreada = (TaquillaCreada)events.get(0);
        Assertions.assertEquals("xxx", taquillacreada.aggregateRootId());
        Assertions.assertEquals("DDD", taquillacreada.getHoraapertura().value());

    }

}
