package Momento3;

public class Puerta {
    
    //Atributos
    //Estado: true - falla, false - bien
    private boolean estado;
    private boolean abierta;
    private boolean sensor;

    //Constructor de la clase
    public Puerta(boolean estado, boolean abierta, boolean sensor) {
        this.estado = estado;
        this.abierta = abierta;
        this.sensor = sensor;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public boolean isSensor() {
        return sensor;
    }

    public void setSensor(boolean sensor) {
        this.sensor = sensor;
    }
    
}
