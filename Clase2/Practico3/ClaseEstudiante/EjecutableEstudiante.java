package Clase2.Practico3.ClaseEstudiante;

public class EjecutableEstudiante {

    public static void main(String[]args){

        Estudiante estudiante1 = new Estudiante("Matias", "Morales", "Ingenieria Civil", 8.0);
        estudiante1.mostarInfo();
        estudiante1.subirCalificacion(8);
        System.out.println("Calificacion actual: " + estudiante1.getCalificaciones()); //Este println es para
        // corroborar si se sumaron los puntos a la calificacion
        estudiante1.bajarCalificacion(3);
        System.out.println("Calificacion actual: " + estudiante1.getCalificaciones()); //Este print es para
        // corroborar si se restaron los puntos
    }
}
