package cuentabancariainterfaz;

//Interfaz para representar una cuenta bancaria
public interface Cuenta {

 // Metodo para consignar una cantidad en la cuenta
 void consignar(float cantidad);

 // Metodo para retirar una cantidad de la cuenta
 void retirar(float cantidad);

 // Metodo para generar el extracto mensual
 void extracto();

 // Metodo para imprimir los detalles de la cuenta
 void imprimir();
}

