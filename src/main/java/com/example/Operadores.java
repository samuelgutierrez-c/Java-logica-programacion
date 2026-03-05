package com.example;

public class Operadores {
    public static void mostrarEjemplos() {
        // Operadores aritméticos
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo (resto): " + (a % b));

        // Operadores de comparación
        System.out.println("¿a es mayor que b? " + (a > b));
        System.out.println("¿a es igual a b? " + (a == b));
        System.out.println("¿a es diferente de b? " + (a != b));

        // Operadores lógicos
        boolean x = true;
        boolean y = false;

        System.out.println("AND lógico: " + (x && y));
        System.out.println("OR lógico: " + (x || y));
        System.out.println("NOT lógico: " + (!x));
    }
}
