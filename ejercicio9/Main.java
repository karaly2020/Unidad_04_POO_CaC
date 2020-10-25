package ejercicio9;
public class Main {
    public static void main(String[] args) {
        Cuenta C1= new Cuenta("95.912.905"); 
        Cuenta C2 =new Cuenta("92.912.606", 35000); 

        System.out.println(C2);
        C2.depositar(10000);        
        System.out.println(C2); 
        C2.extraer(1000); 
        System.out.println(C2);
        C2.extraer(100000);//probamos de extraer importe mayor al saldo
        System.out.println(C2);
    }
}
