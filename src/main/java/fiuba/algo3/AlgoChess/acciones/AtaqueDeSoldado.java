package fiuba.algo3.AlgoChess.acciones;

import fiuba.algo3.AlgoChess.entidades.Unidad;
import fiuba.algo3.AlgoChess.tableroycasilleros.Tablero;

import java.util.ArrayList;

public class AtaqueDeSoldado extends Habilidad {
    private int danioCuerpoACuerpo;

    public AtaqueDeSoldado(Tablero tablero){
        super(new Rango(tablero));
        this.danioCuerpoACuerpo = 10;
    }

    public void activarHabilidad(Unidad unidad){
        ArrayList<Unidad> unidadesAfectados = rangoDelAtaque(unidad.getUbicacion().getX(),unidad.getUbicacion().getY());
        //realizar ataque ala lista de unidades
    }

    public ArrayList<Unidad> rangoDelAtaque(int x, int y){
        ArrayList<Unidad> unidadesAfectados = new ArrayList<Unidad>();
        this.listaDeUnidadesAfectadas(x,y,1,unidadesAfectados);
        this.listaDeUnidadesAfectadas(x,y,2,unidadesAfectados);
        return unidadesAfectados;
    }
}
