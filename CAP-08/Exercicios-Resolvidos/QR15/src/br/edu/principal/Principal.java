package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vet = new double[5];
        
        for (int x = 0; x < 5; x++) {
            System.out.print("Digite o " + (x + 1) + "º número real: ");
            vet[x] = scanner.nextDouble();
        }

        ordena(vet);
       
        System.out.println("Vetor ordenado:");
        for (int x = 0; x < 5; x++) {
            System.out.println(vet[x]);
        }
    }

    public static void ordena(double[] v) {
        double aux;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (v[j] > v[j + 1]) {
                  
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}
