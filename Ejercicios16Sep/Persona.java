public class Persona {

    private String nombre;
    private int id;
    private int edad;

    public Persona(String nombre, int id, int edad) {
        nombre = this.nombre;
        id = this.id;
        edad = this.edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        nombre = this.nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = this.id;
    }

    public int getEdad() {
        return edad; 
    }

    public void setEdad(int edad) {
        edad = this.edad;
    }

    @Override
    public String toString() {
        return "Persona-->[Nombre: "+nombre+", Id: "+id+", Edad: "+edad+"]";
    }

}