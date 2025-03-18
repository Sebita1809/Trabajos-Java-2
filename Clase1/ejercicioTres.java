package Clase1;

import java.util.Scanner;

public class ejercicioTres {
    public static void  main(String[]args){
        int numI;
        int numII;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese el primer numero:");
        numI = sc.nextInt();

        System.out.println("Ahora ingrese el segundo numero");
        numII = sc.nextInt();

        System.out.println("El resultado de la suma de ambos numeros es: " + (numI + numII));
        System.out.println("El resultado de la resta de ambos numeros es: " + (numI - numII));
        System.out.println("El resultado de la multiplicacion de ambos numeros es: " + (numI * numII));
        System.out.println("El resultado de la division entre ambos numeros es: " + (numI / numII));
        System.out.println("El modulo resultante entre ambos modulos es: " + (numI % numII));

    }
}
