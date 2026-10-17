package sv.vitalis.citas;

import java.time.LocalDateTime;

/**
 * Cita médica. Una cita está activa mientras su estado no sea CANCELADA.
 */
public record Cita(int idPaciente, int idMedico, LocalDateTime fechaHora, Estado estado) {

    public enum Estado { PROGRAMADA, ATENDIDA, CANCELADA }

    public Cita {
        if (fechaHora == null) {
            throw new IllegalArgumentException("La fecha y hora son obligatorias");
        }
        if (estado == null) {
            estado = Estado.PROGRAMADA;
        }
    }

    public static Cita programada(int idPaciente, int idMedico, LocalDateTime fechaHora) {
        return new Cita(idPaciente, idMedico, fechaHora, Estado.PROGRAMADA);
    }

    public boolean activa() {
        return estado != Estado.CANCELADA;
    }
}
