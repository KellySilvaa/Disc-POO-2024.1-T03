package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
        int[] vet_result1 = new int[10]; 
        int[] vet_result2 = new int[10]; 
        int poslivre1 = 0; 
        int poslivre2 = 0; 
               
        System.out.println("Digite os 10 números do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = scanner.nextInt();
        }
               
        System.out.println("Digite os 5 números do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vet2[i] = scanner.nextInt();
        }
               
        for (int i = 0; i < 10; i++) {
            int soma = vet1[i];
            for (int j = 0; j < 5; j++) {
                soma += vet2[j];
            }
            if (soma % 2 == 0) {
                vet_result1[poslivre1] = soma;
                poslivre1++;
            } else {
                vet_result2[poslivre2] = soma;
                poslivre2++;
            }
        }
               
        System.out.println("Números pares resultantes:");
        for (int i = 0; i < poslivre1; i++) {
            System.out.print(vet_result1[i] + " ");
        }
        System.out.println();
                
        System.out.println("Números ímpares resultantes:");
        for (int i = 0; i < poslivre2; i++) {
            System.out.print(vet_result2[i] + " ");
        }
        
        scanner.close();
    }
}
