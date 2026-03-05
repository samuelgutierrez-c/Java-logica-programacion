package com.example;

public class ClasesObjetos {
    public static void mostrarEjemplos() {
        // Crear objetos Persona
        Persona p1 = new Persona("Samuel", 20);
        Persona p2 = new Persona("Ana", 15);

        // Mostrar información
        p1.mostrarInformacion();
        p2.mostrarInformacion();

        // Usar método esMayorDeEdad
        System.out.println("¿Samuel es mayor de edad? " + p1.esMayorDeEdad());
        System.out.println("¿Ana es mayor de edad? " + p2.esMayorDeEdad());
    }
}
