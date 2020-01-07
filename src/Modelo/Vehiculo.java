package Modelo;

public abstract class Vehiculo {

    private String marcaVehiculo;
    private String modeloVehiculo;
    private long precioVehiculo;

   /* public Vehiculo(){
        this.precioVehiculo = 0;
        this.marcaVehiculo = " ";
        this.modeloVehiculo = " ";
    }*/

    public void setMarcaVehiculo(String marca){
        this.marcaVehiculo = marca;
    }

    public void setModeloVehiculo(String modelo){
        this.modeloVehiculo = modelo;
    }

    public void setPrecioVehiculo(long precio){
        this.precioVehiculo = precio;
    }

}
