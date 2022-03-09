package com.dio.dp;

public class Contexto {

    private Estrategia estrategia;

    public double executaEstrategia(double a, double b) {
        return estrategia.calcular(a, b);
    }

    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }
}
