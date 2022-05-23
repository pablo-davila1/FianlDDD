package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofkau.metro.taquilla.commands.MostrarFacturaTaquilla;
import co.com.sofkau.metro.taquilla.events.FacturaTaquillaMostrada;
import co.com.sofkau.metro.taquilla.events.SaldoMaquinaAgregado;
import co.com.sofkau.metro.taquilla.events.TaquillaCreada;
import co.com.sofkau.metro.taquilla.values.HoraApertura;
import co.com.sofkau.metro.taquilla.values.Monto;
import co.com.sofkau.metro.taquilla.values.TaquillaId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MostrarFacturaTaquillaUseCseTest {
    @InjectMocks
    private MostrarFacturaTaquillaUseCse useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  MostrarFacturaTaquillaHappyPass(){
        //TaquillaId taquillaid, Monto monto
        var taquillaid = TaquillaId.of("xxx");
        var monto = new Monto("50");
        var command = new MostrarFacturaTaquilla(taquillaid,monto);

        when(repository.getEventsBy("xxx")).thenReturn(history());
        useCase.addRepository(repository);

        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(command.getTaquillaid().value())
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();
        //assert
        var event = (FacturaTaquillaMostrada)events.get(0);
        Assertions.assertEquals("50", event.getMonto().value());

    }

    private List<DomainEvent> history() {
        var horaapertura = new HoraApertura("DDD");
        var event = new TaquillaCreada(
                horaapertura);
        event.setAggregateRootId("xxxxx");
        return List.of(event);
    }
}
