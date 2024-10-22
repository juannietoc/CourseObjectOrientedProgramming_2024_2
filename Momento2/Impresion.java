package Momento2;

import java.util.ArrayList;

public class Impresion extends Producto{

    //Atributos de la impresion
    private String color;
    private ArrayList<Foto> fotos;
    
    //Constructor
    public Impresion(int numero, String color, ArrayList<Foto> fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    // Getters y setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Foto> fotos) {
        this.fotos = fotos;
    }

    
}
