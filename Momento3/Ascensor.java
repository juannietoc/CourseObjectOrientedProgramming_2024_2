package Momento3;

public class Ascensor {
    
    //Atributos
    private final static int MAX_FLOOR = 9;
    private final static int MIN_FLOOR = 0;
    private boolean estado;
    private int ubicacion;
    
    private Puerta puerta;

    //Constructor de la clase
    public Ascensor(boolean estado, int ubicacion) {
        puerta = new Puerta(false, false, false);
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public Puerta getPuerta() {
        return puerta;
    }

    public void setPuerta(Puerta puerta) {
        this.puerta = puerta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    /* Subir piso
     * sube un piso piso
     */
    public void subirPiso() {
        if (ubicacion < MAX_FLOOR) {
            ubicacion++;
        }
    }

    /* Bajar piso
     * sube un piso
     */
    public void bajarPiso() {
        if(ubicacion > MIN_FLOOR) {
            ubicacion--;
        }
    }
} 