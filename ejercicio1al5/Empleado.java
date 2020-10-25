/*Crear el código para la clase base Empleado. Esta clase contiene:
• Un atributo privado nombre de tipo String que heredan el resto de clases.
• Un constructor por defecto.
• Un constructor con parámetros que inicializa el nombre con el String que recibe.
• Método set y get para el atributo nombre.
• Un método toString() que devuelve el String: "Empleado " + nombre.
Nota: antes de escribir el resto de clases, que se mencionan en los ejercicios siguientes, considere que 
debe sobrescribir el método toString() en cada una de ellas y declarar el constructor adecuado de forma tal que al ejecutar las siguientes instrucciones:
• Empleado E1 = new Empleado("Rafael");
• Directivo D1 = new Directivo("Mario");
• Operario OP1 = new Operario("Alfonso");
• Oficial OF1 = new Oficial("Luis");
• Tecnico T1 = new Tecnico("Pablo");
• System.out.println(E1);
• System.out.println(D1);
• System.out.println(OP1);
• System.out.println(OF1);
• System.out.println(T1);
De como resultado lo siguiente:
• Empleado Rafael
• Empleado Mario -> Directivo
• Empleado Alfonso -> Operario
• Empleado Luis -> Operario -> Oficial
• Empleado Pablo -> Operario -> Tecnico*/
package ejercicio1al5;
public class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado:" + nombre;
    } 
}
