package cuentas;

/**
 * Clase principal del proyecto Deposito
 * @author Daniel
 */
public class Main {

    /**
     * Método principal que se ejecuta al iniciar el programa
     * Crea un objeto de tipo CCuenta y realiza operaciones sobre él
     * utilizando el método operativa_cuenta
     * @param args 
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        operativa_cuenta(cuenta1, 500);
    }
    /**
     * Realiza operaciones de retirada e ingreso sobre un objeto CCuenta
     * Las operaciones se ejecutan controlando posibles excepciones
     * en caso de cantidades inválidas o saldo insuficiente
     * @param cuenta1 objeto de tipo cuenta sobre el que se realizan las acciones
     * @param cantidad cantidad de dinero que se desear retirar e ingresar
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
