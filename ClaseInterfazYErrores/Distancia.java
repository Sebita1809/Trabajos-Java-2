package ClaseInterfazYErrores;

public class Distancia implements Convertible{

    private double distancia;

    public Distancia(double distancia) {
        this.distancia = distancia;
    }

    @Override
    public String convertir() {
        return "La distancia ingresada se encuentra en metros, su conversion a centimetros seria: " + distancia*100;
    }
}
