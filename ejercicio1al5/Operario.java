package ejercicio1al5;
public class Operario extends Empleado {

    public Operario(String nombre) {
        super(nombre);
    }
    @Override
    public String toString() {
        return "Empleado: " + getNombre()+ "->" + this.getClass().getSimpleName();
    }
}
