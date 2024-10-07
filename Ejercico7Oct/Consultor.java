package Ejercico7Oct;

public class Consultor extends Trabajador {
    
    //Atributos
    private double basico;
    private double comision;

    public Consultor(double salario, int id, double basico, double comision) {
        super(salario, id);
        this.basico = basico;
        this.comision = comision;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return "Consultor [basico=" + basico + ", comision=" + comision + "]";
    }

    

}
