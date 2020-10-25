// Clase padre
package herencia_2;
public class Empleado {
    protected String nombre;
    protected String apellido;

    public Empleado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public void metodoEmpleado (){
        System.out.println("Estoy en la clase empleado");
    }
    public void metodoEmpleado2 (){
        System.out.println("Estoy en la clase empleado2");
    }
}
