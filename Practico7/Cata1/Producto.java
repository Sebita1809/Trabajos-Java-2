package Practico7.Cata1;

public class Producto implements Pagable {

    private String nombre;
    private double precio;
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    @Override
    public double calcularTotal() {
        return precio;
    }
    public void getNombre() {
        return;
    }
}
