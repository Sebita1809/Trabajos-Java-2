package ClaseInterfazYErrores;

public class Temperatura implements Convertible{

    private double centigrados;

    public Temperatura(double centigrados) {
        this.centigrados = centigrados;
    }

    @Override
    public String convertir() {
        return "La temperatura ingresada se convirtio a Fahrenheit y serian: " + (centigrados * 9/5) + 32;
    }
}
