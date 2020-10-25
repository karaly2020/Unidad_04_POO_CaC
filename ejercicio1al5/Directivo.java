package ejercicio1al5;
public class Directivo extends Empleado{

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
         return "Empleado: " + getNombre()+"->" + this.getClass().getSimpleName();
    } 
}
