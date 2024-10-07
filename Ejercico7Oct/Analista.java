package Ejercico7Oct;

public class Analista extends Trabajador {
    
    //Atributos
    private double intereses;

    public Analista(double salario, int id, double intereses) {
        super(salario, id);
        this.intereses = intereses;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Analista [intereses=" + intereses + "]";
    }

    

}
