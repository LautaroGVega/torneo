package com.torneo;

public class TarjetaBase {
    private String color;
    private Jugador jugador;

    public TarjetaBase(String color, Jugador jugador) {
        this.color = color;
        this.jugador = jugador;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
   }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador value){
        this.jugador = value;

    }

    @Override
    public String toString(){
        return String.format("Tarjeta %s para %s",
                    getColor(),
                    getJugador().getName());
    }

}
