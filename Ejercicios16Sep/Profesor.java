public class Profesor extends Persona {

    private final double VALOR_HORA = 40000;
    private double horas;

    public Profesor(String nombre, int id, int edad, int horas) {
        super(nombre, id, edad);
        horas = this.horas;
    }

    public double getHoras(){
        return horas;
    }

    public void setHoras(double horas) {
        horas = this.horas;
    }

    public double salario() {
        return VALOR_HORA * horas;
    }

}