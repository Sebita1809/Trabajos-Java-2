package Clase2.Practico3.ClaseLibro;

public class EjecutableLibro {
    public static void main(String[]args){

        Libro libro1 = new Libro("Alicia en el pais de las maravillas", "Lewis Carroll", 1966);
        libro1.setAnioPublicacion(1865); //Parametro invalido para comprobar validacion del setter
        libro1.setAnioPublicacion(1970);
        libro1.getTitulo();
        libro1.getAutor();
        libro1.getAnioPublicacion();
    }
}
