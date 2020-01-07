package Modelo;

import java.util.ArrayList;
import java.util.Hashtable;

public class Concesionaria implements BusquedaYOrdenamiento{

    private ArrayList<Vehiculo> listaDeVehiculos;
    //private

    public Concesionaria(){
        this.listaDeVehiculos = new ArrayList<Vehiculo>();
    }

    private void imprimirListaDeVehiculos(){
        for (Vehiculo listaDeVehiculo : this.listaDeVehiculos) {
            System.out.println(listaDeVehiculo.imprimirDatos());
        }
    }

    @Override
    public ArrayList ordenamientoDeMayorAMenor(ArrayList lista){
        //lista.sort(new Ordenamiento());
        return lista;
    }

    @Override
    public ArrayList ordenamientoDeMenorAMayor(ArrayList lista){
       // Collections.reverseOrder(new Ordenamiento());
       // Hashtable<String, Vehiculo> ordenado
        return ordenarLista(lista);
    }

    private void compararEIntercambiar(Vehiculo vehiculo1,Vehiculo vehiculo2){
        Vehiculo aux = null;
        /*if(vehiculo1.getPrecioVehiculo().equals(vehiculo2.getPrecioVehiculo())){
            aux = vehiculo1;
            vehiculo1 = vehiculo2;
            vehiculo2 = aux;
        }*/
    }

    private ArrayList ordenarLista(ArrayList<Vehiculo> lista){
        for(int i = 0;i<lista.size()-1;i++){
            compararEIntercambiar(lista.get(i),lista.get(i+1));
        }
        return lista;
    }

    @Override
    public ArrayList busquedaPorLetra(String letra){
        ArrayList<Vehiculo> listaDeCoincidencias = new ArrayList<>();
        this.listaDeVehiculos.forEach(vehiculo -> {
            if(vehiculo.getModeloVehiculo().contains(letra)){
                listaDeCoincidencias.add(vehiculo);
            }
        });
        return listaDeCoincidencias;
    }

    private void imprimirLista(ArrayList<Vehiculo> lista){
        for (Vehiculo vehiculo : lista) {
            System.out.println(vehiculo.imprimirMarcaModeloYPrecio());
        }
    }

    private void imprimirDatosParticulares(){
        ArrayList<Vehiculo> listaAuxiliar = this.listaDeVehiculos;
        ordenamientoDeMayorAMenor(listaAuxiliar);
        System.out.println("Vehiculo más caro: "+listaAuxiliar.get(0).imprimirMarcaModelo());
        ordenamientoDeMenorAMayor(listaAuxiliar);
        System.out.println("Vehiculo más barato: "+listaAuxiliar.get(0).imprimirMarcaModelo());
        listaAuxiliar = this.busquedaPorLetra("Y");//Asigno la letra a buscar para usarla por default;
        System.out.println("Vehículo que contiene en el modelo la letra ‘Y’:");
        imprimirLista(listaAuxiliar);
    }

    private void imprimirListaDeMayorAMenorPrecio(){
        ArrayList<Vehiculo> listaAuxiliar = this.listaDeVehiculos;
        ordenamientoDeMayorAMenor(listaAuxiliar);
        System.out.println("Vehículos ordenados por precio de mayor a menor: ");
        for (Vehiculo vehiculo : listaAuxiliar) {
            System.out.println(vehiculo.imprimirMarcaModelo());
        }
    }

    public void imprimirDatos(){
        this.imprimirListaDeVehiculos();
        System.out.println("=============================================");
        this.imprimirDatosParticulares();
        System.out.println("=============================================");
        this.imprimirListaDeMayorAMenorPrecio();
    }


    public void cargarDatos(){
        Auto auto = new Auto("Peugeot","206","4",200000);
        listaDeVehiculos.add(auto);
        Moto moto = new Moto("Honda","Titan","125c",60000);
        listaDeVehiculos.add(moto);
        Auto auto1 = new Auto("Peugeot","208","5",250000);
        listaDeVehiculos.add(auto1);
        Moto moto1 = new Moto("Yamaha","YBR","160c", 80500.50);
        listaDeVehiculos.add(moto1);
    }
}
