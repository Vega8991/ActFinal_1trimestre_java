package cuentabancariainterfaz;

// Clase que representa una cuenta corriente
public class Cuenta_Corriente implements Cuenta {
    private float saldo;
    private int numConsignaciones;
    private int numRetiros;
    private float tasaAnual;
    private float comisionMensual;
    private float sobregiro;

    // Constructor para inicializar la cuenta corriente
    public Cuenta_Corriente(float saldoInicial, float tasaAnual) {
        this.saldo = saldoInicial;
        this.numConsignaciones = 0;
        this.numRetiros = 0;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = 0;
        this.sobregiro = 0;
    }

    // Metodo para consignar una cantidad
    public void consignar(float cantidad) {
        if (sobregiro > 0) {
            if (cantidad >= sobregiro) {
                cantidad -= sobregiro;
                sobregiro = 0;
                saldo += cantidad;
            } else {
                sobregiro -= cantidad;
            }
        } else {
            saldo += cantidad;
        }
        numConsignaciones++;
    }

    // Metodo para retirar una cantidad
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
        } else {
            float falta = cantidad - saldo;
            saldo = 0;
            sobregiro += falta;
        }
        numRetiros++;
    }

    // Metodo para generar el extracto mensual
    public void extracto() {
        saldo -= comisionMensual;
        saldo += (saldo * (tasaAnual / 12));
        comisionMensual = 0;
    }

    // Metodo para imprimir los detalles de la cuenta
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Comision mensual: " + comisionMensual);
        System.out.println("Numero de transacciones: " + (numConsignaciones + numRetiros));
    }
}

