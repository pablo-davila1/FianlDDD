package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.commands.MantenimientoTorniquete;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.events.MantenimientoAscensorHecho;
import co.com.sofkau.metro.estacion.events.MantenimientoTorniqueteHecho;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.Referencia;
import co.com.sofkau.metro.estacion.values.Registro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)

public class MantenimientoTorniqueteUseCaseTest {
    @InjectMocks
    private MantenimientoTorniqueteUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  MantenimientoTorniqueteHappyPass(){
        var torniqueteId = EstacionId.of("xxx");
        var registro = new Registro("fichaje");
        var command = new MantenimientoTorniquete(torniqueteId,registro);

        when(repository.getEventsBy("xxx")).thenReturn(history());
        useCase.addRepository(repository);
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getEstacionid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (MantenimientoTorniqueteHecho)events.get(0);
        Assertions.assertEquals("fichaje", event.getRegistro().value());

    }

    private List<DomainEvent> history() {
        var referencia = new Referencia("DDD");
        var event = new EstacionCreada(
                referencia);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }
}
