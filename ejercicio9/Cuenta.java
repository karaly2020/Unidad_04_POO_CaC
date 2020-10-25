/*Crear una clase llamada Cuenta que tendrá los siguientes atributos: dniTitular y saldo (puede tener decimales). 
El dniTitular será obligatorio y el saldo es opcional. Crea dos constructores que cumplan con lo anterior. 
Crea sus métodos get y set (excepto para saldo que no deberá tener set) y toString.
La clase tendrá dos métodos más:
● depositar(double importe): se ingresa un importe a la cuenta, si el importe es negativo o cero, no se hará
nada y el método devolverá false (error), caso contrario deberá retornar true (ok) y actualizar el saldo de la cuenta.
● extraer(double importe): se retira una cantidad determinada de la cuenta. Si la resta entre el saldo 
actual y el importe a extraer da negativo, retornar false; caso contrario, retornar true y actualizar el saldo de 
la cuenta.*/
package ejercicio9;
public class Cuenta {
    private String dniTitular;
    private double saldo;

    public Cuenta(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public Cuenta(String dniTitular, double saldo) {
        this.dniTitular = dniTitular;
        this.saldo = saldo;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "DNI Titular: " + dniTitular + "\nSaldo: " + saldo;
    }

    public boolean depositar(double importe){
       if(importe<=0){
            return false;
       }else{
            this.saldo=saldo+importe; 
            return true;
        }
    }
    
    public boolean extraer(double importe){
        double saldoActual=this.saldo-importe; 
        if (saldoActual<0){
            System.out.println("La extracción no puede realizarse, saldo insuficiente");
            return false; 
        }else{
            this.saldo=saldoActual; 
            System.out.println("La extracción fué realizada con éxito");
            return true;
        }
    }
}
