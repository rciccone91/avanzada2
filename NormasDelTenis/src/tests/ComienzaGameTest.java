package tests;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith.*;
import org.junit.runners.JUnit4;

import dominio.Game;
import dominio.Player;

@RunWith(JUnit4.class)
public class ComienzaGameTest {

	@Test
	public void testComienzaGame() {
		
		System.out.println("Comienza el game...");

		//1) asegurarme que el puntaje inicial del jugador es = 0
		//Player jug = new Player();
		// assertTrue(jug.getPuntos()==0);
		
		//2) asegurarme que al iniciar el game, ambos jugadores tengan puntaje 0
		Game game = new Game();
		assertTrue(game.getJugador1().getPuntos()==0 && game.getJugador2().getPuntos()==0);
		
	}

}
