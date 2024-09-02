import java.util.*;
public class EjecutarCuentaBancaria {
    
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        CuentaBancaria objCuentaBancaria1 = new CuentaBancaria(321564, 3500000, "Carlos Villa");
        System.out.println(objCuentaBancaria1.toString());
        System.out.println("Ingrese la cantidad a depositar: ");
        double cantidadD = in.nextDouble();
        objCuentaBancaria1.depositar(cantidadD);
        System.out.println("Ingrese la cantidad a retirar: ");
        double cantidadR = in.nextDouble();
        objCuentaBancaria1.retirar(cantidadR);
        double saldo = objCuentaBancaria1.consultarSaldo();
        System.out.println("El saldo de la cuenta es de ---->" + saldo);

    }
    
}
