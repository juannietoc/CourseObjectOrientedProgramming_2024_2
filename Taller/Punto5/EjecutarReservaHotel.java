package Taller.Punto5;

import java.util.Scanner;

public class EjecutarReservaHotel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ReservaHotel objRH1 = new ReservaHotel("Carlos", "01/08/24", "09/09/24", 12);
        ReservaHotel objRH2 = new ReservaHotel("ElsaPato", "25/01/24", "10/09/24", 12);
        ReservaHotel objRH3 = new ReservaHotel("Josefina", "13/08/24", "11/09/24", 12);

        ReservaHotel[] rH = new ReservaHotel[3];
        rH[0] = objRH1;
        rH[1] = objRH2;
        rH[2] = objRH3;

        //Métodos del hotel

        /* Firma del método
        * Nueva Reserva
        * Entrada: none
        * Salida: none
        */
        public void nuevaReserva(){

        }

        /* Firma del método
        * Cancelar Reserva
        * Entrada: nombreCliente
        * Salida: none
        */
        public void cancelarReserva(String nombreCliente) {

        }   

        /* Firma del método
        * Consultar Reserva
        * Entrada: nombreCliente
        * Salida: 
        */
        public void consultarReserva(String nombreCliente) {
            
        }   
}
