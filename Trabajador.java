public class Trabajador {

  private String nombre;
  private int id;
  private String area;

  public Trabajador(String nombre, int id, String area) {
    nombre = this.nombre;
    id = this.id;
    area = this.area;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    nombre = this.nombre;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    id = this.id;
  }

  public String getArea() {
    return area;
  }

  public void setArea() {
    area = this.area;
  }

  @Override
  public String toString() {
    return "Trabajador---> [Nombre: "+nombre+", Id: "+id+", area: "+area+"] ";
  }

  public double salario() {
    return 0.0;
  }

}
