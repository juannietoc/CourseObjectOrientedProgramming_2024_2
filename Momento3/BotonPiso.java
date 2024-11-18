package Momento3;

public class BotonPiso extends Boton {
    
    //Atributos
    private boolean direccion;

    //Constructor de la clase
    public BotonPiso(boolean estadoBoton, String sonido, boolean luzLed, boolean direccion) {
        super(estadoBoton,sonido, luzLed);
        this.direccion = direccion;
    }

    public boolean getDireccion() {
        return direccion;
    }

    public void setDireccion(boolean direccion) {
        this.direccion = direccion;
    }
    
}
