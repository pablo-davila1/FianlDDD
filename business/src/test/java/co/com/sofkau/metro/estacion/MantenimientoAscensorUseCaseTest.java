package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.commands.MantenimientoAscensor;
import co.com.sofkau.metro.estacion.events.EmpleadoAgregado;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.events.MantenimientoAscensorHecho;
import co.com.sofkau.metro.estacion.values.AscensorId;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.PesoMax;
import co.com.sofkau.metro.estacion.values.Referencia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MantenimientoAscensorUseCaseTest {

    @InjectMocks
    private MantenimientoAscensorUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  MantenimientoAscensorHappyPass(){
        //arrange
        var estacionId = EstacionId.of("hhh");
        var ascensorId = AscensorId.of("xxx");
        var pesoMax = new PesoMax("67");
        var command = new MantenimientoAscensor(estacionId,ascensorId,pesoMax);

        when(repository.getEventsBy("hhh")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getAscensorid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (MantenimientoAscensorHecho)events.get(0);
        Assertions.assertEquals("67", event.getPesomax().value());

    }

    private List<DomainEvent> history() {
        var referencia = new Referencia("DDD");
        var event = new EstacionCreada(
                referencia);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }
}
