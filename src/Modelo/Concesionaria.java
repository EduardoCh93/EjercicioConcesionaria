package Modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.spi.TimeZoneNameProvider;

public class Concesionaria implements BusquedaYOrdenamiento {

    private ArrayList<Vehiculo> listaDeVehiculos;


    public Concesionaria(){
        this.listaDeVehiculos = new ArrayList<Vehiculo>();
    }

    private void imprimirListaDeVehiculos(){
        for(int i=0;i<this.listaDeVehiculos.size();i++) {
            System.out.println(this.listaDeVehiculos.get(i).imprimirDatos());
        }
    }

    @Override
    public ArrayList ordenamientoDeMayorAMenor(ArrayList lista){
        lista.sort(Comparator.comparing(Vehiculo::getPrecioVehiculo));
        Collections.reverse(lista);
        return lista;
    }

    @Override
    public ArrayList ordenamientoDeMenorAMayor(ArrayList lista){
        lista.sort(Comparator.comparing(Vehiculo::getPrecioVehiculo));
        return lista;
    }

    @Override
    public ArrayList busquedaPorLetra(String letra){
        ArrayList<Vehiculo> listaDeCoincidencias = new ArrayList<Vehiculo>();
        this.listaDeVehiculos.forEach(vehiculo -> {
            if(vehiculo.getModeloVehiculo().indexOf(letra)!=-1){
                listaDeCoincidencias.add(vehiculo);
            }
        });
        return listaDeCoincidencias;
    }

    private void imprimirLista(ArrayList<Vehiculo> lista){
        for(int i = 0; i<lista.size();i++){
            System.out.println(lista.get(i).imprimirMarcaModeloYPrecio()+"\n");
        }
    }

    private void imprimirDatosParticulares(){
        ArrayList<Vehiculo> listaAuxiliar = this.listaDeVehiculos;
        ordenamientoDeMayorAMenor(listaAuxiliar);
        System.out.println("Vehiculo más caro: "+listaAuxiliar.get(0).imprimirMarcaModelo());
        ordenamientoDeMenorAMayor(listaAuxiliar);
        System.out.println("Vehiculo más barato: "+listaAuxiliar.get(0).imprimirMarcaModelo());
        listaAuxiliar = this.busquedaPorLetra("Y");//Asigno la letra a buscar para usarla por default;
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: ");
        imprimirLista(listaAuxiliar);
    }

    public void imprimirDatos(){
        this.imprimirListaDeVehiculos();
        System.out.println("=============================================");
        this.imprimirDatosParticulares();
        System.out.println("=============================================");
    }


    public void cargarDatos(){
        Auto auto = new Auto("Peugeot","206","4","200.000,00");
        listaDeVehiculos.add(auto);
        Moto moto = new Moto("Honda","Titan","125c","60.000,00");
        listaDeVehiculos.add(moto);
        Auto auto1 = new Auto("Peugeot","208","5","250.000,00");
        listaDeVehiculos.add(auto1);
        Moto moto1 = new Moto("Yamaha","YBR","160c","80.500,50");
        listaDeVehiculos.add(moto1);
    }
}
