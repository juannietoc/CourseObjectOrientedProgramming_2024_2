package Ejercico7Oct;

public class Operario extends Trabajador {
    
    //Atributos
    private final double VALOR_HORA = 8.5;
    private int horas;
    
    public Operario(double salario, int id, int horas) {
        super(salario, id);
        this.horas = horas;
    }

    public double getVALOR_HORA() {
        return VALOR_HORA;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Operario [VALOR_HORA=" + VALOR_HORA + ", horas=" + horas + "]";
    } 

    

}
