package co.com.sofkau.metro.estacion;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.commands.AgregarEmpleado;
import co.com.sofkau.metro.estacion.events.EmpleadoAgregado;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.values.Cargo;
import co.com.sofkau.metro.estacion.values.EstacionId;
import co.com.sofkau.metro.estacion.values.NombreEstacion;
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

public class AgregarEmpleadoUseCaseTest  {
    @InjectMocks
    private AgregarEmpleadoUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void AgregarEmpleadoHappyPass(){
        //arrange
        var estacionId =EstacionId.of("xxx");
        var nombre =new NombreEstacion("Caribe");
        var cargo = new Cargo("recepcion");
        var command= new AgregarEmpleado(estacionId,nombre,cargo);

        when(repository.getEventsBy("xxx")).thenReturn(history());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getEstacionid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (EmpleadoAgregado)events.get(0);
        Assertions.assertEquals("Caribe", event.getNombreestacion().value());
        Assertions.assertEquals("recepcion", event.getCargo().value());

    }

    private List<DomainEvent> history() {
        var referencia = new Referencia("DDD");
        var event = new EstacionCreada(
                referencia);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }

}
