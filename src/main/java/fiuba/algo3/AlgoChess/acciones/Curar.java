package fiuba.algo3.AlgoChess.acciones;

import fiuba.algo3.AlgoChess.entidades.Unidad;
import fiuba.algo3.AlgoChess.tableroycasilleros.Tablero;

import java.util.ArrayList;

public class Curar extends Habilidad {
    private int curacion;
    private Unidad unidad;
    public Curar(Tablero tablero){
        super(new Rango(tablero));
        this.curacion = 15;
    }

    @Override
    public void activarHabilidad(Unidad unidad) {
        this.unidad = unidad;
        ArrayList<Unidad> unidadesAfectadas = rangoDeLaHabilidad(unidad.getUbicacion().getX(),unidad.getUbicacion().getY());
        if(unidadesAfectadas.size() > 0){
            unidadesAfectadas.get(0).sanarDanio(this.curacion);
        }
    }

    public ArrayList<Unidad> rangoDeLaHabilidad(int x, int y){
        ArrayList<Unidad> unidadesAfectadas = new ArrayList<Unidad>();
        this.listaDeUnidadesAfectadas(x,y,1,unidadesAfectadas);
        this.listaDeUnidadesAfectadas(x,y,2,unidadesAfectadas);
        filtrarUnidades(unidadesAfectadas);
        return unidadesAfectadas;
    }

    public void filtrarUnidades(ArrayList<Unidad> unidades){
        for(int i = 0; i < unidades.size(); i++){
            if(!unidades.get(i).getJugador().equals(this.unidad.getJugador()) || unidades.get(i).getNombreDeUnidad() == "Catapulta"){
                unidades.remove(i);
            }
        }
    }
}
