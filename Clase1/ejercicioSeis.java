package Clase1;

import java.util.Scanner;

public class ejercicioSeis {
    public static void main(String[]args){
        double numI;
        double numII;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        numI = sc.nextDouble();
        System.out.println("Ahora ingrese el segundo numero");
        numII = sc.nextDouble();

        if(numI == numII){
            System.out.println("Ambos numeros son iguales");
        } else if (numI > numII) {
            System.out.println(numI + " es el mayor de los dos");
        } else {
            System.out.println(numII + " es el mayor de los dos");
        }
    }
}
