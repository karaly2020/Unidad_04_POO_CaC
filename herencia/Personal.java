package herencia;
public class Personal {
    //Atributos
    private double sueldo = 3000.00; //declaro como privado el sueldo
    public int edad = 25; // declaro como público la edad
    public String apellido = "Perez"; // declaro como público el Apellido
    public String nombre = "José"; // declaro como público el nombre
    
    // Método constructor para Personal, que indica los parámetros necesarios para su funcionamiento
        public Personal (String nombre, String apellido, int edad, double sueldo){
            
        }
        public double getSueldo () { // Incorporo el metodo getSueldo
        return sueldo; // el método nos devuelve el valor sueldo
        }
    }
    
