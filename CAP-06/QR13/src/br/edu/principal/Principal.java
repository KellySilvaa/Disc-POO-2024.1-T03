package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vet = new int[10];
        boolean achou = false;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vet[i] = scanner.nextInt();
        }
                
        System.out.println("Números superiores a 50 e suas posições:");
        for (int i = 0; i < 10; i++) {
            if (vet[i] > 50) {
                System.out.println("Número: " + vet[i] + ", Posição: " + (i + 1));
                achou = true;
            }
        }
               
        if (!achou) {
            System.out.println("Não existem números superiores a 50 no vetor.");
        }
        
        scanner.close();
    }
}
