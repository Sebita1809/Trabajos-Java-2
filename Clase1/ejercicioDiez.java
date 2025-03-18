package Clase1;

import java.util.Scanner;

public class ejercicioDiez {
    public static void main  (String[]args){
        double salario;
        double horasExtras;
        double precioHora;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el salario basico de empleado");
        salario = sc.nextDouble();
        System.out.println("Ingerse la cantidad de horas extras trabajadas");
        horasExtras = sc.nextDouble();

        precioHora = salario / 8;

        System.out.println("El salario correspondiente por sus horas trabajadas es de: " + (salario + precioHora * horasExtras));

    }
}
