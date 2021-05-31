package Ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza";
        String fraseCambiada;
        String fraseIngresada;

        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba la frase para combinar: ");
        fraseIngresada = sc.nextLine();

        fraseCambiada = frase.replace("a", "e");
        System.out.println("Anterior: "+frase);
        System.out.println("Cambiada: "+fraseCambiada);
        System.out.println("Unidas: "+fraseCambiada + " "+ fraseIngresada);
    }
}
