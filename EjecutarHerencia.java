public class EjecutarHerencia {

    public static void main(String[] args) {
        
        //Creacion de los objetos
        Trabajador trab1 = new Vendedor(1, "Cristiano", "Textiles", 20.0);
        Trabajador trab2 = new Vendedor(2, "Messi", "Electrodométicos", 10.0);
        Trabajador trab3 = new Operario(3, "Byron", "Dulceria", 200);
        Trabajador trab4 = new Operario(4, "Harvin" , "Comestibles", 230);

        System.out.println("Salario Vendedor: "+ trab1.salario());
        System.out.println("Salario Operario: "+ trab3.salario());

        System.out.println(trab1 instanceof Vendedor);  //Prints true
        System.out.println(trab1 instanceof Trabajador);  //Prints true

        Trabajador[] t = new Trabajador[4];
        t[0] = trab1;
        t[1] = trab2;
        t[2] = trab3;
        t[3] = trab4;

        for(int i = 0; i < t.length; i++) {
            System.out.println(t[i].getClass() + "- "+t[i].getNombre() + " " + t[i].salario());
        }

    }

}