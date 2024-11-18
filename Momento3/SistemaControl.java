package Momento3;
import java.util.*;

public class SistemaControl {

    private static final long tiempoInicial = System.nanoTime();
    //Atributos
    private Ascensor ascensor1;
    private Puerta puerta1;
    
    
    //ArrayList solicitudes
    private ArrayList<BotonAscensor> solicitudesAscensor;
    private ArrayList<BotonPiso> solicitudesPiso;


    //Constructor de la clase
    public SistemaControl(Ascensor ascensor1, Puerta puerta1, ArrayList<BotonAscensor> solicitudesAscensor, ArrayList<BotonPiso> solicitudesPiso) {
        ascensor1 = new Ascensor(false, 0);
        puerta1 = new Puerta(false, false, false);
        solicitudesAscensor = new ArrayList<BotonAscensor>();
        solicitudesPiso = new ArrayList<BotonPiso>();
    }


    /* Mover el ascensor, sube el ascensor entre piso y piso
     * Entrada: Piso de destino
     * Salida:
     */
    public void moverAscensorArriba(int pisoDestino) {
        for(int i=0; i<pisoDestino; i++) {
            ascensor1.subirPiso();
        }
    }

    /* Mover el ascensor, baja el ascensor entre piso y piso
     * Entrada: Piso de destino
     */
    public void moverAscensorAbajo(int pisoDestino) {
        for(int i=11; i>pisoDestino; i--) {
            ascensor1.bajarPiso();
        }
    }
    
    /* Crear nueva solicitud ascensor
     * Entrada: piso destino
     */
    public void crearSoliAscensor(int pisoDestino, boolean mantenerPuertasAbierta, boolean estadoBoton, String sonido, boolean luzLed) {
        solicitudesAscensor.add(new BotonAscensor(estadoBoton, sonido, luzLed, pisoDestino, mantenerPuertasAbierta));
    }

    /* Crear nueva solicitud piso
     * Entrada: direccion
     */
    public void crearSoliPiso(boolean direccion, boolean estadoBoton, String sonido, boolean luzLed) {
        solicitudesPiso.add(new BotonPiso(estadoBoton, sonido, luzLed, direccion));
    }

    /* Borrar solicitud ascensor
     * 
     */
    public void borrarSoliAscensor(int pisoDestino) {
        int indice = solicitudesAscensor.indexOf(pisoDestino);
        if(indice != -1) {
            solicitudesAscensor.remove(indice);
        }
    }

    /*  Borrar solicitud piso
     * 
     */
    public void borrarSoliPiso(boolean direccion) {
        int indice = solicitudesPiso.indexOf(direccion);
        if(indice != -1) {
            solicitudesPiso.remove(indice);
        }
    }

    /* Alerta de fallas en botones, puertas o ascensor.
     * 
     */
    public String sistemaAlertas() {
        String alerta = "";
        if(ascensor1.isEstado() == true) {
            alerta = "!Alerta de falla¡ ------> En: Ascensor";
        }
        for(int i=0; i<solicitudesAscensor.size();i++) {
            if(solicitudesAscensor.get(i).isEstadoBoton() == true) {
                alerta = "!Alerta de falla¡ ------> En: Botones de ascensor";
            }
        }
        for(int i=0; i<solicitudesPiso.size();i++) {
            if(solicitudesPiso.get(i).isEstadoBoton() == true) {
                alerta = "!Alerta de falla¡ ------> En: Botones de piso";
            }
        }
        return alerta;
    }
    /* Tiempo de funcionamiento del ascensor
     * 
     */
    public String tiempoDeFuncionamiento() {
        long tiempoTranscurrido = System.nanoTime() - tiempoInicial;

        // Convertir nanosegundos a segundos, minutos y horas
        long segundos = tiempoTranscurrido / 1_000_000_000;
        long minutos = segundos / 60;
        long horas = minutos / 60;

        segundos %= 60;
        minutos %= 60;

        return String.format("Tiempo de funcionamiento: %02d horas, %02d minutos, %02d segundos", 
                             horas, minutos, segundos);
    }


}
