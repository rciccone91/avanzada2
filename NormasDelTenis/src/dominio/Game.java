package dominio;

import java.util.List;

public class Game {
	
	private Player jugador1;
	private Player jugador2;
	
	public Game(){
		jugador1 = new Player();
		jugador2 = new Player();
		jugador1.setPuntos(0);
		jugador2.setPuntos(0);
	}
	public Player getJugador1() {
		return jugador1;
	}
	public void setJugador1(Player jugador1) {
		this.jugador1 = jugador1;
	}
	public Player getJugador2() {
		return jugador2;
	}
	public void setJugador2(Player jugador2) {
		this.jugador2 = jugador2;
	}
	
	

}
