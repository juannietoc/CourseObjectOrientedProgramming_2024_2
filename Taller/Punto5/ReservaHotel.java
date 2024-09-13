package Taller.Punto5;

public class ReservaHotel {
    
    //Atributos del hotel
    private String nombreCliente;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroDeRoom;

    //Método Contructor
    public ReservaHotel(String nombreCliente, String fechaEntrada, String fechaSalida, int numeroDeRoom) {
        nombreCliente = this.nombreCliente;
        fechaEntrada = this.fechaEntrada;
        fechaSalida = this.fechaSalida;
        numeroDeRoom = this.numeroDeRoom;
    }

    //Getters y setters

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    
    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroDeRoom() {
        return numeroDeRoom;
    }

    
    public void setNumeroDeRoom(int numeroDeRoom) {
        this.numeroDeRoom = numeroDeRoom;
    }

    //ToString ReservaHotel
    @Override
    public String toString() {
        return "Rerserva de Hotel [Nombre del cliente= " + nombreCliente + ", Fecha de Entrada= " 
        + fechaEntrada + ", Fecha de Salida= " + fechaSalida + ", Numero de habitación= "+ numeroDeRoom +" ]";
    }

   
}   
