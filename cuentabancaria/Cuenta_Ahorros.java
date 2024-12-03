package cuentabancaria;

public class Cuenta_Ahorros extends Cuenta {

	// atributo para ver si la cuenta esta activa o no
	protected boolean activa;

	// constructor super que procede de la clase cuenta
	public Cuenta_Ahorros(float saldo, float tasa_anual) {
		super(saldo, tasa_anual);
		this.activa = saldo >= 10000;
	}

	// consignar si la cuenta es activa
	public void consignar(float cantidad) {
		if (activa) {
			super.consignar(cantidad);
		}
		actualizarEstado();
	}

	// retirar si la cuenta es activa
	public void retirar(float cantidad) {
		if (activa && cantidad <= saldo) {
			super.retirar(cantidad);
		}
		actualizarEstado();
	}

	// Metodo para el extracto mensual encaso de que la cuenta este activa
	public void extracto() {
		if (numRetiros > 4) {
			comMensual += (numRetiros - 4) * 1000;
		}
		super.extracto();
		actualizarEstado();
	}

	// actualizar el estado para ver si la cuenta es activa o inactiva
	public void actualizarEstado() {
		activa = saldo >= 10000;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println("Cuenta activa: " + (activa ? "Si" : "No"));
	}
}
