package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Variables.mostrarEjemplos();
        TiposDeDatos.mostrarEjemplos();
        Operadores.mostrarEjemplos();
        EntradaDatos.mostrarEjemplos(sc);
        Condicionales.mostrarEjemplos(sc);
        Bucles.mostrarEjemplos();
        MetodosEstaticos.mostrarEjemplos();
        Arreglos.mostrarEjemplos();
        ClasesObjetos.mostrarEjemplos();
        HerenciaPolimorfismo.mostrarEjemplos(); // Clase 10

        sc.close();
    }
}
