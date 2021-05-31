package Ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.print("Ingrese un número: ");
        numero1 = sc.nextInt();

        System.out.print("Ingrese otro número: ");
        numero2 = sc.nextInt();

        if(numero1 > numero2)
        {
            System.out.println("EL numero 1 es mayor");
        }
        else if(numero2 > numero1)
        {
            System.out.println("El numero 2 es mayor");
        }
        else if(numero1 == numero2)
        {
            System.out.println("Los numeros son iguales");
        }
    }
}
