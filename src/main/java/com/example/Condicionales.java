package com.example;

import java.util.Scanner;

public class Condicionales {
    public static void mostrarEjemplos(Scanner sc) {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        System.out.print("Ingrese un número del 1 al 3: ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste la opción 1.");
                break;
            case 2:
                System.out.println("Elegiste la opción 2.");
                break;
            case 3:
                System.out.println("Elegiste la opción 3.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}
