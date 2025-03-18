package Clase1;

import java.util.Scanner;

public class ejercicioNueve {
    public static void main(String[]args){
        double num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num = sc.nextDouble();

        if (num % 2 == 0){
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
