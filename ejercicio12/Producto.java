/*Un supermercado nos pide que hagamos una pequeña aplicación que almacene los productos pasados 
por el escáner. La aplicación debe almacenar Productos (clase) y la cantidad comprada. Para ello deberá
tener un ArrayList de compras y cada elemento de la lista deberá tener un objeto de tipo Producto y una 
cantidad de tipo int. La compra al crearse contendrá un precio (puede generarlo aleatoriamente) y una 
cantidad asociada que también puede ser generado de esa forma si lo desea. El nombre del producto será 
básico (producto1, producto2, producto3, etc.). Cree la clase Producto, la clase Compra y la clase Supermercado
que contendrá el ArrayList de compras. Calcule el precio total de una lista de entre 1 y 8 productos 
(aleatorio). Mostrar un ticket con todo lo vendido y el precio final como se hacen en los supermercados. 
Más o menos con este formato, lo importante son los datos, no el estilo:

***************Cantidad***Precio*****Total
Producto1 5 3.5 17.5
Producto2 7 2.5 17.5
Precio final 35
Nota: este ejercicio es una simplificación de un caso real. En un sistema real, la compra debería 
estar asociada a un Cliente y cada compra a su vez tendría un ArrayList de ítems de la compra que a su
vez contendría la información del producto y su correspondiente cantidad comprada.*/
package ejercicio12;
import java.text.DecimalFormat;
public class Producto {
     private int cantidad;
    private double precio;
    
    
    public Producto(int cantidad, double precio){
        this.cantidad=cantidad;
        this.precio=precio;
    }

    /**
     * Devuelve la cantidad de productos
     * @return Cantidad de producto
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Devuelve el precio
     * @return Precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Devuelve el precio final que tiene un producto
     * @return precio final
     */
    public double precioFinal(){
        
        //Formateamos el precio final por problemas de precision
        DecimalFormat df=new DecimalFormat("####,####");
        return Double.parseDouble(df.format(this.precio * this.cantidad));
    }
}
