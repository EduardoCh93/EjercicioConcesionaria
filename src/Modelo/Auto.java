package Modelo;

public class Auto extends Vehiculo{

    private String cantidadDePuertas;

    public Auto(String marca, String modelo,String puertas, String precio){
        super(marca,modelo,precio);
        this.cantidadDePuertas = puertas;
    }

    public void setCantidadDePuertas(String cantidad){
        this.cantidadDePuertas = cantidad;
    }

    public String getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    private String mostrarDatosDelAuto(){
        return "Marca: "+getMarcaVehiculo()+" // Modelo: "+getModeloVehiculo()+" // Puertas: "
                +getCantidadDePuertas()+" // Precio: $"+getPrecioVehiculo();
    }

    @Override
    public String imprimirDatos(){
        return mostrarDatosDelAuto();
    }

    //Este metodo se creo para automatizar la carga de datos
    public void cargarDatos(){
        this.setModeloVehiculo("206");
        this.setMarcaVehiculo("Peugeot");
        this.setCantidadDePuertas("4");
        this.setPrecioVehiculo("200.000,00");
    }
}
