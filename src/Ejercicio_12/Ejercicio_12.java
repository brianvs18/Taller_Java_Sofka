package Ejercicio_12;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        String palabra1;
        String palabra2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        palabra1 = sc.nextLine();

        System.out.print("Ingrese otra palabra: ");
        palabra2 = sc.nextLine();

        if(palabra1.equals(palabra2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("Son diferentes");
            System.out.println("Palabra 1: "+palabra1+"\nPalabra 2: "+palabra2);
        }
    }
}
