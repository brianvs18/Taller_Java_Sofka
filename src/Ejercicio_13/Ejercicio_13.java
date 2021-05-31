package Ejercicio_13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio_13 {
    public static void main(String[] args) {
        Date fecha = new Date();
        String formato = "yyyy/MM/dd HH:mm:ss";
        SimpleDateFormat formats = new SimpleDateFormat(formato);
        System.out.println("Fecha: "+formats.format(fecha));
    }
}
