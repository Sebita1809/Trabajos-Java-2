package Clase1;

import java.util.Scanner;

public class ejercicioOcho {
    public static void main(String[]args){
        int dia;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese un numero del 1 al 7 (se encuentran incluidos estos mismos)");
        dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("El dia es Lunes");
                break;
            case 2:
                System.out.println("El dia es Martes");
                break;
            case 3:
                System.out.println("El dia es Miercoles");
                break;
            case 4:
                System.out.println("El dia es Jueves");
                break;
            case 5:
                System.out.println("El dia es Viernes");
                break;
            case 6:
                System.out.println("El dia es Sabado");
                break;
            case 7:
                System.out.println("El dia es Domingo");
                break;
            default:
                System.out.println("El numero ingresado no se encuentra entre el rango pedido");
        }
    }
}
