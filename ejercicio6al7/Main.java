package ejercicio6al7;
public class Main {
    public static void main(String[] args) {
        
        Empleado E1 = new Empleado("Julio", "Perez", "123456", 55, true, 1000);
        Programador P1 = new Programador ("Nestor", "Diaz", "147258", 22, false, 5000, 350, "Java");
                
        System.out.println(E1);
        System.out.println("El salario con aumento es: " +E1.aumentar(25));
        System.out.println(E1.getCategoria(55));
        System.out.println(P1);
        System.out.println("El salario con aumento es: " +P1.aumentar(25));
        System.out.println(P1.getCategoria(22));     
    }
}
