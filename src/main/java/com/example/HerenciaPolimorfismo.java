package com.example;

public class HerenciaPolimorfismo {
    public static void mostrarEjemplos() {
        Persona p1 = new Persona("Carlos", 25);
        Estudiante e1 = new Estudiante("Samuel", 20, "Desarrollo de Software");

        // Polimorfismo: una referencia de tipo Persona puede apuntar a un Estudiante
        Persona p2 = new Estudiante("Ana", 22, "Ingeniería Industrial");

        System.out.println("\n--- Persona ---");
        p1.mostrarInformacion();

        System.out.println("\n--- Estudiante ---");
        e1.mostrarInformacion();

        System.out.println("\n--- Polimorfismo ---");
        p2.mostrarInformacion(); // Aunque es Persona, ejecuta el método de Estudiante
    }
}
