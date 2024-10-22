package Ejercico7Oct;

public class Consultor extends Trabajador {
    
    //Atributos
    private double venta;
    private double comision;

    public Consultor(int id, String nombre, double venta, double comision) {
        super(id, nombre);
        this.venta = venta;
        this.comision = comision;
    }

    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double pagar() {
        return comision + venta;
    }


    @Override
    public String toString() {
        return "Consultor [Venta=" + venta + ", comision=" + comision + "]";
    }

    

}
