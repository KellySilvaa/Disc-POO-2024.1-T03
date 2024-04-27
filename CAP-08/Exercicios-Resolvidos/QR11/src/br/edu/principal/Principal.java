package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] sexo = new char[5];
        char[] olhos = new char[5];
        char[] cabelos = new char[5];
        int[] idade = new int[5];

        leitura(sexo, olhos, cabelos, idade);

        double media = media_idade(olhos, cabelos, idade);
        System.out.println("Média de idade das pessoas com olhos castanhos e cabelos pretos: " + media);

        int maiorIdade = maior_idade(idade);
        System.out.println("Maior idade entre os habitantes: " + maiorIdade);

        int qtd = qt_individuos(sexo, olhos, cabelos, idade);
        System.out.println("Quantidade de indivíduos do sexo feminino com idade entre 18 e 35 anos, olhos azuis e cabelos louros: " + qtd);
    }

    public static void leitura(char[] sexo, char[] olhos, char[] cabelos, int[] idade) {
        Scanner scanner = new Scanner(System.in);
        for (int x = 0; x < 5; x++) {
            char s, o, c;
            do {
                System.out.print("Digite o sexo (F/M) do habitante " + (x + 1) + ": ");
                s = scanner.next().charAt(0);
            } while (s != 'F' && s != 'M');
            sexo[x] = s;

            do {
                System.out.print("Digite a cor dos olhos (A/C) do habitante " + (x + 1) + ": ");
                o = scanner.next().charAt(0);
            } while (o != 'A' && o != 'C');
            olhos[x] = o;

            do {
                System.out.print("Digite a cor dos cabelos (L/P/C) do habitante " + (x + 1) + ": ");
                c = scanner.next().charAt(0);
            } while (c != 'L' && c != 'P' && c != 'C');
            cabelos[x] = c;

            System.out.print("Digite a idade do habitante " + (x + 1) + ": ");
            idade[x] = scanner.nextInt();
        }
    }

    public static double media_idade(char[] olhos, char[] cabelos, int[] idade) {
        int soma = 0;
        int cont = 0;
        for (int i = 0; i < 5; i++) {
            if (olhos[i] == 'C' && cabelos[i] == 'P') {
                soma += idade[i];
                cont++;
            }
        }
        return cont == 0 ? 0 : (double) soma / cont;
    }

    public static int maior_idade(int[] idade) {
        int maior = idade[0];
        for (int i = 1; i < 5; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }
        return maior;
    }

    public static int qt_individuos(char[] sexo, char[] olhos, char[] cabelos, int[] idade) {
        int qtd = 0;
        for (int i = 0; i < 5; i++) {
            if (sexo[i] == 'F' && idade[i] >= 18 && idade[i] <= 35 && olhos[i] == 'A' && cabelos[i] == 'L') {
                qtd++;
            }
        }
        return qtd;
    }
}
