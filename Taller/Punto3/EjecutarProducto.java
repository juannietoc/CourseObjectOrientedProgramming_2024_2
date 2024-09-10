package Taller.Punto3;
import java.util.*;
public class EjecutarProducto {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Producto objProducto = new Producto("cerveza", 65432, 15, 3000);
        System.out.println(objProducto.toString());
        int answer = 0;
        while(answer!=4) {
            System.out.println("Ingrese la operacion: ");
            System.out.println("1. Añadir producto al inventario");
            System.out.println("2. Quitar producto del inventario");
            System.out.println("3. Calcular valor total del inventario");
            System.out.println("4 Salir");
            answer = in.nextInt();
            if(answer == 1) {
                System.out.println("Ingrese la cantidad añadir: ");
                int cantAñadir = in.nextInt();
                objProducto.añadirProducto(cantAñadir);
            }else if(answer == 2) {
                System.out.println("Ingrese la cantidad a reducir: ");
                int cantReducir = in.nextInt();
                objProducto.reducirProducto(cantReducir);
            }else if(answer == 3) {
                int total = objProducto.valorTotalInventario();
                System.out.println("El valor total del inventario es: " + total );
            }else if(answer == 4) {

            }
        }


    }
    
}
