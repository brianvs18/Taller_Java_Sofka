package Ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args) {
        String texto;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        texto = sc.nextLine();

        System.out.println(texto.replace(" ", ""));
    }
}
