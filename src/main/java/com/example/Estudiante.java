package com.example;

public class Estudiante extends Persona {
    private String carrera;

    // Constructor
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Llama al constructor de Persona
        this.carrera = carrera;
    }

    // Sobrescribir método mostrarInformacion
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llama al método original
        System.out.println("Carrera: " + carrera);
    }
}
