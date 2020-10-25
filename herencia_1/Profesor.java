package herencia_1;
public class Profesor extends Persona {
    private String Matricula;
    
    public Profesor (String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
        Matricula = "000";
    }
    public void mostrarDatos (){
        System.out.println("Nombre profesor: " + nombre);
        System.out.println("Apellido profesor: " + apellido);
        System.out.println("Edad profesor: " + edad);
        System.out.println("Matricula profesor: " + Matricula);
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
          
            
            
}
