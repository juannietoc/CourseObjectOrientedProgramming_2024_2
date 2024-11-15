package Momento3;

public class Piso {
    
    //Atributos
    private int numeroDePiso;
    private boolean estado;
    
    //Constructor de la clase
    public Piso(int numeroDePiso, boolean estado) {
        this.numeroDePiso = numeroDePiso;
        this.estado = estado;
    }

    public int getNumeroDePiso() {
        return numeroDePiso;
    }

    public void setNumeroDePiso(int numeroDePiso) {
        this.numeroDePiso = numeroDePiso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


}
