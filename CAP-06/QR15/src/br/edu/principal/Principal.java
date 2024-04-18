package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vet1 = new int[10];
        int[] vet2 = new int[5];
               
        System.out.println("Digite os 10 números do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            vet1[i] = scanner.nextInt();
        }
              
        System.out.println("Digite os 5 números do segundo vetor:");
        for (int i = 0; i < 5; i++) {
            vet2[i] = scanner.nextInt();
        }
                
        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + vet1[i]);
            boolean achou = false;
            for (int j = 0; j < 5; j++) {
                if (vet1[i] % vet2[j] == 0) {
                    System.out.println("Divisível por " + vet2[j] + " na posição " + (j + 1));
                    achou = true;
                }
            }
            if (!achou) {
                System.out.println("Não possui divisores no segundo vetor");
            }
        }
        
        scanner.close();
    }
}
