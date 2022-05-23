package co.com.sofkau.metro.tren;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.taquilla.MostrarFacturaTaquillaUseCse;
import co.com.sofkau.metro.taquilla.events.FacturaTaquillaMostrada;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.taquilla.values.HoraApertura;
import co.com.sofkau.metro.tren.commands.CambiarTelefonoPasajero;
import co.com.sofkau.metro.tren.events.TelefonoPasajeroCambiado;
import co.com.sofkau.metro.tren.events.TrenCreado;
import co.com.sofkau.metro.tren.values.Marca;
import co.com.sofkau.metro.tren.values.NombrePasajero;
import co.com.sofkau.metro.tren.values.TelefonoPasajero;
import co.com.sofkau.metro.tren.values.TrenId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CambiarTelefonoPasajeroUseCaseTest {
    @InjectMocks
    private CambiarTelefonoPasajeroUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  CambiarTelefonoPasajeroHappyPass(){
        //TrenId trenid, NombrePasajero nombrepasajero, TelefonoPasajero telefonopasajero
        var trenid = TrenId.of("xxx");
        var nombrepasajero = new NombrePasajero("Juan");
        var telefonopasajero = new TelefonoPasajero("123");
        var command = new CambiarTelefonoPasajero(trenid,nombrepasajero,telefonopasajero);

        when(repository.getEventsBy("xxx")).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getTrenid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (TelefonoPasajeroCambiado)events.get(0);
        Assertions.assertEquals("123", event.getTelefonopasajero().value());
        Assertions.assertEquals("Juan", event.getNombrepasajero().value());

    }

    private List<DomainEvent> history() {
        var marca = new Marca("DDD");
        var event = new TrenCreado(
                marca);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }

}
