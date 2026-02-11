package cuentas;
/**
 * Clase que representa una cuenta bancaria, contiene información
 * sobre el titular de la cuenta, el nº de cuenta, el saldo disponible
 * y el tipo de interes aplicado
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor por defecto
     */
    public CCuenta()
    {
    }
   
    /**
     * Constructor con parámetros
     * @param nom nombre de la cuenta
     * @param cue numero de la cuenta
     * @param sal saldo disponible de la cuenta
     * @param tipo tipo de interes de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
    * Metodo que devuelve el saldo de la cuenta.
     * @return saldo
    */
    public double estado()
    {
        return saldo;
    }

    /**
     * Método que permite ingresar una cantidad de dinero, debe ser positivo
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
  
    /**
     * Metodo que permite retirar dinero de la cuenta, si la cantidad a retirar
     * es menor que el saldo disponible en la cuenta.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    /**
     * devuelve el nombre del titular de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Permite establecer el nombre del titular de la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el tipo de interés de la cuenta
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
