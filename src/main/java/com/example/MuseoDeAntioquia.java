package com.example;

public class MuseoDeAntioquia implements EspacioCultural {
    @Override
    public void mostrarHorario() {
        System.out.println("Horario: 10:00 AM - 5:00 PM");
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return "Boleta pagada";
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: Observando las obras de Fernando Botero...");
    }
}
