package org.example.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

class JuegoTest {

    @Test
    void iniciarJuego() {
        var pista = new Pista(60);
        var jugadores = new HashSet<Jugador>();
        jugadores.add(new Jugador("Andres Caro"));
        jugadores.add(new Jugador("David Urive"));
        jugadores.add(new Jugador("Leo Montolla"));
        jugadores.add(new Jugador("Andrea Suarez"));
        jugadores.add(new Jugador("Oscar Paes"));
        jugadores.add(new Jugador("Paulo Cohelo"));
        jugadores.add(new Jugador("Pipe Delelopes"));
        jugadores.add(new Jugador("Luisa Cano"));
        jugadores.add(new Jugador("Fernando De La Estrella"));
        var juego = new Juego(pista, jugadores);

        juego.iniciarJuego();
        Assertions.assertEquals(Juego.Estado.FINALIZADO, juego.estado());
        System.out.println(juego.podium);
    }

    @Test
    void finalizarJuego() {
    }

    @Test
    void guardarResultados() {
    }
}