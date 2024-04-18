package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] vet1 = new char[20];
        char[] vet2 = new char[20];
        char aux;
        
        System.out.println("Digite os caracteres do primeiro vetor (20 caracteres):");
        for (int i = 0; i < 20; i++) {
            vet1[i] = scanner.next().charAt(0);
        }
        
        System.out.println("Digite os caracteres do segundo vetor (20 caracteres):");
        for (int i = 0; i < 20; i++) {
            vet2[i] = scanner.next().charAt(0);
        }
        
        System.out.println("Vetor 1 - Antes da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\nVetor 2 - Antes da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet2[i] + " ");
        }
        
        int j = 19;
        for (int i = 0; i < 20; i++) {
            aux = vet1[i];
            vet1[i] = vet2[j];
            vet2[j] = aux;
            j--;
        }
      
        System.out.println("\n\nVetor 1 - Depois da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println("\nVetor 2 - Depois da troca:");
        for (int i = 0; i < 20; i++) {
            System.out.print(vet2[i] + " ");
        }
    }
}
