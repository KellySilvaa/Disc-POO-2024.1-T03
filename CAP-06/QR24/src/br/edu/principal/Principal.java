package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] repetidos = new int[10];
        int[] vezes = new int[10];
        int qtde, cont, cont_r;

        Scanner scanner = new Scanner(System.in);
       
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número na posição " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        cont_r = 0;
        for (int i = 0; i < 10; i++) {
            qtde = 1;
            for (int j = 0; j < 10; j++) {
                if (i != j && A[i] == A[j]) {
                    qtde++;
                }
            }
            if (qtde > 1) {
                cont = 0;
                while (cont < cont_r && A[i] != repetidos[cont]) {
                    cont++;
                }
                if (cont == cont_r) {
                    repetidos[cont_r] = A[i];
                    vezes[cont_r] = qtde;
                    cont_r++;
                }
            }
        }
     
        for (int i = 0; i < cont_r; i++) {
            System.out.println("O número " + repetidos[i] + " aparece " + vezes[i] + " vezes.");
        }

        scanner.close();
    }
}
