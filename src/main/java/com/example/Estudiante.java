package com.example;

public class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    // Constructor vacío
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // usamos el setter para validar
        this.promedio = promedio;
    }

    // Setter con validación
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida, se asigna 0.");
            this.edad = 0;
        }
    }

    // Getter de edad
    public int getEdad() {
        return edad;
    }

    // Método lógico: ¿ha aprobado?
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Promedio: " + promedio);
        System.out.println(haAprobado() ? "Estado: APROBADO" : "Estado: REPROBADO");
    }
}
