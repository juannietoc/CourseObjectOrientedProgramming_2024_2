public class Operario extends Trabajador {

    private final double VALOR_HORA = 12000.0;
    private double horas;

    public Operario(int id, String nombre, String area, double horas) {
        super(nombre, id, area);
        horas = this.horas;
    }

    public double getHoras() {
        return horas;
    }

    public double salario() {
        return VALOR_HORA * horas;
    }

}