package org.example.domain;

public class Jugador {
    private final String userName;
    private Integer puntos;

    public Jugador(String userName) {
        this.userName = userName;
        this.puntos = 0;
    }

    public void agregarPuntos(Integer puntos){
        this.puntos = this.puntos + puntos;
    }

    public String userName() {
        return userName;
    }

    public Integer puntos() {
        return puntos;
    }
}
