package Ejercicio_11;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_11 {
    public static void main(String[] args) {
        String frase;
        int vocales = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        frase = sc.nextLine();

        for (int i = 0; i <= frase.length()-1; i++)
        {
            if((frase.charAt(i)=='a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i') || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u'))
            {
                vocales++;
            }
        }

        System.out.println("Longitud: "+frase.length());
        System.out.println("Cantidad vocales: "+vocales);
    }
}
