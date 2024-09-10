package Taller.Punto2;
import java.util.*;
import java.lang.*;
public class EjecutarLibro {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        Libro objLibro1 = new Libro("Don Quijote de la mancha", "Miguel de Cervantes", 6546532, 200, true);
        System.out.println(objLibro1.toString());
        int answer = 0;
        while(answer!=4) {
            System.out.println("Ingrese la operacion: ");
            System.out.println("1. Prestar un libro");
            System.out.println("2. Devolver un libro");
            System.out.println("3. Ver disponibilidad de un libro");
            System.out.println("4 Salir");
            answer = in.nextInt();
            if(answer == 1) {
                System.out.println("Ingrese el isbn del libro a prestar: ");
                int isbn = in.nextInt();
                objLibro1.prestar(isbn);
            }else if(answer == 2) {
                System.out.println("Ingrese el isbn del libro a devolver: ");
                int isbn = in.nextInt();
                objLibro1.devolver(isbn);
            }else if(answer == 3) {
                System.out.println("Ingrese el ISBN del libro a buscar disponibilidad: ");
                int isbn = in.nextInt();
                objLibro1.estaDisponible(isbn);
            }else if(answer == 4) {

            }
        }


    }
}
