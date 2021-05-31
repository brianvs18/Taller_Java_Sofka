package Ejercicio_8;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {

        String dia;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un día de la semana: ");
        dia = sc.nextLine();

        switch (dia.toUpperCase())
        {
            case "LUNES":
                diaLaboral();
                break;
            case "MARTES":
                diaLaboral();
                break;
            case "MIERCOLES":
                diaLaboral();
                break;
            case "JUEVES":
                diaLaboral();
                break;
            case "VIERNES":
                diaLaboral();
                break;
            case "SABADO":
                finDeSemana();
                break;
            case "DOMINGO":
                finDeSemana();
                break;
        }
    }

    private static void diaLaboral()
    {
        System.out.println("Es un día laboral");
    }

    private static void finDeSemana()
    {
        System.out.println("No es un día laboral");
    }
}
