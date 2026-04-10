package com.example;

public class CuentaBancaria {
    private String titular;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido, se asigna 0.");
        }
    }

    // Getter del titular
    public String getTitular() {
        return titular;
    }

    // Getter del saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso: $" + monto);
        } else {
            System.out.println("Monto inválido.");
        }
    }

    // Método para retirar
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso: $" + monto);
        } else {
            System.out.println("Fondos insuficientes o monto inválido.");
        }
    }
}