package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] qtd = new int[10];
        double[] preco = new double[10];
        int tot_geral = 0;
        double comissao;
        int maior = 0;
        int ind = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe a quantidade vendida do objeto " + (i + 1) + ": ");
            qtd[i] = scan.nextInt();
            System.out.print("Informe o preço unitário do objeto " + (i + 1) + ": ");
            preco[i] = scan.nextDouble();
        }

        System.out.println("Relatório:");
        for (int i = 0; i < 10; i++) {
            double tot_vend = qtd[i] * preco[i];
            System.out.println("Quantidade vendida: " + qtd[i] + ", Valor unitário: R$" + preco[i] + ", Valor total: R$" + tot_vend);
            tot_geral += tot_vend;
        }

        comissao = tot_geral * 0.05;
        System.out.println("Valor geral das vendas: R$" + tot_geral);
        System.out.println("Valor da comissão: R$" + comissao);

        for (int i = 0; i < 10; i++) {
            if (qtd[i] > maior) {
                maior = qtd[i];
                ind = i;
            }
        }

        System.out.println("O objeto mais vendido foi o objeto " + (ind + 1) + ", com quantidade vendida: " + maior);
    }
}

