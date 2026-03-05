package com.example;

public class Main {
    public static void main(String[] args) {
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
    }
}
