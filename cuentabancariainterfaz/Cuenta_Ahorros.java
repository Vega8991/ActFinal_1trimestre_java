package cuentabancariainterfaz;

//Clase que representa una cuenta de ahorros
public class Cuenta_Ahorros implements Cuenta {
	private float saldo;
	private int numConsignaciones;
	private int numRetiros;
	private float tasaAnual;
	private float comisionMensual;
	private boolean activa;

	// Constructor para inicializar la cuenta de ahorros
	public Cuenta_Ahorros(float saldoInicial, float tasaAnual) {
		this.saldo = saldoInicial;
		this.numConsignaciones = 0;
		this.numRetiros = 0;
		this.tasaAnual = tasaAnual;
		this.comisionMensual = 0;
		this.activa = saldoInicial >= 10000;
	}

	// Metodo para consignar una cantidad
	public void consignar(float cantidad) {
		if (activa) {
			saldo += cantidad;
			numConsignaciones++;
		}
		actualizarEstado();
	}

	// Metodo para retirar una cantidad
	public void retirar(float cantidad) {
		if (activa && cantidad <= saldo) {
			saldo -= cantidad;
			numRetiros++;
		}
		actualizarEstado();
	}

	// Metodo para generar el extracto mensual
	public void extracto() {
		if (numRetiros > 4) {
			comisionMensual += (numRetiros - 4) * 1000;
		}
		saldo -= comisionMensual;
		saldo += (saldo * (tasaAnual / 12));
		comisionMensual = 0;
		numRetiros = 0;
		actualizarEstado();
	}

	// Metodo para imprimir los detalles de la cuenta
	public void imprimir() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Comision mensual: " + comisionMensual);
		System.out.println("Numero de transacciones: " + (numConsignaciones + numRetiros));
		System.out.println("Cuenta activa: " + (activa ? "Si" : "No"));
	}

	// Metodo para actualizar el estado de la cuenta
	private void actualizarEstado() {
		activa = saldo >= 10000;
	}
}
