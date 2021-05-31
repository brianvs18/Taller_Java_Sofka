package Ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion=0;
        do
        {
            menu();
            System.out.print("Seleccione una opcion: ");
            opcion = sc.nextByte();

            switch (opcion)
            {
                case 1:
                    menu();
                    break;
                case 2:
                    menu();
                    break;
                case 3:
                    menu();
                    break;
                case 4:
                    menu();
                    break;
                case 5:
                    menu();
                    break;
                case 6:
                    menu();
                    break;
                case 7:
                    menu();
                    break;
                case 8:
                    System.out.println("**** Salió ****");
                    break;
                default:
                    System.out.println("**** Opcion incorrecta ****");
                    break;
            }
        }while(opcion != 8);
    }

    public static void menu()
    {
        System.out.println("***** GESTION CINEMATOGRAFICA *****");
        System.out.println("1-NUEVO ACTOR \n2-BUSCAR ACTOR \n3-ELIMINAR ACTOR \n4-MODIFICAR ACTOR" +
                "\n5-VER TODOS LOS ACTORES \n6-VER PELICULAS DE LOS ACTORES" +
                "\n7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
                "\n8-SALIR");
    }
}
