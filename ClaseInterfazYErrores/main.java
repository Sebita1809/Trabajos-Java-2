package ClaseInterfazYErrores;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void validarEdad(int edad) throws EdadInvalidaException{
        if (edad < 0 || edad > 130){
            throw new EdadInvalidaException("La edad ingresada no es valida: " + edad);
        } else {
            System.out.println("La edad ingresada es valida " + edad);
        }
    }

    public static void main(String[]args){
        /*
        Rectangulo r = new Rectangulo();
        System.out.println(r.calcularPerimetro(4, 6));
        System.out.println(r.calcularArea(4, 6));
        Factura f = new Factura();
        Producto p = new Producto();
        Cliente c = new Cliente();
        f.imprimir();
        p.imprimir();
        c.imprimir();
        Temperatura t = new Temperatura(18);
        Distancia d = new Distancia(12);
        Tiempo tiempo = new Tiempo(3);
        System.out.println(t.convertir());
        System.out.println(d.convertir());
        System.out.println(tiempo.convertir());
        Suma suma = new Suma();
        Multiplicacion multiplicacion = new Multiplicacion();
        System.out.println("La suma ente 5 y 3 es: " + suma.operar(5, 3));
        suma.mostrarInfo();
        System.out.println("La multiplicacion entre 5 y 3 es: " + multiplicacion.operar(5, 3));
        multiplicacion.mostrarInfo();
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        List<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(vaca);
        for (Animal animal:animales){
            animal.hacerSonido();
        }*/
        /*
        System.out.println("Ingrese su edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();

        try {
            validarEdad(edad);
        } catch (EdadInvalidaException e){
            System.out.println("Se ha producido un error: " + e.getMessage());
        }
        */

        try {
            System.out.println("Ingrese un numero");
            Scanner sc = new Scanner(System.in);
            int numero1 = sc.nextInt();
            System.out.println("Ahora el numero por el que lo quiere dividir");
            int numero2 = sc.nextInt();
            double resultado = numero1 / numero2;

        } catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Error " + e.getMessage());
        }
    }
}
