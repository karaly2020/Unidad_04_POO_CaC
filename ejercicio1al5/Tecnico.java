package ejercicio1al5;
public class Tecnico extends Operario{

    public Tecnico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Empleado: " + getNombre()+"-> "+ this.getClass().getSuperclass().getSimpleName()
                +" ->"+ this.getClass().getSimpleName();
    }
}
