package herencia;
public class Medicos extends Personal{
    private String Matricula;
    private String Especialidad;
    
    public Medicos(String nombre, String apellido, int edad, double sueldo){
    super(nombre, apellido, edad, sueldo);
    Matricula = "35853";
    Especialidad="Clínica Médica";
    } 
}
