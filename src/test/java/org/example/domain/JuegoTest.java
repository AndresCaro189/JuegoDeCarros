package org.example.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.function.Consumer;

class JuegoTest {

    @Test
    void configurarJuego(){
        var pista = new Pista(60);
        var jugadores = new HashSet<Jugador>();
        jugadores.add(new Jugador("@AndresCaro","Andres Caro"));
        jugadores.add(new Jugador("@DavidUrive","David Urive"));
        jugadores.add(new Jugador("@LeoMontolla","Leo Montolla"));
        jugadores.add(new Jugador("@AndreaSuarez","Andrea Suarez"));
        jugadores.add(new Jugador("@OscarPaes","Oscar Paes"));
        jugadores.add(new Jugador("@PauloCohelo","Paulo Cohelo"));
        jugadores.add(new Jugador("@PipeDelelopes","Pipe Delelopes"));
        jugadores.add(new Jugador("@LuisaCano","Luisa Cano"));
        jugadores.add(new Jugador("@FernandoDeLaEstrella","Fernando De La Estrella"));
        var juego = new Juego(pista, jugadores);

        Assertions.assertEquals(null ,juego.podium.primerLugar());
        Assertions.assertEquals(null ,juego.podium.segundoLugar());
        Assertions.assertEquals(null ,juego.podium.tercerLugar());

        Assertions.assertEquals(9, juego.pista().carriles().size());

        juego.pista().carriles().forEach(carril -> Assertions.assertEquals((int)carril.posicion(), 0));
    }

    @Test
    void iniciarJuego() {
        var pista = new Pista(60);
        var jugadores = new HashSet<Jugador>();
        jugadores.add(new Jugador("@AndresCaro","Andres Caro"));
        jugadores.add(new Jugador("@DavidUrive","David Urive"));
        jugadores.add(new Jugador("@LeoMontolla","Leo Montolla"));
        jugadores.add(new Jugador("@AndreaSuarez","Andrea Suarez"));
        jugadores.add(new Jugador("@OscarPaes","Oscar Paes"));
        jugadores.add(new Jugador("@PauloCohelo","Paulo Cohelo"));
        jugadores.add(new Jugador("@PipeDelelopes","Pipe Delelopes"));
        jugadores.add(new Jugador("@LuisaCano","Luisa Cano"));
        jugadores.add(new Jugador("@FernandoDeLaEstrella","Fernando De La Estrella"));
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