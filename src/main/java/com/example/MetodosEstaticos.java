package com.example;

public class MetodosEstaticos {
    // Método estático que recibe dos números y devuelve la suma
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método estático que recibe dos números y devuelve el mayor
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Método estático que imprime un saludo
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    // Método para mostrar ejemplos
    public static void mostrarEjemplos() {
        System.out.println("Suma de 5 + 3 = " + sumar(5, 3));
        System.out.println("Mayor entre 10 y 7 = " + mayor(10, 7));
        saludar("Samuel");
    }
}
