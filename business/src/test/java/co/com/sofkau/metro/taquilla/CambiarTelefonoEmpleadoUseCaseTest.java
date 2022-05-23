package co.com.sofkau.metro.taquilla;

import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofkau.metro.taquilla.commands.CambiarTelefonoEmpleado;
import co.com.sofkau.metro.taquilla.values.NombreTaquilla;
import co.com.sofkau.metro.taquilla.values.TaquillaId;
import co.com.sofkau.metro.taquilla.values.TelefonoTaquilla;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CambiarTelefonoEmpleadoUseCaseTest {
    @InjectMocks
    private CambiarTelefonoEmpleadoUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    public void  ambiarTelefonoEmpleadoHappyPass(){
        var taquillaid = TaquillaId.of("xxx");
        var nombretaquilla = new NombreTaquilla("taquillaA");
        var telefonotaquilla = new TelefonoTaquilla("12345");
        var command = new CambiarTelefonoEmpleado(taquillaid,nombretaquilla,telefonotaquilla);
    }
}
