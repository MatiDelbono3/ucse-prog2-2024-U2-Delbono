package org.example;

public class AvionPrivado extends Avion {
    public int volar(int distancia) {
        int combustibleNecesario = (distancia * consumoCombustible) + (getCapacidadCombustible() / 2);

        return combustibleNecesario;
    }
}
