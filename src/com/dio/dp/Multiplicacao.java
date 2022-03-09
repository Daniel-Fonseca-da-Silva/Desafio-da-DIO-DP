package com.dio.dp;

public class Multiplicacao implements Estrategia{
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
