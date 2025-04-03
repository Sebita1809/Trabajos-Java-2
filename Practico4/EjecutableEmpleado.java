package Practico4;

public class EjecutableEmpleado {
    public static void main(String[]args){

        Empleado empleado1 = new Empleado(1,"Marcelo", "Analista en Sistemas", 110000.0);
        Empleado empleado2 = new Empleado("Agostina", "Lider de proyecto");
        Empleado empleado3 = new Empleado("Martin", "Secretario");
        Empleado empleado4 = new Empleado(2, "Cintia", "Directora de marketing", 200000.0);

        System.out.println(empleado1);
        System.out.println(empleado2);
        empleado2.actualizarSalario(20500.0);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        empleado4.actualizarSalario(10);
        System.out.println(empleado4);

        Empleado.mostrarTotalEmpleados();

    }
}
