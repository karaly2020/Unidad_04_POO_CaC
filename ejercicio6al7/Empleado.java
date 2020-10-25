/*La empresa informática “Codo a Codo Tech” necesita llevar un registro de todos sus empleados que se encuentran
en la oficina central, para eso ha creado un diagrama de clases que debe incluir la clase Empleado con 
las siguientes características:
Atributos:
• nombre: tipo cadena (nombre y apellido)
• cedula: tipo cadena
• edad : entero (rango entre 18 y 45 años)
• casado: boolean
• salario: tipo numérico doble
Métodos:
• Cree un constructor con y sin parámetros de entrada
• Cree un método getCategoria que permita mostrar la clasificación según la edad de acuerdo al siguiente algoritmo:
o Si edad es menor o igual a 21, Principiante
o Si edad es >= 22 y <= 35, Intermedio
o Si edad es >35, Senior
• Sobrescriba el método toString() para poder imprimir los datos del empleado por pantalla (puede utilizar salto 
de línea \n para separar los atributos).
• Cree un método que permita aumentar el salario en un porcentaje que sería pasado como parámetro al método.*/
package ejercicio6al7;
public class Empleado {
    protected String nombre;
    protected String apellido;
    protected String cedula;
    public int edad;
    public boolean casado;
    protected double salario;

    public Empleado() {
    }
    
    public Empleado(String nombre, String apellido, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }
    public String getCategoria (int edad){
        String categoria = " ";
        if (edad <= 21){
            System.out.println("Categoria: Principiante");
        }
        if (edad >= 22 && edad <=35){
            System.out.println("Categoria: Intermedio");
        }
        if (edad > 35){
            System.out.println("Categoria: Senior");
        }
        return categoria;
    }    
    public double aumentar (double porcentaje){
        double aumento = 0;
        aumento = salario * (1+ (porcentaje/100));
        return aumento;
        }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nCedula: " + cedula + "\nEdad: " + edad + 
                "\nCasado: " + casado + "\nSalario: " + salario;
    }
}
    
    