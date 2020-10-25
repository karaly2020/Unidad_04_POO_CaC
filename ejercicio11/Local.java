package ejercicio11;
import java.util.ArrayList;
public class Local {
    
    public boolean buscarCliente(String nombre_p, ArrayList<String>listado){
        boolean resultado=false;
            if (listado.contains(nombre_p)){  
                resultado= true;
            }else{
                resultado= false; 
                    }
        return resultado; 
    }
}
