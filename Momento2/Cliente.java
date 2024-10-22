package Momento2;

public class Cliente {
    
    //Atributos
    private String cedula;
    private String nombre;

    //Constructor
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    //Getters y setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ToString
    @Override
    public String toString() {
        return "Cliente [cedula=" + cedula + ", nombre=" + nombre + "]";
    }

}
