package Practico4;

import java.util.Random;

public class Empleado {

    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    Random random = new Random();

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados++;
    }

    public Empleado(String nombre, String puesto){
        this.id = random.nextInt(100000);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000;
        Empleado.totalEmpleados++;
    }

    public void actualizarSalario(int porcentajeAumento){
        this.salario += this.salario * porcentajeAumento / 100;
    }

    public void actualizarSalario(double cantidadAumento){
        this.salario += cantidadAumento;
    }

    public static void mostrarTotalEmpleados(){
        System.out.println("El total de empleados registrados son: " + Empleado.totalEmpleados);
    }

    @Override
    public String toString(){
        return "Practico4.Empleado{ ID: " + id + " Nombre: " + nombre + " Puesto: " + puesto + " Salario " + salario + "}";
    }
}
