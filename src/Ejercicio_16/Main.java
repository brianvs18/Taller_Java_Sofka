package Ejercicio_16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        PersonaServices personaServices = new PersonaServices();

        personaServices.crearDNI();
        personaServices.imprimirPersonas();
        /*
        personaServices.calcularIMC();
        personaServices.esMayorDeEdad();
        personaServices.crearDNI();
        personaServices.imprimirPersonas();
        */
    }

    public static Persona ingresarDatos()
    {
        String nombre;
        int edad;
        int peso;
        double altura;

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();

        System.out.print("Ingrese su peso: ");
        peso = sc.nextInt();

        System.out.print("Ingrese su altura: ");
        altura = sc.nextDouble();

        Persona persona = new Persona(nombre, edad, peso, altura);

        return persona;
    }
}
