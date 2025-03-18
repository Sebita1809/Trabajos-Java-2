package Clase1;

import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[]args){
        String nombre;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingese su nombre:");
        nombre = sc.nextLine();
        System.out.println("Ahora ingrese su edad:");
        edad = sc.nextInt();
        System.out.println("Su nombre es " + nombre + " y tiene " + edad + " años");
    }
}
