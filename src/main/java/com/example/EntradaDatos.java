package com.example;

import java.util.Scanner;

public class EntradaDatos {
    public static void mostrarEjemplos(Scanner sc) {
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su salario: ");
        double salario = sc.nextDouble();

        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);
        System.out.println("Salario ingresado: " + salario);
    }
}
