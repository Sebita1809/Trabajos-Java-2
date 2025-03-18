package Clase1;

import java.util.Scanner;

public class ejercicioCuatro {
    public static void main(String[]args){
        double numI;
        double numII;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        numI = sc.nextDouble();
        System.out.println("Ahora ingrese el segundo numero");
        numII = sc.nextDouble();

        if(numI > 0 && numII > 0){
            System.out.println("Ambos numeros son positivos");
        } else {
            System.out.println("Los numeros ingresados no son positivos o por lo menos alguno no lo es");
        }
        if(numI > 10 && numII > 10){
            System.out.println("Ambos numeros son mayores a 10");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 10 o por lo menos alguno no lo es");
        }
    }
}
