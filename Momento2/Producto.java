package Momento2;

public class Producto {
    
    //Atributos del producto
    private int numero;

    //Constructor
    public Producto(int numero) {
        this.numero = numero;
    }

    //Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Producto [numero=" + numero + "]";
    }

}
