package Momento2;

public class Foto {

    //Atributos de la foto
    private String fichero;

    //Constructor
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    //Getters y setters
    public String getFichero() {
        return fichero;
    }

    public void setFichero(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto: " + fichero);
    }

}
