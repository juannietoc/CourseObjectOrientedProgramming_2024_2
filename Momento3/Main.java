package Momento3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        boolean end = false;
        int answer = 0;
        int answer2 = 0;
        int boton = 0;
        int piso =0;
        boolean direccion;
        String alerta="";

        Ascensor ascensor1 = new Ascensor(false, 0);
        Puerta puerta1 = new Puerta(false, false, false);
        SistemaControl sistema = new SistemaControl(ascensor1, puerta1, null, null);

        //ASCENSOR
        System.out.println("****************************");
        System.out.println("***********Ascensor*********");
        System.out.println("****************************");
        System.out.println("");
        while(end==false) {
            //Menu interfaz
            System.out.println("__Menu de usuario__");
            System.out.println("__Pedir ascensor__");
            System.out.println("Presione el boton: ");
            System.out.println("1. Subir");
            System.out.println("2. Bajar");
            System.out.println("3. Admin.");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    
                    //Crear nueva solicitud
                    direccion = true;
                    sistema.crearSoliPiso(direccion, false, "Bip", false);
                    //Mover ascensor hacia abajo3
                    piso = ascensor1.getUbicacion();
                    sistema.moverAscensorAbajo(piso);
                    //Entrada - piso de solicitud
                    //Salida - piso x piso hasta llegar a piso solicitado
                    System.out.println("Ha llegado, porfavor ingrese...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Presione el boton: ");
                    //Metodo interfaz botones del ascensor
                    boton = in.nextInt();
                    //M
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
                    direccion = false;
                    sistema.crearSoliPiso(direccion, false, "Bip", false);
                    //Mover ascensor hacia arriba
                    piso = ascensor1.getUbicacion();
                    sistema.moverAscensorArriba(piso);
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

                case 3:
                    System.out.println("__Menu de admin__");
                    System.out.println("1. Tiempo de funcionamiento.");
                    System.out.println("2. Reporte de estado");
                    int answer3 = in.nextInt();
                    if(answer3 == 1) {
                       alerta = sistema.tiempoDeFuncionamiento();
                    } else if(answer3 == 2) {
                        sistema.sistemaAlertas();
                    }
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
