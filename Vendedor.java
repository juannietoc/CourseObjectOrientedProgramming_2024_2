public class Vendedor extends Trabajador {

    public final double VENTA = 120000.0; //Constante
    private double comision;

    public Vendedor(int id, String nombre, String area, double comision) {
        super(nombre, id, area);
        comision = this.comision;
    }

    public double comision(){
        return comision;
    }

    public double salario() {
        return (VENTA * (comision/100)) + comision;
    }

}