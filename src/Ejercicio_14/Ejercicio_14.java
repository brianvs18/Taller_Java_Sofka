package Ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = sc.nextInt();

        while(numero <= 1000)
        {
            System.out.println(numero);
            numero+=2;
        }

    }
}
