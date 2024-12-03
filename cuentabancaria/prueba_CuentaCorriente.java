package cuentabancaria;

public class prueba_CuentaCorriente {
    public static void main(String[] args) {

        Cuenta_Corriente cuenta = new Cuenta_Corriente(5000, 0.9f);

        // Estado inicial de la cuenta
        System.out.println("Estado inicial de la cuenta:");
        cuenta.imprimir();

        // Realizar un retiro dentro del saldo
        System.out.println("\nRetirando 3000");
        cuenta.retirar(3000);
        cuenta.imprimir();

        // Realizar un retiro que cause sobregiro
        System.out.println("\nRetirando 5000");
        cuenta.retirar(5000);
        cuenta.imprimir();

        // Consignar dinero para cubrir sobregiro parcialmente
        System.out.println("\nAnadiendo 2000");
        cuenta.consignar(2000);
        cuenta.imprimir();

        // Consignar dinero para cubrir sobregiro totalmente
        System.out.println("\nAnadiendo 4000");
        cuenta.consignar(4000);
        cuenta.imprimir();

        // Generar extracto mensual
        System.out.println("\nGenerando extracto");
        cuenta.extracto();
        cuenta.imprimir();
    }
}

