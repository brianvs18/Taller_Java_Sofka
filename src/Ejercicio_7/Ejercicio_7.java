package Ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Ingrese un número: ");
            numero = sc.nextInt();

            if(numero >= 0)
            {
                break;
            }
        }while (true);
        System.out.println("Número ingresado: "+numero);
    }
}
