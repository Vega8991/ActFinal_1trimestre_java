package cuentabancaria;

public class Cuenta_Corriente extends Cuenta {
	// atributo sobregiro
	private float sobregiro;

	// Hacemos el constructor poniendo el super de la clase Cuenta
	public Cuenta_Corriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.sobregiro = 0;
	}

	// Hacemos el metodo para poder retirar mas de lo que tenemos, y se le anada al
	// sobregiro
	public void retirar(float cantidad) {
		if (cantidad <= saldo) {
			super.retirar(cantidad);
		} else {
			float diferencia = cantidad - saldo;
			sobregiro += diferencia;
			saldo = 0;
		}
	}

	// Creamos el metodo consignar
	public void consignar(float cantidad) {
		if (sobregiro > 0) { // Vemos si tiene alguna deuda pendiente
			if (cantidad > sobregiro) {
				saldo += (cantidad - sobregiro); // Resta el sobregiro del monto que hayamos puesto
				sobregiro = 0; // Deja el sobregiro a 0
			} else {
				sobregiro -= cantidad; // resta el sobregiro del monto
			}
		} else {
			super.consignar(cantidad); // Si queda dinero despues de pagar deudas, se anade al saldo
		}
	}

	// Hacemos el metodo imprimir con al anadido del sobregiro
	public void imprimir() {
		super.imprimir();
		System.out.println("Sobregiro: " + sobregiro);
	}
}
