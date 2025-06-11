package Practico7.Cata1;

import java.util.ArrayList;

public class Pedido {

    private List<Producto> productos;
    public Pedido() {
        this.productos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

}
