
package Taller.Punto2;

import java.lang.reflect.Array;

public class Libro {
    
    //Atributos
    private String titulo;
    private String autor;
    private int isbn;
    private int numeroDePaginas;
    private boolean disponible;
    private Array <libros>;

    //Método constructor
    public Libro(String titulo, String autor, int isbn, int numeroDePaginas, boolean disponible){
        titulo = this.titulo;
        autor = this.titulo;
        isbn = this.isbn;
        numeroDePaginas = this.isbn;
        disponible = this.disponible;
    }

    //Métodos
    /* Firma del método
     * Público, nombre -> prestar
     * Entrada: ninguna
     * Salida: disponibilidad : booleano
     */
    public boolean prestar(int isbn) {
        boolean disponible = false;
        System.out.println("El libro -> " + this.titulo + " con código: " + this.isbn + " ha sido prestado exitosamente.");
        return disponible;
    }

    /* Firma de método
     * Público, nombre -> devolver
     * Entrada: ninguna
     * Salida: dispinibilidad : booleano
     */
    public boolean devolver(int isbn) {
        boolean disponible = true;
        System.out.println("El libro -> " + this.titulo + " con código: " + this.isbn + " ha sido devuelto exitosamente.");
        return disponible;
    }

    /* Firma del método
     * Público, nombre -> estaDisponible
     * Entrada: disponibilidad : booleano
     * Salida: disponibilidad : booleano
     */
    public boolean estaDisponible(int isbn){
        return disponible;
    }

    public String toString(){
        return "{ Libro -> Título: " + titulo + " , autor: " + autor + ", ISBN: " + isbn + ", numero de páginas: "+ numeroDePaginas+ ", diponibilidad: " + disponible + " }"; 
    }
}
