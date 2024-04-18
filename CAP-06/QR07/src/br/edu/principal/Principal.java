package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet = new int[8];

        System.out.println("Digite os 8 números inteiros em ordem crescente:");

        for (int i = 0; i < 8; i++) {
            int num = scanner.nextInt();
            int j = i;
                        
            while (j > 0 && vet[j - 1] > num) {
                vet[j] = vet[j - 1];
                j--;
            }
            
            vet[j] = num;
        }

        System.out.println("Vetor preenchido de forma crescente:");
        for (int i = 0; i < 8; i++) {
            System.out.print(vet[i] + " ");
        }
        
        scanner.close();
    }
}
