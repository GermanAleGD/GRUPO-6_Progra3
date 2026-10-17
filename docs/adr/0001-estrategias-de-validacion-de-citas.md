# ADR 0001 — Estrategias de validación de citas a comparar

Fecha: 2026-10-16 Estado: aceptada

## Contexto
Vitalis SV debe evitar citas duplicadas (RN1: un médico no tiene dos citas activas
en la misma franja; RN2: un paciente no tiene dos citas activas en la misma franja).
La regla puede aplicarse en la aplicación o en SQL Server, y la literatura indica que
las validaciones solo en la aplicación pueden fallar bajo concurrencia
(Bailis et al., 2015; Cheng et al., 2023).

## Opciones consideradas
1. A1: consulta e inserción en la aplicación, READ COMMITTED (simple, pero con condición de carrera).
2. A2: solo restricción única (índice único filtrado) en SQL Server.
3. A3: híbrida, consulta previa más restricción única como respaldo.
4. A4: consulta e inserción en la aplicación con transacción SERIALIZABLE.

## Decisión
Se implementan las cuatro detrás de la interfaz `EstrategiaValidacion` y se compararán
experimentalmente (integridad, tiempo de respuesta, memoria, interbloqueos). En esta
entrega solo existe la implementación en memoria como esqueleto con pruebas.

## Consecuencias
El código de acceso a datos queda desacoplado de la estrategia, lo que permite medir
cada una en igualdad de condiciones. Aumenta el trabajo de implementación y de pruebas.
