package Ejercicio_3;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String radio;
        double area;

        System.out.print("Ingrese el radio del circulo: ");
        radio = sc.nextLine();

        area = Math.PI * Math.pow(Double.parseDouble(radio), 2);

        System.out.print("El area del circulo es: "+area);

    }
}
