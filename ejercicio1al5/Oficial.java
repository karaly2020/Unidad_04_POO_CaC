package ejercicio1al5;
public class Oficial extends Operario {

    public Oficial(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre()+"-> "+ this.getClass().getSuperclass().getSimpleName()
                +" ->"+ this.getClass().getSimpleName();
    }
}
