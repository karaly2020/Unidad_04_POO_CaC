/*Escriba un método para realizar la búsqueda del nombre de un cliente (Clase Cliente) guardado 
en un ArrayList de clientes. El cliente a buscar será ingresado por consola por el usuario. El método 
deberá devolver true en caso de que ese nombre exista, sino false. El método buscarCliente podría estar
dentro de una clase llamada Local. La clase Cliente deberá tener al menos los atributos: id (int) y nombre 
(String), sus correspondientes getters y setters y su constructor Cliente(int id, String nombre). */
package ejercicio11;
public class Cliente {
    private String nombre; 
    private int id; 
    
    public Cliente() {
    }
    public Cliente(String nombre, int id) {
       this.nombre = nombre;
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
