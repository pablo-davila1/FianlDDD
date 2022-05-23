package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.metro.estacion.commands.CrearEstacion;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.Referencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrearEstacionUseCaseTest {
    private CrearEstacionUseCase useCase;

    @BeforeEach
    public void setup() {useCase = new CrearEstacionUseCase();}

    @Test
    public void CrearEstacionHappyPass(){
        //arrange
        var estacionId= EstacionId.of("xxx");
        var referenci = new Referencia("DDD");
        var command = new CrearEstacion(estacionId,referenci);

        //act
        var events=UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //asserts
        var estacionCreada =(EstacionCreada)events.get(0);
        Assertions.assertEquals("xxx", estacionCreada.aggregateRootId());
        Assertions.assertEquals("DDD", estacionCreada.getReferencia().value());
    }
}
