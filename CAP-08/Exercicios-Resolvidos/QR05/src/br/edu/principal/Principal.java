package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor antigo do produto:");
        double precoAntigo = scanner.nextDouble();
        System.out.println("Digite o valor atual do produto:");
        double precoAtual = scanner.nextDouble();
        double acrescimo = calculoReajuste(precoAntigo, precoAtual);
        System.out.println("Percentual de acréscimo: " + acrescimo + "%");
    }

    public static double calculoReajuste(double precoAntigo, double precoAtual) {
        double resultado = ((precoAtual - precoAntigo) / precoAntigo) * 100;
        return resultado;
    }
}
