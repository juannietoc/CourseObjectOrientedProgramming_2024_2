package Momento3;

public class BotonAscensor extends Boton {
    
    //Atributos
    private int pisoDestino;
    private boolean mantenerPuertasAbierta;


    //Constructor de la clase
    public BotonAscensor(boolean estadoBoton, String sonido, boolean luzLed, int pisoDestino,
    boolean mantenerPuertasAbierta) {
    super(estadoBoton, sonido, luzLed);
    this.pisoDestino = pisoDestino;
    this.mantenerPuertasAbierta = mantenerPuertasAbierta;
    }


    public int getPisoDestino() {
        return pisoDestino;
    }


    public void setPisoDestino(int pisoDestino) {
        this.pisoDestino = pisoDestino;
    }


    public boolean isMantenerPuertasAbierta() {
        return mantenerPuertasAbierta;
    }


    public void setMantenerPuertasAbierta(boolean mantenerPuertasAbierta) {
        this.mantenerPuertasAbierta = mantenerPuertasAbierta;
    }

    /*  Menu de botones y seleccion de piso
     * 
     */
    
    
}
