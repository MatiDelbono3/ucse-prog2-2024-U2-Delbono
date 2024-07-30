package org.example;

public class AvionComercial extends Avion {




    public int volar(int distancia) {
        int combustibleNecesario = distancia * consumoCombustible;

        return combustibleNecesario;
    }
}
