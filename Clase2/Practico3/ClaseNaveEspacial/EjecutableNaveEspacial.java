package Clase2.Practico3.ClaseNaveEspacial;

public class EjecutableNaveEspacial {
    public static void main(String[]args){

        NaveEspacial nave1 = new NaveEspacial("Apolo13", 50);
        nave1.despegar();
        nave1.avanzar(60);
        nave1.recargarCombustible(40);
        nave1.avanzar(60);
        nave1.mostrarEstado();

    };
}
