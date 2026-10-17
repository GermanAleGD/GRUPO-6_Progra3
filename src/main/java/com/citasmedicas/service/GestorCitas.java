
package com.citasmedicas.service;

import com.citasmedicas.model.Cita;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GestorCitas {

    private final List<Cita> citas = new ArrayList<>();
    private int siguienteId = 1;

    public Cita registrarCita(
            String paciente,
            String medico,
            LocalDateTime fechaHora,
            String motivo) {

        if (paciente == null || paciente.isBlank()) {
            throw new IllegalArgumentException(
                    "El paciente es obligatorio.");
        }

        if (medico == null || medico.isBlank()) {
            throw new IllegalArgumentException(
                    "El médico es obligatorio.");
        }

        if (fechaHora == null ||
                !fechaHora.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException(
                    "La fecha debe ser futura.");
        }

        if (motivo == null || motivo.isBlank()) {
            throw new IllegalArgumentException(
                    "El motivo es obligatorio.");
        }

        Cita cita = new Cita(
                siguienteId++,
                paciente.trim(),
                medico.trim(),
                fechaHora,
                motivo.trim());

        citas.add(cita);
        return cita;
    }

    public List<Cita> listarCitas() {
        return new ArrayList<>(citas);
    }

    public boolean cancelarCita(int id) {
        for (Cita cita : citas) {
            if (cita.getId() == id
                    && "PROGRAMADA".equals(cita.getEstado())) {
                cita.cancelar();
                return true;
            }
        }

        return false;
    }
}
