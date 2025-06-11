package Practico7.Kata3;

public class Main {
    public static void main(String[]args){

        Cliente cliente = new Cliente("Juan Pérez", "juan@mail.com");
        Pedido pedido = new Pedido(cliente);
        pedido.cambiarEstado("Enviado");
        pedido.cambiarEstado("Entregado");

    }
}
