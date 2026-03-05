package com.example;

public class Bucles {
    public static void mostrarEjemplos() {
        // Bucle for
        System.out.println("Ejemplo de for:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteración: " + i);
        }

        // Bucle while
        System.out.println("\nEjemplo de while:");
        int j = 1;
        while (j <= 5) {
            System.out.println("Iteración: " + j);
            j++;
        }

        // Bucle do-while
        System.out.println("\nEjemplo de do-while:");
        int k = 1;
        do {
            System.out.println("Iteración: " + k);
            k++;
        } while (k <= 5);
    }
}
