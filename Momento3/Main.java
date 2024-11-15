package Momento3;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        SistemaControl sistemaControl = new SistemaControl(null, null, null);
        boolean end = false;
        int answer = 0;
        int answer2 = 0;
        int boton = 0;

        System.out.println("****************************");
        System.out.println("***********Ascensor*********");
        System.out.println("****************************");
        System.out.println("");
        while(end==false) {
            System.out.println("__Menu de usuario__");
            System.out.println("__Pedir ascensor__");
            System.out.println("Presione el boton: ");
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    
                    //Crear nueva solicitud
                    //Entrada - piso de solicitudes
                    /*
                     * for(int i=0; i<sistemaControl.getSolicitudesAscensor().size();i++) {
                        System.out.println("Esperando...");
                        System.out.println("Piso del ascensor ----> "+sistemaControl.getAscensor1().getUbicacion());
                    }
                     */
                    //Mover ascensor hacia abajo
                    //Entrada - piso de solicitud
                    //Salida - piso x piso hasta llegar a piso solicitado
                    System.out.println("Ha llegado, porfavor ingrese...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Presione el boton: ");
                    //Metodo interfaz botones del ascensor
                    boton = in.nextInt();
                    //Metodo sonido y luz de boton
                    System.out.println("Subiendo...");
                    System.out.println("...");
                    //Metodo mover ascensor hacia arriba
                    //Entrada - piso de solicitud
                    //Salida - piso x piso hasta el piso de solicitud
                    System.out.println("Ha llegado");

                    break;
                
                case 2:
                    //Crear nueva solicitud
                    //Entrada - piso de solicitud
                    /*
                     * for(int i=0; i<sistemaControl.getSolicitudesAscensor().size();i++) {
                        System.out.println("Esperando...");
                        System.out.println("Piso del ascensor ----> "+sistemaControl.getAscensor1().getUbicacion());
                    }
                     */
                    //Mover ascensor hacia arriba
                    //Entrada - piso de solicitud
                    //Salida - piso x piso hasta llegar a piso solicitado
                    System.out.println("Ha llegado, porfavor ingrese...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Presione el boton: ");
                    //Metodo interfaz botones del ascensor
                    boton = in.nextInt();
                    //Metodo sonido y luz de boton
                    System.out.println("Bajando...");
                    System.out.println("...");
                    //Metodo mover ascensor hacia arriba
                    //Entrada - piso de solicitud
                    //Salida - piso x piso hasta el piso de solicitud
                    System.out.println("Ha llegado");

                    break;
                default:
                    System.out.println("Ingrese una opcion valida.");
                    break;
            }

            System.out.println("¿Desea volver a pedir el ascensor?");
            System.out.println("1. Si.");
            System.out.println("2. No.");
            answer2 = in.nextInt();
            if(answer2 == 2) {
                end = true;
            }

        }

    }

}
