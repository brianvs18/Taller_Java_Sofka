package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        double valor;
        double subtotal;
        double total;
        final int iva = 21;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la compra: ");
        valor = sc.nextDouble();

        subtotal = (valor * iva) / 100;
        total = valor + subtotal;

        System.out.println("Valor compra: "+valor+"\nIVA 21%: "+subtotal+"\nEl valor total es: "+total);
    }
}
