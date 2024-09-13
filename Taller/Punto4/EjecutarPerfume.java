package Taller.Punto4;
import java.util.*;
public class EjecutarPerfume {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Perfume objPerfume = new Perfume("CH", "Carolina Herrera", 2000.0, 150000.0);
        System.out.println(objPerfume.toString());
        int answer = 0;
        while(answer!=4) {
            System.out.println("Ingrese la operacion: ");
            System.out.println("1. Aplicar perfume");
            System.out.println("2. Consultar la cantidad restante.");
            System.out.println("3. Ajustar precio.");
            System.out.println("4 Salir");
            answer = in.nextInt();
            if(answer == 1) {
                System.out.println("Ingrese la cantidad aplicar:");
                int cantidad = in.nextInt();
                objPerfume.AplicarPerfume(cantidad);
            }else if(answer == 2) {
                objPerfume.consultarCantidadRestante();
            }else if(answer == 3) {
                System.out.println("Ingrese el nuevo precio a cambiar:");                
                int nuevoPrecio = in.nextInt();
                objPerfume.ajustarPrecio(nuevoPrecio);
            }else if(answer == 4) {

            }
        }

    }

}
