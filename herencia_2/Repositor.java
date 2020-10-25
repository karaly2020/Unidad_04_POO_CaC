package herencia_2;
public class Repositor extends Empleado {
    private String zona;

    public Repositor(String nombre, String apellido, String zona) {
        super (nombre, apellido);
        this.zona = zona;
    }
    @Override
    public void metodoEmpleado (){
        System.out.println("Soy clase repositor");
    }
    
    
}
