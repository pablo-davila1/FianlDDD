package co.com.sofkau.metro.tren;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofkau.metro.taquilla.CrearTaquillaUseCase;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.tren.commands.CrearTren;
import co.com.sofkau.metro.tren.events.TrenCreado;
import co.com.sofkau.metro.tren.values.Marca;
import co.com.sofkau.metro.tren.values.TrenId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CrearTrenUseCaseTest {
    private CrearTrenUseCase useCase;

    @BeforeEach
    public void setup() {useCase = new CrearTrenUseCase();}

    @Test
    public void CrearTarenHappyPass(){
        var trenId = TrenId.of("xxx");
        var marca = new Marca("DDD");
        var command = new CrearTren(trenId,marca);

        //act
        var events = UseCaseHandler.getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        var trencreado = (TrenCreado)events.get(0);
        Assertions.assertEquals("xxx", trencreado.aggregateRootId());
        Assertions.assertEquals("DDD", trencreado.getMarca().value());
    }

}
