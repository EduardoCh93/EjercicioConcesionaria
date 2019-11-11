package fiuba.algo3.AlgoChess.acciones;

import fiuba.algo3.AlgoChess.entidades.Unidad;
import fiuba.algo3.AlgoChess.tableroycasilleros.Tablero;

import java.util.ArrayList;

public class RangoLargo extends Rango{
    private int minimo;

    public RangoLargo(Tablero tablero){
        super(tablero);
        this.minimo = 6;
    }

    @Override
    public ArrayList<Unidad> listaDeUnidadesAfectados(int x, int y) {
        ArrayList<Unidad> unidades = new  ArrayList<Unidad>();
        int rango = this.minimo;
        while(unidades.size() == 0){
            listaDeUnidades(x,y,rango,unidades);
            rango++;
        }
        if(unidades.size() > 0){
            Unidad unidadAtacar = unidades.get(0); //primer enemigo alcanzado
            return iterador(unidadAtacar,1);
        }
        return unidades;
    }

    public ArrayList<Unidad> iterador(Unidad unidad,int cantidad){
        ArrayList<Unidad> unidades = new  ArrayList<Unidad>();
        unidades.add(unidad);
        while(cantidad <= unidades.size()){
            int x = unidades.get(cantidad -1).getUbicacion().getX();
            int y = unidades.get(cantidad- 1).getUbicacion().getY();
            listaDeUnidades(x,y,1,unidades);
            cantidad++;
        }
        return unidades;
    }
}
