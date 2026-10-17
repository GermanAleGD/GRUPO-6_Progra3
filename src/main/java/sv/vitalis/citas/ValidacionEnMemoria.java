package sv.vitalis.citas;

import java.util.ArrayList;
import java.util.List;

/**
 * Validación en la capa de aplicación (comprobar y luego insertar), sin base de datos.
 * Es sincronizada para que las pruebas unitarias sean deterministas; las versiones
 * con JDBC (A1 a A4) se implementarán sobre la misma interfaz.
 */
public class ValidacionEnMemoria implements EstrategiaValidacion {

    private final List<Cita> citas = new ArrayList<>();

    @Override
    public synchronized boolean reservar(Cita cita) {
        for (Cita existente : citas) {
            if (!existente.activa() || !existente.fechaHora().equals(cita.fechaHora())) {
                continue;
            }
            boolean medicoOcupado = existente.idMedico() == cita.idMedico();       // RN1
            boolean pacienteOcupado = existente.idPaciente() == cita.idPaciente(); // RN2
            if (medicoOcupado || pacienteOcupado) {
                return false;
            }
        }
        citas.add(cita);
        return true;
    }

    @Override
    public synchronized int totalActivas() {
        return (int) citas.stream().filter(Cita::activa).count();
    }
}
