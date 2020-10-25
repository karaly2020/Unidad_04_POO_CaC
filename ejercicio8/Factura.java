package ejercicio8;
public class Factura extends Precio {
    private String emisor;
    private String cliente;

    public Factura() {
    }

    public Factura(String emisor, String cliente) {
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public Factura(String emisor, String cliente, double importeNeto, double porcentajeIva) {
        super(importeNeto, porcentajeIva);
        this.emisor = emisor;
        this.cliente = cliente;
    }

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
                    
    @Override
    public String toString() {
        return "Emisor: " + emisor + "\nCliente: " + cliente ;
    }
     public void imprimirFactura(){
        System.out.println("Factura: \n"+ this.toString());
        System.out.println("Precio: \n"+ super.toString());
    }
}
