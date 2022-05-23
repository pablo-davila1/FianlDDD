package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.estacion.MantenimientoTorniqueteUseCase;
import co.com.sofkau.metro.estacion.events.EstacionCreada;
import co.com.sofkau.metro.estacion.events.MantenimientoTorniqueteHecho;
import co.com.sofkau.metro.estacion.values.Referencia;
import co.com.sofkau.metro.taquilla.commands.AgregarSaldoMaquina;
import co.com.sofkau.metro.taquilla.events.SaldoMaquinaAgregado;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.taquilla.values.HoraApertura;
import co.com.sofkau.metro.taquilla.values.Saldo;
import co.com.sofkau.metro.taquilla.values.TaquillaId;
import co.com.sofkau.metro.taquilla.values.Usuario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AgregarSaldoMaquinaUseCaseTest {
    @InjectMocks
    private AgregarSaldoMaquinaUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  AgregarSaldoMaquinaHappyPass(){

        var taquillaId = TaquillaId.of("xxx");
        var usuario = new Usuario("Juan");
        var saldo = new Saldo("");
        var command = new AgregarSaldoMaquina(taquillaId,usuario,saldo);

        when(repository.getEventsBy("xxx")).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getTaquillaid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var event = (SaldoMaquinaAgregado)events.get(0);
        Assertions.assertEquals("Juan", event.getUsuario().value());

    }
    private List<DomainEvent> history() {
        var horaapertura = new HoraApertura("DDD");
        var event = new TaquillaCreada(
                horaapertura);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }
}
