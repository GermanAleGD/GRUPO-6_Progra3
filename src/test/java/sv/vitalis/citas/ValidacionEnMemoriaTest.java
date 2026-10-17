package sv.vitalis.citas;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDateTime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidacionEnMemoriaTest {

    private static final LocalDateTime FRANJA = LocalDateTime.of(2026, 10, 20, 9, 0);
    private EstrategiaValidacion estrategia;

    @BeforeEach
    void preparar() {
        estrategia = new ValidacionEnMemoria();
    }

    @Test
    void aceptaUnaCitaEnFranjaLibre() {
        assertTrue(estrategia.reservar(Cita.programada(1, 10, FRANJA)));
        assertEquals(1, estrategia.totalActivas());
    }

    @Test
    void rechazaDosCitasDelMismoMedicoEnLaMismaFranja() { // RN1
        assertTrue(estrategia.reservar(Cita.programada(1, 10, FRANJA)));
        assertFalse(estrategia.reservar(Cita.programada(2, 10, FRANJA)));
        assertEquals(1, estrategia.totalActivas());
    }

    @Test
    void rechazaDosCitasDelMismoPacienteEnLaMismaFranja() { // RN2
        assertTrue(estrategia.reservar(Cita.programada(1, 10, FRANJA)));
        assertFalse(estrategia.reservar(Cita.programada(1, 11, FRANJA)));
    }

    @Test
    void permiteReservarUnaFranjaCuyaCitaFueCancelada() {
        assertTrue(estrategia.reservar(new Cita(1, 10, FRANJA, Cita.Estado.CANCELADA)));
        assertTrue(estrategia.reservar(Cita.programada(2, 10, FRANJA)));
        assertEquals(1, estrategia.totalActivas());
    }

    @Test
    void exigeFechaYHora() {
        assertThrows(IllegalArgumentException.class, () -> Cita.programada(1, 10, null));
    }
}
