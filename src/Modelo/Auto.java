package Modelo;

public class Auto extends Vehiculo {

    private int cantidadDePuertas;

    public Auto(){
        super();
        this.cantidadDePuertas = 0;
    }

    public void setCantidadDePuertas(int cantidad){
        this.cantidadDePuertas = cantidad;
    }

}
