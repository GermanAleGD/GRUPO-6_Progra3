package com.citasmedicas.model;
import java.time.LocalDateTime;

public class Cita {
    private int id;
    private String nombrePaciente;
    private String nombreMedico;
    private LocalDateTime fechaHora;
    private String motivo;
    private String estado;
    public Cita(int id, String nombrePaciente,
                String nombreMedico,
                LocalDateTime fechaHora, String motivo) {
        this.id = id;
        this.nombrePaciente = nombrePaciente;
        this.nombreMedico = nombreMedico;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.estado = "PROGRAMADA";
    }

    public int getId() {
        return id;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void cancelar() {
        estado = "CANCELADA";
    }
}
