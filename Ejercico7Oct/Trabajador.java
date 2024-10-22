package Ejercico7Oct;


public class Trabajador {

    //Atributos
    private int id;
    private String nombre;

    public Trabajador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double pagar(){
        return 0.0;
    }
   
    @Override
    public String toString() {
        return "Trabajador [id=" + id + ", nombre=" + nombre + "]";
    }

}