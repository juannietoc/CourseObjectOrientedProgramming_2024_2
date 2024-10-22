package Momento2;

import java.util.ArrayList;

public class Pedido {
    
    //Atributos del pedido
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private String fecha;
    private int numTarjetaCredito;

    //Constructor 
    public Pedido(Cliente cliente, ArrayList<Producto> productos, String fecha, int numTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numTarjetaCredito = numTarjetaCredito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getNumTarjetaCredito() {
        return numTarjetaCredito;
    }

    public void setNumTarjetaCredito(int numTarjetaCredito) {
        this.numTarjetaCredito = numTarjetaCredito;
    }

    @Override
    public String toString() {
        return "Pedido [cliente=" + cliente + ", productos=" + productos + ", fecha=" + fecha + ", numTarjetaCredito="
                + numTarjetaCredito + "]";
    }


}
