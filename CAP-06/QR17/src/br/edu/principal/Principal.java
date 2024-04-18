package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int somaPares = 0;
        int qtdeImpares = 0;
        
        System.out.println("Digite seis números inteiros:");
        for (int i = 0; i < 6; i++) {
            numeros[i] = scanner.nextInt();
        }       
        System.out.println("Os números pares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("número " + numeros[i] + " na posição " + (i + 1));
                somaPares += numeros[i];
            }
        }
        if (somaPares == 0) {
            System.out.println("Nenhum número par foi digitado.");
        } else {
            System.out.println("Soma dos pares = " + somaPares);
        }
       
        System.out.println("Os números ímpares são:");
        for (int i = 0; i < 6; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.println("número " + numeros[i] + " na posição " + (i + 1));
                qtdeImpares++;
            }
        }
        if (qtdeImpares == 0) {
            System.out.println("Nenhum número ímpar foi digitado.");
        } else {
            System.out.println("Quantidade de ímpares = " + qtdeImpares);
        }
    }
}
