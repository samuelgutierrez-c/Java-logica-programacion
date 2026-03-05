package com.example;

public class ManipulacionCadenas {
    public static void mostrarEjemplos() {
        String texto = "Hola Mundo";
        System.out.println("Longitud: " + texto.length());
        System.out.println("Mayúsculas: " + texto.toUpperCase());
        System.out.println("Subcadena: " + texto.substring(0, 4));
    }
}
