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


    public ArrayList<BotonAscensor> getSolicitudesAscensor() {
        return solicitudesAscensor;
    }

    public void setSolicitudesAscensor(ArrayList<BotonAscensor> solicitudesAscensor) {
        this.solicitudesAscensor = solicitudesAscensor;
    }

    public ArrayList<BotonPiso> getSolicitudesPiso() {
        return solicitudesPiso;
    }

    public void setSolicitudesPiso(ArrayList<BotonPiso> solicitudesPiso) {
        this.solicitudesPiso = solicitudesPiso;
    }

    /* Mover el ascensor, mueve el ascensor entre piso y piso
     * Entrada: 
     * Salida:
     */
    
    /* Crear nueva solicitud ascensor
     * Entrada: piso destino
     */

    /* Crear nueva solicitud piso
     * Entrada: direccion
     */

    /* Borrar solicitud ascensor
     * 
     */

}
