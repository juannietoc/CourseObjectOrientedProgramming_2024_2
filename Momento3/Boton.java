package Momento3;

public class Boton {
    
    //Atributos
    private boolean estadoBoton;
    private String sonido;
    private boolean luzLed;
    
    //Constructor de la clase
    public Boton(boolean estadoBoton, String sonido, boolean luzLed) {
        this.estadoBoton = estadoBoton;
        this.sonido = sonido;
        this.luzLed = luzLed;
    }

    public boolean isEstadoBoton() {
        return estadoBoton;
    }

    public void setEstadoBoton(boolean estadoBoton) {
        this.estadoBoton = estadoBoton;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public boolean isLuzLed() {
        return luzLed;
    }

    public void setLuzLed(boolean luzLed) {
        this.luzLed = luzLed;
    }

    /* Iluminar y sonar botones
     * Entrada: numDeBoton
     */
    public void iluminarYSonarBoton(int numDeBoton) {
        if(numDeBoton == 10) {
            System.out.println("Boton: <>");
            System.out.println("Abriendo puertas... <<<<<>>>>>");
            System.out.println("Luz: Encendida");
            System.out.println("Sonido: ¡¡¡Biiiip!!!");
            System.out.println("Luz: Apagada");
        } else {
            System.out.println("Boton: "+numDeBoton);
            System.out.println("Luz: Encendida");
            System.out.println("Sonido: ¡¡¡Biiiip!!!");
            System.out.println("Luz: Apagada");
            
        }
      
   
    }

    

}
