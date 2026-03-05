package com.example;

public class ArreglosBidimensionales {
    public static void mostrarEjemplos() {
        int[][] matriz = {
            {1, 2},
            {3, 4}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
