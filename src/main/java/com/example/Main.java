package com.example;

public class Main {
    public static void main(String[] args) {
        // ----- Product -----
        Product p1 = new Product("P001", "Laptop", 1200.0, 50);
        Product p2 = new Product("P002", "Mouse", 25.5, 200);

        // Modificar atributos con setters
        p1.setPrice(1100.0);
        p2.setStock(180);

        // Imprimir atributos con getters
        System.out.println("Producto 1: " + p1.getName() + " - Precio: " + p1.getPrice());
        System.out.println("Producto 2: " + p2.getName() + " - Stock: " + p2.getStock());

        // Usar toString
        System.out.println(p1);
        System.out.println(p2);

        // ----- Libro -----
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("Cien años de soledad", "Gabriel García Márquez");
        Libro libro3 = new Libro("El Principito", "Antoine de Saint-Exupéry", 120);

        libro1.mostrarDetalles();
        libro2.mostrarDetalles();
        libro3.mostrarDetalles();

        // ----- CuentaBancaria -----
        CuentaBancaria cuenta = new CuentaBancaria("Samuel", 500);
        cuenta.depositar(200);
        cuenta.retirar(100);
        cuenta.retirar(700); // error esperado

        // ----- Estudiante -----
        Estudiante est1 = new Estudiante("Laura", 20, 4.2);
        Estudiante est2 = new Estudiante("Carlos", -5, 2.8);

        est1.mostrarInfo();
        est2.mostrarInfo();
    }
}

