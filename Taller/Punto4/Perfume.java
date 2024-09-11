package Taller.Punto4;

public class Perfume {
    
    //Atributos
    private String nombre;
    private String marca;
    private double capacidad;
    private double precio;

    //Método constrsuctor
    public Perfume(String nombre, String marca, double capacidad, double precio) {
        nombre = this.nombre;
        marca = this.marca;
        capacidad = this.capacidad;
        precio = this.precio;
    }

    //Métodos
    /* Firma del método
     * Público, nombre: AplicarPerfume
     * Entrada: cantidad : double
     * Salida: capacidad : double
     */
    public double AplicarPerfume(double cantidad) {
        capacidad = this.capacidad - cantidad;
        return capacidad;
    }

    /* Firma del método
     * Público, nombre: consultarCantidadRestante
     * Entrada: none
     * Salida: none
     */
    public void consultarCantidadRestante() {
        System.out.println("La cantidad de perfume restante es: " + this.capacidad + "ml");
    }   

     /* Firma del método
      * Público, nombre: AjustarPrecio
      * Entrada: nuevoPrecio
      * Salida: none
      */
    public void ajustarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    public String toString() {
        return "[Perfumer --> Nombre: " + nombre +", Marca: "+ marca +", Capacidad: "+ capacidad +", Precio: "+ precio +"]";
    }

}
