package com.dio.dp;

public class Soma implements Estrategia{
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
