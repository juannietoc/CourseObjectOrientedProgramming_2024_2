package Taller.Punto3;

public class Producto {
    
    //Atributos
    private String nombre;
    private int codigo;
    private int cantidadStock;
    private int precio;

    //Método constructor
    public Producto(String nombre, int codigo, int cantidadStock, int precio) {
        nombre = this.nombre;
        codigo = this.codigo;
        cantidadStock = this.cantidadStock;
        precio = this.precio;
    } 

    //Métodos
    /* Firma del método
     * Público, nombre: añadirProducto
     * Entrada: cantAñadir : int
     * Salida: cantidadStock : int
     */
    public int añadirProducto(int cantAñadir) {
        cantidadStock = cantidadStock + cantAñadir;
        return cantidadStock;
    }

    /* Firma del método
     * Público, nombre: reducirProducto
     * Entrada: cantReducir : int
     * Salida: cantidadStock : int
     */
    public int reducirProducto(int cantReducir) {
        cantidadStock = cantidadStock - cantReducir;
        return cantidadStock;
    }

    /* Firma del método
     * Público, nombre: valorTotalInventario
     * Entrada: none
     * Salida: valorTotalInventario
     */
    public int valorTotalInventario() {
        int valorTotalInventario = cantidadStock * precio;
        return valorTotalInventario;
    }

    public String toString() {
        return "{ Producto-->  Nombre: " + nombre + ", código: "+ codigo + ", cantidad en Stock: " + cantidadStock + ", precio: " + precio +"}";
    }
}
