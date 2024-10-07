package Ejercico7Oct;


public class Trabajador {

    //Atributos
    private double salario;
    private int id;

    public Trabajador(double salario, int id) {
        this.salario = salario;
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Trabajador [salario=" + salario + "]";
    }

}