package ClaseInterfazYErrores;

public class Tiempo implements Convertible{

    private int horas;

    public Tiempo(int horas) {
        this.horas = horas;
    }

    @Override
    public String convertir() {
        return "La cantidad de horas ingresadas convertidas a segundos serian: " + horas * 3600;
    }
}
