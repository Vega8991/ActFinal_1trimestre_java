package cuentabancaria;

public class Cuenta {

	// Declaramos los atributos
	protected float saldo;
	protected int numConsign = 0;
	protected int numRetiros = 0;
	protected float tasaAnual;
	protected float comMensual = 0;

	// Hacemos el constructor
	public Cuenta(float saldo, float tasa_anual) {
		this.saldo = saldo;
		this.tasaAnual = tasa_anual;
	}

	// Creamos el metdodo para ingresar dinero
	public void consignar(float cantidad) {
		if (cantidad == 0) {
			System.err.println("No se puede anadir 0 a tu cuenta bancaria");
		} else {
			saldo += cantidad;
			System.out.println("Saldo anadido. Saldo actual: " + saldo + "€");
		}
		numConsign ++;
	}

	// Creamos el metodo para retirar dinero
	public void retirar(float cantidad) {
		if (cantidad == 0) {
			System.err.println("No se puede retirar 0 a tu cuenta bancaria");
		} else {
			saldo -= cantidad;
			System.out.println("Saldo retirado. Saldo actual: " + saldo + "€");
		}
		numRetiros ++;
	}

	// Hacemos el calculo del interes mensual
	public void calcularInteres() {
		float tasaMensual = tasaAnual / 12;
		float interesMensual = saldo * tasaMensual;
		saldo += interesMensual;
	}

	// Creamos el metodo para el extracto mensual
	public void extracto() {
		saldo -= comMensual;
		calcularInteres();
	}

	// Imprimimos los valores por pantalla con este metodo
	public void imprimir() {
		System.out.println("Saldo: " + saldo);
		System.out.println("Numero de consignaciones: " + numConsign);
		System.out.println("Numero de retiros: " + numRetiros);
		System.out.println("Tasa anual: " + tasaAnual);
		System.out.println("Comision mensual: " + comMensual);
	}

	// Compara dos cuentas para ver cual tiene mas saldo
	public static Cuenta cuentaMayor(Cuenta c1, Cuenta c2) {
		if (c1.saldo > c2.saldo) {
			return c1;
		} else {
			return c2;
		}
	}
}
