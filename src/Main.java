import Modelo.Concesionaria;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale locale = new Locale ("es", "ES");
        NumberFormat objNF2 = NumberFormat.getInstance (locale);
        Concesionaria concesionaria = new Concesionaria();
        concesionaria.cargarDatos();
        concesionaria.imprimirDatos();
    }
}
