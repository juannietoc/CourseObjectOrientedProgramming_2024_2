package Momento2;

public class Camara extends Producto{
    
    //Atributos de la camara
    private String marca;
    private String modelo;
    
    //Constructor 
    public Camara(int numero, String marca, String modelo) {
        super(numero);
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Camara [marca=" + marca + ", modelo=" + modelo + "]";
    }

}
