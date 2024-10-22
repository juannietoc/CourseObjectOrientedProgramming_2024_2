package Ejercico7Oct;

public class Analista extends Trabajador {
    
    //Atributos
    private double integral;

    public Analista(int id, String nombre, double integral) {
        super(id, nombre);
        this.integral = integral;
    }

    public double getIntegral() {
        return integral;
    }

    public void setIntegral(double integral) {
        this.integral = integral;
    }

    public double pagar(){
        return integral;
    }

@Override
public String toString() {
    return "Analista [integral=" + integral + "]";
}
    

}
