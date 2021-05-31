package Ejercicio_17;

public class ElectrodomesticoServices {

    Electrodomestico electrodomestico = new Electrodomestico();

    String consumo = electrodomestico.getConsumo_energetico();
    int peso = electrodomestico.getPeso();

    //Comprobar consumo energetico
    public void comprobarConsumoEnergetico(String consumo)
    {
        String consumoEnergetico[] = {"a", "b", "c", "d", "e", "f"};
        boolean letraConsumo = false;

        for (int i = 0;i < consumoEnergetico.length && !letraConsumo; i++)
        {
            if(consumoEnergetico[i].equalsIgnoreCase(consumo))
            {
                letraConsumo = true;
            }
        }
        if(letraConsumo)
        {
            this.electrodomestico.consumo_energetico = consumo;
        }
        else
        {
            this.electrodomestico.consumo_energetico = electrodomestico.consumo_energeticoDefecto;
        }

    }

    //Comprobar color
    public void comprobarColor(String color)
    {
        String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
        boolean colorExistente = false;

        for (int i = 0;i < colores.length && !colorExistente; i++)
        {
            if(colores[i].equalsIgnoreCase(color))
            {
                colorExistente = true;
            }
        }

        if(colorExistente)
        {
            this.electrodomestico.color = color;
        }
        else
        {
            this.electrodomestico.color = electrodomestico.colorDefecto;
        }
    }

    public int precioFinal()
    {
        int precio = 0;
        if(consumo.equalsIgnoreCase("A"))
        {
            precio = 100;
        }
        else if(consumo.equalsIgnoreCase("B"))
        {
            precio = 80;
        }
        else if(consumo.equalsIgnoreCase("C"))
        {
            precio = 60;
        }
        else if(consumo.equalsIgnoreCase("D"))
        {
            precio = 50;
        }
        else if(consumo.equalsIgnoreCase("E"))
        {
            precio = 40;
        }
        else if(consumo.equalsIgnoreCase("F"))
        {
            precio = 10;
        }
        return precio;
    }
}
