package ClaseInterfazYErrores;

public interface Operacion {

    int operar(int a, int b);

    default void mostrarInfo(){
        System.out.println("Esto es una operacion matematica");
    }
}
