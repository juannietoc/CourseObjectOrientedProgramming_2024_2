import java.util.*;
public class Ejercicios {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*
         * Ejercicios: 
         * 1. Diseñe un algoritmo que calcule el área de un cuadrado, 
         *    teniendo uno de sus lados. areaCuadrado = b^2 
         * 2. Diseñe un algoritmo que calcule el área de un círculo. areaCirculo = π r^2 
         * 3. Diseñe un algoritmo que convierta de grados centígrados a grados fahrenheit y 
         *    viceversa.
         * 4. Diseñe un algoritmo para calcular el salario de un empleado. 
         *    salarioNeto = (salarioBruto - deducciones) + comisión 
         * 5. Diseñe un algoritmo para convertir pesos a dolares y pesos a euros.
         * 6. Diseñe un algoritmo para calcular el pago de un parqueadero por horas. 
         *    Valor de  la hora $2000 también se debe discriminar el IVA del 20% que se paga. 
         */

        System.out.println("Ingrese el numero del ejercicio (1 - 6): ");
        int num = sc.nextInt();
        if(num == 1) {
            areaCuadrado(); 
        } else if(num == 2) {
            areaCirculo();
        } else if(num == 3) {
            conversionGrados();
        } else if(num == 4) {
            calcularSalario();
        } else if(num == 5) {
            conversionMoneda();
        } else if(num == 6) {
            pagoParqueadero();
        }
    }

    /*
    * Solucion ejercicio 1.
    * Entrada: lado del cuadrado -> b = 2
    * Proceso: areaCuadrado = b * b
    * Salida: areaCuadrado
    */
    //Para concatenar texto con variables se utiliza el signo (+)
    public static void areaCuadrado() {
        int b = 2; //Asignacion de la variable
        int areaCuadrado = b * b; //Formula para hallar el area de un cuadrado
        System.out.println("Área del cuadrado = " + areaCuadrado); //Mensaje de salida
    }

      
    /*Solucion ejercicio #2
    * Entrada: radio del circulo, PI (constante)
    * Proceso: areaCirculo = PI*(r*r)
    * Salida: areaCirculo
    */
    public static void areaCirculo() {
          double r = 0.0; //Variabe
          final double PI = 3.1416; //Constante
          double areaCirculo = 0.0;
          r = 3;
          areaCirculo = PI * (r * r); 
          System.out.println("El area del circulo es: " + areaCirculo);
    }

    /*
    Solucion ejercicio #3
    Entrada: gradosC (int)
    Proceso: gradosF = (gradosC*9/5)+32
    Salida: gradosF
    */
    public static void conversionGrados() {
        double gradosF = 1;
        double gradosC = 1;
        gradosF = gradosC* (9.0/5.0) + 32.0;
        gradosC = ((gradosF - 32.0) / (9.0/5.0));
        System.out.println("La conversion de grados Celcius es: " + gradosC);
        System.out.println("Grados Farenheit: " + gradosF);

    }

    /*
    * Solucion ejercicio #4
    Entrada: salarioBruto, deducciones, comision
    Proceso: salarioNeto = (SalarioBruto - deducciones) + comision
    Salida: salarioNeto (Salario total del empleado)
    */
    public static void calcularSalario() {
        int salarioNeto;
        int salarioBruto;
        int deducciones;
        int comision;
        System.out.println("Ingrese primero el salario básico: ");
         salarioBruto = sc.nextInt();
        System.out.println("Ahora las deducciones: ");
        deducciones = sc.nextInt();
        System.out.println("Por ultimo el total de comisiones: ");
        comision = sc.nextInt();
        salarioNeto = (salarioBruto - deducciones) + comision;
        System.out.println("El salario del mes para el empleado es ---> "+salarioNeto);
    }

    /*
    Solucion ejercicio #5
    Entrada: pesos
    Proceso: dolar = 0.00025 * peso / euro = 0.00022 * peso
    Salida: dolar y euro
    */
    public static void conversionMoneda(){
        System.out.println("Ingrese los pesos a convertir: ");
        double peso = sc.nextDouble();
        double dolar = 0.00025 * peso;
        double euro = 0.00022 * peso;
        System.out.println("La conversion a dolares es ---> " + dolar+ " y en euros es --> "+ euro);
    }

    /*
     * Solucion ejercicio #6
     * Entrada: horas
     * Proceso: total = (total * IVA) + horas * valorHora
     * Salida: total
     */
    public static void pagoParqueadero(){
        final int VALORHORA;
        double total;
        int horas;
        VALORHORA = 2000;
        System.out.println("Ingrese las horas a cobrar: ");
        horas = sc.nextInt();
        total = horas * VALORHORA;
        total = total + (total * 0.2);
        System.out.println("El total a pagar es de ---> " + total);
    }
}