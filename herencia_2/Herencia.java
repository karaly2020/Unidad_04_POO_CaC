package herencia_2;
public class Herencia {
    public static void main(String[] args) {
        Comercial CC = new Comercial ("Jose", "Paz" , 150);
        Repositor RR = new Repositor ("Juan" , "Gomez" , "Mataderos");
        
        CC.metodoEmpleado();
        CC.metodoSoyComercial();
        RR.metodoEmpleado();
        RR.metodoEmpleado2();
    }
    
}
