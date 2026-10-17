package sv.vitalis.citas;

/**
 * Contrato común de las estrategias de validación de citas que se compararán
 * en el experimento (A1 a A4). Esta entrega incluye solo la implementación
 * en memoria, que sirve de esqueleto y de base para las pruebas.
 */
public interface EstrategiaValidacion {

    /**
     * Intenta registrar la cita.
     *
     * @return true si se aceptó; false si se rechazó por RN1 (médico ocupado)
     *         o RN2 (paciente con otra cita activa en la misma franja).
     */
    boolean reservar(Cita cita);

    /** Cantidad de citas activas registradas. */
    int totalActivas();
}
