package Ejercicio_17;

public class Electrodomestico {
    protected final static int precio_baseDefecto= 100;
    protected final static String colorDefecto = "Blanco";
    protected final static String consumo_energeticoDefecto = "F";
    protected  final static int pesoDefecto = 5;

    protected int precio_base;
    protected String color;
    protected String consumo_energetico;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio_base, int peso) {
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(int precio_base, String color, String consumo_energetico, int peso) {
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }

    public int getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo_energetico() {
        return consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }
}
