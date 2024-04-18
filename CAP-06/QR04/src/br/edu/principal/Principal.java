package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] num = new int[8];
        int[] pos = new int[8];
        int[] neg = new int[8];
        int cont_n = 1, cont_p = 1;

        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            num[i] = scanner.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (num[i] >= 0) {
                pos[cont_p] = num[i];
                cont_p++;
            } else {
                neg[cont_n] = num[i];
                cont_n++;
            }
        }
        
        if (cont_n == 1) {
            System.out.println("Vetor de negativos vazio");
        } else {
            System.out.println("Vetor de negativos:");
            for (int i = 1; i < cont_n; i++) {
                System.out.println(neg[i]);
            }
        }

        if (cont_p == 1) {
            System.out.println("Vetor de positivos vazio");
        } else {
            System.out.println("Vetor de positivos:");
            for (int i = 1; i < cont_p; i++) {
                System.out.println(pos[i]);
            }
        }

        scanner.close();
    }
}
