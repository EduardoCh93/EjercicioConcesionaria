package fiuba.algo3.AlgoChess.entidades;

import fiuba.algo3.AlgoChess.acciones.AtaqueDeJinete;
import fiuba.algo3.AlgoChess.acciones.Rango;

import java.util.ArrayList;

public class Jinete extends Unidad {

    public Jinete() {
        super(100, 3);
        this.nombreDeUnidad = "Jinete";
    }

<<<<<<< HEAD
    public void asignarHabilidad(){
        asignarTipoDeHabilidad(new Ataque(new RangoMedio(getTablero()),5,15));
    }

=======
>>>>>>> ataque
    public void activarHabilidad(){
        asignarTipoDeHabilidad(new AtaqueDeJinete(getTablero()));
        getTipoDeHabilidad().activarHabilidad(this);
    }

}