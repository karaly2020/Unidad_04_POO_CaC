package ejercicio6al7;
public class Programador extends Empleado {
    private int lineasDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(String nombre, String apellido, String cedula, int edad, boolean casado, double salario, 
            int lineasDeCodigoPorHora, String lenguajeDominante) {
        super(nombre, apellido, cedula, edad, casado, salario);
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }

    public int getLineasDeCodigoPorHora() {
        return lineasDeCodigoPorHora;
    }

    public void setLineasDeCodigoPorHora(int lineasDeCodigoPorHora) {
        this.lineasDeCodigoPorHora = lineasDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nEdad: " + edad + 
                "\nCasado: " + casado + "\nSalario: " + salario + "\nLineas De Codigo Por Hora: " + lineasDeCodigoPorHora
                + "\nLenguaje Dominante: " + lenguajeDominante;
    }
}
