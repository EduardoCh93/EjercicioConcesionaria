package Modelo;

public abstract class Vehiculo implements ImpresionDeDatos{

    protected String marcaVehiculo;
    protected String modeloVehiculo;
    protected String precioVehiculo;

    public Vehiculo(String marca, String modelo, String precio){
        this.marcaVehiculo = marca;
        this.modeloVehiculo = modelo;
        this.precioVehiculo = precio;
    }

    public void setMarcaVehiculo(String marca){
        this.marcaVehiculo = marca;
    }

    public void setModeloVehiculo(String modelo){
        this.modeloVehiculo = modelo;
    }

    public void setPrecioVehiculo(String precio){
        this.precioVehiculo = precio;
    }

    public String getMarcaVehiculo(){
        return this.marcaVehiculo;
    }

    public String getModeloVehiculo(){
        return this.modeloVehiculo;
    }

    public String getPrecioVehiculo() {
        return precioVehiculo;
    }

    public abstract String imprimirDatos();

    @Override
    public String imprimirMarcaModelo(){
        return getMarcaVehiculo()+" "+getModeloVehiculo();
    }

    @Override
    public String imprimirMarcaModeloYPrecio(){
        return getMarcaVehiculo()+" "+getModeloVehiculo()+" "+getPrecioVehiculo();
    }

}
