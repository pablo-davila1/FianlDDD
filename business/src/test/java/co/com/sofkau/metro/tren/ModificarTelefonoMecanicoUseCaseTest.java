package co.com.sofkau.metro.tren;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.tren.commands.ModificarTelefonoMecanico;
import co.com.sofkau.metro.tren.events.TelefonoMecanicoModificado;
import co.com.sofkau.metro.tren.events.TelefonoPasajeroCambiado;
import co.com.sofkau.metro.tren.events.TrenCreado;
import co.com.sofkau.metro.tren.values.Marca;
import co.com.sofkau.metro.tren.values.NombreMecanico;
import co.com.sofkau.metro.tren.values.TelefonoMecanico;
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
public class ModificarTelefonoMecanicoUseCaseTest {
    @InjectMocks
    private ModificarTelefonoMecanicoUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  ModificarTelefonoMecanicoHappyPass(){
        //TrenId trenid, NombreMecanico nombremecanico, TelefonoMecanico telefonomecanico
        var trenId = TrenId.of("xxx");
        var nombremecanico = new NombreMecanico("Juan");
        var telefonomecanico = new TelefonoMecanico("1234");
        var command = new ModificarTelefonoMecanico(trenId,nombremecanico,telefonomecanico);

        when(repository.getEventsBy("xxx")).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getTrenid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (TelefonoMecanicoModificado)events.get(0);
        Assertions.assertEquals("Juan", event.getNombremecanico().value());
        Assertions.assertEquals("1234", event.getTelefonomecanico().value());

    }
    private List<DomainEvent> history() {
        var marca = new Marca("DDD");
        var event = new TrenCreado(
                marca);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }
}
