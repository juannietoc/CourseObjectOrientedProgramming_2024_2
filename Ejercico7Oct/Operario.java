package Ejercico7Oct;

public class Operario extends Trabajador {
    
    //Atributos
    private final double VALOR_HORA = 5500.0;
    private int horas;
    
    public Operario(int id, String nombre, int horas) {
        super(id, nombre);
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

    
    public double pagar(){
        return horas * VALOR_HORA;
    }

    @Override
    public String toString() {
        return "Operario [VALOR_HORA=" + VALOR_HORA + ", horas=" + horas + "]";
    } 

    

}
