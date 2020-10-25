package herencia_2;
public class Comercial extends Empleado{
    private double comision;
    
    public Comercial(String nombre, String apellido, double comision){
        super (nombre, apellido);
        this.comision = comision;
    }
    @Override
    public void metodoEmpleado (){
        System.out.println("Soy clase comercial");
    }
    public void metodoSoyComercial (){
        System.out.println("Mi puesto es marketing");
        System.out.println("Mi comision es: " + comision);
    }
}
