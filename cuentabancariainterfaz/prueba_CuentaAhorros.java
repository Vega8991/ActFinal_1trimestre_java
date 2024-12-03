package cuentabancariainterfaz;

public class prueba_CuentaAhorros {

	public static void main(String[] args) {
		// Crear una cuenta de ahorros con saldo inicial 8000 y tasa anual 3%
		Cuenta_Ahorros cuenta = new Cuenta_Ahorros(8000, 1.5f);

		// Usamos el extracto dos veces para que la cuenta supere los 10000 y se quede activa
		cuenta.extracto();
		cuenta.extracto();
		cuenta.imprimir();

		// Consignamos un monto
		System.out.println("\nConsignando 3000");
		cuenta.consignar(3000);
		cuenta.imprimir();

		// Retiramos un monto
		System.out.println("\nRetirando 2000");
		cuenta.retirar(2000);
		cuenta.imprimir();
	}
}
