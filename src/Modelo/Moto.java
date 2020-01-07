package Modelo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Moto extends Vehiculo{

    private String cilindradaDeLaMoto;

    public Moto(String marca, String modelo,String cilindrada,double precio){
        super(marca, modelo, precio);
        this.cilindradaDeLaMoto = cilindrada;
    }

    public void setCilindradaDeLaMoto(String cilindrada){
        this.cilindradaDeLaMoto = cilindrada;
    }

    private String getCilindradaDeLaMoto() {
        return this.cilindradaDeLaMoto;
    }

    private String mostrarDatosDeLaMoto(){
       return "Marca: "+getMarcaVehiculo()+" // Modelo: "+getModeloVehiculo()+" // Puertas: "
               +getCilindradaDeLaMoto()+" // Precio: $"+formatoDeNumero(getPrecioVehiculo());
    }

    @Override
    public String imprimirDatos(){
      return mostrarDatosDeLaMoto();
    }

}
