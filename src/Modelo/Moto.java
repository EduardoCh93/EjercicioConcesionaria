package Modelo;

public class Moto extends Vehiculo{

    private String cilindradaDeLaMoto;

    public Moto(String marca, String modelo,String cilindrada, String precio){
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
        return getMarcaVehiculo()+"//"+getModeloVehiculo()+"//"+getCilindradaDeLaMoto()+"//"+getPrecioVehiculo();
    }

    @Override
    public String imprimirDatos(){
        return mostrarDatosDeLaMoto();
    }

}
