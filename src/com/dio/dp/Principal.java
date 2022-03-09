package com.dio.dp;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Contexto contexto = new Contexto();
        double acao = 1;
        double valorA = 0d;
        double valorB = 0d;

        while (acao != 0) {
            System.out.println("Entre com a opção desejada");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplição");
            System.out.println("4 - divisão");
            System.out.println("0 - sair");
            acao = scanner.nextInt();

            if (acao != 0) {
                System.out.println("Entre com o primeiro valor");
                valorA = scanner.nextDouble();
                System.out.println("Entre com o segundo valor");
                valorB = scanner.nextDouble();

                double resultado = 0;

                if (acao == 1)
                    contexto.setEstrategia(new Soma());

                if (acao == 2)
                    contexto.setEstrategia(new Subtracao());

                if (acao == 3)
                    contexto.setEstrategia(new Multiplicacao());

                if (acao == 4)
                    contexto.setEstrategia(new Divisao());

                resultado = contexto.executaEstrategia(valorA, valorB);

                System.out.println("Resultado: " + resultado);

            }
        }

    }
}
