package com.example;

public class Arreglos {
    public static void mostrarEjemplos() {
        // Declaración de un arreglo de enteros
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Recorriendo arreglo con for:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento en posición " + i + ": " + numeros[i]);
        }

        // Arreglo de Strings
        String[] nombres = {"Samuel", "Ana", "Carlos"};

        System.out.println("\nRecorriendo arreglo con for-each:");
        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }
    }
}
