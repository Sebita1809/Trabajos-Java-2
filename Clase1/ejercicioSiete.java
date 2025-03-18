package Clase1;

import java.util.Scanner;

public class ejercicioSiete {
    public static void  main(String[]args) {
        int edad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad < 0){
            System.out.println("Edad ingresada no valida");
        }else if(edad < 13){
            System.out.println("Usted es un niño");
        } else if (edad < 18) {
            System.out.println("Usted es un adolescente");
        } else {
            System.out.println("Usted es un adulto");
        }
    }
}
