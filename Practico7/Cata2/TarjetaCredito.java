package Practico7.Cata2;

public class TarjetaCredito implements Pago, PagoConDescuento {

    private String numeroTarjeta;
    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago de $" + monto + " procesado con Tarjeta de Crédito " +
                numeroTarjeta);
    }
    @Override
    public double aplicarDescuento(double porcentaje) {
        return 1 - (porcentaje / 100);
    }

}
