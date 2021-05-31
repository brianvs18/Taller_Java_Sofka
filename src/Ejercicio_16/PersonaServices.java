package Ejercicio_16;

public class PersonaServices {
    Persona persona = new Persona();

    public void calcularIMC()
    {
        int resultado = 0;
        double calculoPeso = resultadoPeso();

        if(calculoPeso < 20)
        {
            resultado = -1;
            System.out.println(resultado);
        }
        else if(calculoPeso >= 20 && calculoPeso <= 25)
        {
            resultado = 0;
            System.out.println(resultado);
        }
        else if(calculoPeso > 25)
        {
            resultado = 1;
            System.out.println(resultado);
        }
    }

    private double resultadoPeso()
    {
        double resultado_peso;
        resultado_peso = Math.ceil((double) (persona.getPeso()) / (Math.pow(persona.getAltura(), 2)));
        return resultado_peso;
    }

    public void esMayorDeEdad()
    {
        int edad = persona.getEdad();
        boolean mayorEdad;

        if(edad >= 18)
        {
            mayorEdad = true;
            System.out.println(mayorEdad);
        }
        else
        {
            mayorEdad = false;
            System.out.println(mayorEdad);
        }
    }

    public void imprimirPersonas()
    {
        System.out.println(toString());
    }

    public String toString()
    {
        String personas = "Nombre: "+ persona.getNombre() +"\n" +
                "DNI: "+persona.getDni() + "\n" +
                "Edad: "+persona.getEdad() + "\n" +
                "Peso: "+persona.getPeso() + "\n" +
                "Altura: "+persona.getAltura();
        return personas;
    }

    private int generarDNI()
    {
        int documento;
        documento = (int) (Math.random()*(9999999 - 1000000)+1000000);
        return documento;
    }

    public void crearDNI()
    {
        String dni = "";
        dni = (persona.getNombre().charAt(0)+1) + String.valueOf(generarDNI());
        persona.setDni(dni);
    }
}
