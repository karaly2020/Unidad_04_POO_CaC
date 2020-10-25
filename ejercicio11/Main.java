package ejercicio11;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in); 
        ArrayList<String> listado = new ArrayList(); 

        Local l=new Local();    
        Cliente C1=new Cliente("Jose", 001);
        Cliente C2=new Cliente("Roman", 002);
        Cliente C3=new Cliente ("Maritza", 003);
        Cliente C4=new Cliente ("Pedro", 004);
        listado.add(C1.getNombre().toUpperCase()); 
        listado.add(C2.getNombre().toUpperCase());
        listado.add(C3.getNombre().toUpperCase());
        listado.add(C4.getNombre().toUpperCase()); 
        
        System.out.println("Ingrese el nombre del Cliente a localizar: ");
        String nombre_p= entrada.nextLine().toUpperCase(); 
        
        System.out.println(l.buscarCliente(nombre_p, listado));
    } 
}
