import java.util.*;
public class CuentaBancaria {

    private Scanner sc;
    
    //Atributos de la cuenta bancaria
    private int numeroDeCuenta;
    private double saldo;
    private String titular;

    //Método constructor
    public CuentaBancaria(int numeroDeCuenta, double saldo, String titular) {

        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
        this.titular = titular;

    }

    //Métodos de la clase

    /* Firma del método
     * Público, nombre: depositar
     * Entrada: cantidad : double
     * Retorna: cantidad 
     */
    public double depositar(double cantidad) {
        cantidad = cantidad + this.saldo;
        return cantidad;
    }

    /*Firma del método
     * Público, nombre: retirar
     * Entrada: cantidad : double
     * Retorna: cantidad
     */
    public double retirar(double cantidad) {
        cantidad = cantidad - this.saldo;
        return cantidad; 
    }

    /* Firma del método
     * Público, nombre: retirar
     * Entrada: Ninguna
     * Retorna: saldo
     */
    public double consultarSaldo() {
        return saldo;
    }

    public String toString(){
        return "{ Cuenta Bancaria -> Número de cuenta: " + numeroDeCuenta + " saldo: " + saldo + " titular: " + titular + " }"; 
    }

}