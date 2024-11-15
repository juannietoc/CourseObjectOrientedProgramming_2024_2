package Momento3;

public class BotonPiso extends Boton {
    
    //Atributos
    private String direccion;

    //Constructor de la clase
    public BotonPiso(boolean estadoBoton, int numDeBoton, String sonido, boolean luzLed, String direccion) {
        super(estadoBoton, numDeBoton,sonido, luzLed);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
