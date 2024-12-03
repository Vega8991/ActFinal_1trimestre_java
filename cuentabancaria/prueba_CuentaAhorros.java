package cuentabancaria;

public class prueba_CuentaAhorros {

	public static void main(String[] args) {
		// Crear una cuenta de ahorros con saldo inicial 8000 y tasa anual 3%
		Cuenta_Ahorros cuenta = new Cuenta_Ahorros(8000, 1.5f);

		// Usamos el extracto dos veces para que la cuenta supere los 10000 y se quede activa
		cuenta.extracto();
		cuenta.extracto();
		cuenta.imprimir();
		System.out.println("\n");

		// Consignamos un monto
		cuenta.consignar(3000);

		// Retiramos un monto
		cuenta.retirar(2000);
		System.out.println("\n");
		cuenta.imprimir();
	}
}
