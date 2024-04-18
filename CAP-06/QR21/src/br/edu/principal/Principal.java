package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] vet = new int[15];
        int[] p = new int[5];
        int[] i = new int[5];
        int poslivre_p = 0;
        int poslivre_i = 0;

        Scanner scanner = new Scanner(System.in);
       
        for (int cont = 0; cont < 15; cont++) {
            System.out.print("Digite o valor na posição " + (cont + 1) + ": ");
            vet[cont] = scanner.nextInt();
        }
      
        for (int cont = 0; cont < 15; cont++) {
            if (vet[cont] % 2 == 0) {
                if (poslivre_p == 5) {
                    System.out.println("Vetor de pares cheio:");
                    for (int k = 0; k < poslivre_p; k++) {
                        System.out.println(p[k]);
                    }
                    poslivre_p = 0;
                }
                p[poslivre_p++] = vet[cont];
            } else {
                if (poslivre_i == 5) {
                    System.out.println("Vetor de ímpares cheio:");
                    for (int k = 0; k < poslivre_i; k++) {
                        System.out.println(i[k]);
                    }
                    poslivre_i = 0; 
                }
                i[poslivre_i++] = vet[cont];
            }
        }
        
        if (poslivre_p != 0) {
            System.out.println("Vetor de pares restante:");
            for (int k = 0; k < poslivre_p; k++) {
                System.out.println(p[k]);
            }
        }
        if (poslivre_i != 0) {
            System.out.println("Vetor de ímpares restante:");
            for (int k = 0; k < poslivre_i; k++) {
                System.out.println(i[k]);
            }
        }

        scanner.close();
    }
}
