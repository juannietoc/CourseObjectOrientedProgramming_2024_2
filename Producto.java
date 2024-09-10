public class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    
    public Producto(int id, String nombre, double precio) {
        
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        
    }
    
    public double totalProductos(Productos[] p) {
        double total = 0.0;
        for(int i=0; p.leng; i++) {
           total += p[i].precio;
        } 
        return total;
    }
    
    public String toString() {
        return "Producto { id: " + id + "nombre: " + nombre + "precio: " + precio + "}";
    }
    
}