package com.torneo;

public class Jugador {
    private String name;
    private int numero;

    public Jugador(String name, int numero) {
        this.name = name;
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
            this.name = name;
    }

    public int getNumero() {
        return numero;
    }
    
    public void setNumero(int numero) {
         this.numero = numero;
    }
}
