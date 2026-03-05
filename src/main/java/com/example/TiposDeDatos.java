package com.example;

public class TiposDeDatos {
    public static void mostrarEjemplos() {
        // Tipos primitivos en Java
        byte numeroPequeno = 100;       // Ocupa 1 byte
        short numeroCorto = 32000;      // Ocupa 2 bytes
        int numeroEntero = 100000;      // Ocupa 4 bytes
        long numeroGrande = 1000000000; // Ocupa 8 bytes

        float decimalCorto = 3.14f;     // Decimal con 4 bytes
        double decimalLargo = 3.14159265359; // Decimal con 8 bytes

        char letra = 'A';               // Un solo carácter
        boolean esVerdadero = true;     // Valores lógicos: true/false

        // Mostrar resultados en consola
        System.out.println("byte: " + numeroPequeno);
        System.out.println("short: " + numeroCorto);
        System.out.println("int: " + numeroEntero);
        System.out.println("long: " + numeroGrande);
        System.out.println("float: " + decimalCorto);
        System.out.println("double: " + decimalLargo);
        System.out.println("char: " + letra);
        System.out.println("boolean: " + esVerdadero);
    }
}
