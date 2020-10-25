/*Construir una clase denominada Factura, hija de la clase Precio y que posea 2 atributos específicos 
llamados emisor y cliente (que deberán ser los números de CUIT de ellos) y, al menos, 1 método llamado 
imprimirFactura que deberá mostrar los datos de esa factura. La clase Precio tendrá los atributos que se 
listan a continuación, al menos un constructor, sus getters y setters y el método toString*/
package ejercicio8;
public class Precio {
    protected double importeNeto;
    protected double porcentajeIva;

    public Precio() {
    }

    public Precio(double importeNeto, double pocentanjeIva) {
        this.importeNeto = importeNeto;
        this.porcentajeIva = pocentanjeIva;
    }

    public double getImporteNeto() {
        return importeNeto;
    }

    public void setImporteNeto(double importeNeto) {
        this.importeNeto = importeNeto;
    }

    public double getPocentanjeIva() {
        return porcentajeIva;
    }

    public void setPocentanjeIva(double pocentanjeIva) {
        this.porcentajeIva = pocentanjeIva;
    }
    
     public double getImporteIva(){
      double importeIva= (importeNeto*porcentajeIva)/100; 
      return importeIva; 
    }

    public double getImporteTotal(){
      double importeTotal= importeNeto+((importeNeto*porcentajeIva)/100); 
      return importeTotal; 
    }

    @Override
    public String toString() {
         return "Importe Neto: $"+importeNeto+ "\nIva "+getPocentanjeIva()+"%: $"+getImporteIva()
                 +"\nImporte Total: $"+getImporteTotal(); 
    }
}
