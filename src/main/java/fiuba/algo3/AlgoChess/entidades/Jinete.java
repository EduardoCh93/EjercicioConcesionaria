package fiuba.algo3.AlgoChess.entidades;

import fiuba.algo3.AlgoChess.acciones.AtaqueACortaDistancia;
import fiuba.algo3.AlgoChess.acciones.Movilidad;
import fiuba.algo3.AlgoChess.acciones.TipoDeAtaque;
import fiuba.algo3.AlgoChess.tableroycasilleros.Casillero;
import fiuba.algo3.AlgoChess.tableroycasilleros.Tablero;

public class Jinete extends Unidad {
    private TipoDeAtaque tipoDeAtaque;
    private Movilidad movilidad;

    public Jinete(){
        super(100,3);
        this.movilidad = new Movilidad();
    }

	public void moverUnidadA(int x, int y, Casillero casillero) {
    	this.movilidad.moverUnidadA(this,getUbicacion(),casillero);
	}

	public void atacar() {
		Casillero origenDelAtaque = getUbicacion();
		this.tipoDeAtaque = new AtaqueACortaDistancia(5,15); //  tipoDeAtaqueAUsar(origenDelAtaque);

		tipoDeAtaque.activarAtaque(origenDelAtaque);
	}

}