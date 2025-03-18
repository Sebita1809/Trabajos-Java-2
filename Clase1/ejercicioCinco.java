package Clase1;

import java.util.Scanner;

public class ejercicioCinco {
    public static void main(String[]args){
        double num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        num = sc.nextDouble();

        if(num > 0){
            System.out.println("El numero ingresado es positivo");
        } else {
            System.out.println("El numero ingresado es negativo");
        }
    }
}
