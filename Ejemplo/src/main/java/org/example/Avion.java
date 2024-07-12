package org.example;
public abstract class Avion {
    protected int capacidadCombustible;
    protected int consumoCombustible;

    public abstract int volar(int distancia);

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public int getConsumoCombustible() {
        return consumoCombustible;
    }
}
