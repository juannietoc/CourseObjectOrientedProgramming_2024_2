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
     * Salida: cantidad : double
     */
    public double AplicarPerfume(double cantidad) {
        this.capacidad = this.capacidad - cantidad;
        return capacidad;
    }

}
