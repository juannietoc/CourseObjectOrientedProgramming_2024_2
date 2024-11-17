package Momento3;
import java.util.*;

public class SistemaControl {

    //Atributos
    private Ascensor ascensor1;
    //ArrayList solicitudes
    private ArrayList<BotonAscensor> solicitudesAscensor;
    private ArrayList<BotonPiso> solicitudesPiso;


    //Constructor de la clase
    public SistemaControl(Ascensor ascensor1, ArrayList<BotonAscensor> solicitudesAscensor, ArrayList<BotonPiso> solicitudesPiso) {
        ascensor1 = new Ascensor(false, 0);
        solicitudesAscensor = new ArrayList<BotonAscensor>();
        solicitudesPiso = new ArrayList<BotonPiso>();
    }

    public Ascensor getAscensor1() {
        return ascensor1;
    }

    public void setAscensor1(Ascensor ascensor1) {
        this.ascensor1 = ascensor1;
    }

    /* Mover el ascensor, mueve el ascensor entre piso y piso
     * Entrada: 
     * Salida:
     */
    
    /* Crear nueva solicitud ascensor
     * Entrada: piso destino
     */
    public void crearSoliAscensor(int pisoDestino, boolean mantenerPuertasAbierta) {
        BotonAscensor nuevaSoliAscensor = new BotonAscensor(mantenerPuertasAbierta, pisoDestino, null, mantenerPuertasAbierta, pisoDestino, mantenerPuertasAbierta);
        solicitudesAscensor.add(nuevaSoliAscensor);
    }

    /* Crear nueva solicitud piso
     * Entrada: direccion
     */
    public void crearSoliPiso() {
        BotonPiso nuevaSoliPiso = new BotonPiso(false, 0, null, false, null);
        solicitudesPiso.add(nuevaSoliPiso);
    }

    /* Buscar solicitud
     * 
     */
    

    /* Borrar solicitud ascensor
     * 
     */
    public void borrarSoliAscensor(int pisoDestino) {
        int indice = solicitudesAscensor.indexOf(pisoDestino);
        if(indice != -1) {
            solicitudesAscensor.remove(indice);
        }
    }

    public void borrarSoliPiso(boolean direccion) {
        int indice = solicitudesPiso.indexOf(direccion);
        if(indice != -1) {
            solicitudesPiso.remove(indice);
        }
    }

    /* Alerta de fallas en botones, puertas o ascensor.
     * 
     */
    public void sistemaAlertas() {
        for(int i=0; ) {

        }
    }
    /* Tiempo de funcionamiento del ascensor
     * 
     */
}
