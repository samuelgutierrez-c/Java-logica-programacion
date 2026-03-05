package com.example;

import java.util.Scanner;

public class EntradaDeDatos {
    public static void mostrarEjemplos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola, " + nombre);
    }
}
