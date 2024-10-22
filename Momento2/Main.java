package Momento2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Creacion de un cliente
        Cliente cliente = new Cliente("1008452986", "Victor Gonzalej");

        // Crear productos (una cámara y una impresión)
        // Producto 1: Cámara
        Camara camara = new Camara(1, "Canon", "EOS R5");

        // Producto 2: Impresión
        // Crear algunas fotos para la impresión
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        
        // Crear lista de fotos
        ArrayList<Foto> fotos = new ArrayList<>();
        fotos.add(foto1);
        fotos.add(foto2);
        
        // Crear impresión
        Impresion impresion = new Impresion(2, "Blanco y negro", fotos);

        // Crear lista de productos para el pedido
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(camara);
        productos.add(impresion);

        // Crear el pedido
        Pedido pedido = new Pedido(cliente, productos, "21/Oct/24", 987654321);

        // Imprimir detalles del pedido
        printDetallesPedido(pedido);
    }

    public static void printDetallesPedido(Pedido pedido) {
        System.out.println("Detalles del Pedido:");
        System.out.println("Cliente: " + pedido.getCliente().getNombre() + 
                            " (Cédula: " + pedido.getCliente().getCedula() + ")");
        System.out.println("Fecha del Pedido: " + pedido.getFecha());
        System.out.println("Número de Tarjeta de Crédito: " + pedido.getNumTarjetaCredito());
        System.out.println("Productos:");

        for (Producto producto : pedido.getProductos()) {
            if (producto instanceof Camara) {
                Camara camara = (Camara) producto;
                System.out.println("Cámara - Marca: " + camara.getMarca() + 
                                    ", Modelo: " + camara.getModelo());
            } else if (producto instanceof Impresion) {
                Impresion impresion = (Impresion) producto;
                System.out.println("Impresión - Color: " + impresion.getColor());
                System.out.println("Fotos:");
                for (Foto foto : impresion.getFotos()) {
                    foto.print(); // Llama al método print() para imprimir detalles de cada foto
                }
            }
        }
    }
}
