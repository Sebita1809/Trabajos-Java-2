package ClaseInterfazYErrores;

public class Rectangulo implements Figura{

    @Override
    public double calcularArea(double ladoA, double ladoB) {
        return ladoA * ladoB;
    }

    @Override
    public double calcularPerimetro(double ladoA, double ladoB) {
        return ladoA*2 + ladoB*2;
    }
}
