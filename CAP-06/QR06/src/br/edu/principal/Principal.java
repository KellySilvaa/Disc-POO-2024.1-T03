package br.edu.principal;

import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        int[] vet = {3, 5, 4, 2, 1, 6, 8, 7, 11, 9};
                for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (vet[j] < vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        
        System.out.println("Vetor ordenado (decrescente): " + Arrays.toString(vet));
    }
}
