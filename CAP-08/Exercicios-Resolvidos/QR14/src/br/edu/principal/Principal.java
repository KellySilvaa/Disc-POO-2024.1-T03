package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[20];
        int cont;
        
        for (int x = 0; x < 10; x++) {
            do {
                System.out.print("Digite o " + (x + 1) + "º elemento do vetor 1: ");
                vet1[x] = scanner.nextInt();
            } while (vet1[x] < 0);
        }
       
        for (int x = 0; x < 10; x++) {
            do {
                System.out.print("Digite o " + (x + 1) + "º elemento do vetor 2: ");
                vet2[x] = scanner.nextInt();
            } while (vet2[x] < 0);
        }
     
        cont = uniao(vet1, vet2, vet3);
    
        System.out.println("Vetor União: ");
        for (int x = 0; x < cont; x++) {
            System.out.println(vet3[x]);
        }
    }

    public static int uniao(int[] a, int[] b, int[] u) {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            while (cont < k && a[i] != u[cont]) {
                cont++;
            }
            if (cont == k) {
                u[k] = a[i];
                k++;
            }
        }
        for (int i = 0; i < 10; i++) {
            int cont = 0;
            while (cont < k && b[i] != u[cont]) {
                cont++;
            }
            if (cont == k) {
                u[k] = b[i];
                k++;
            }
        }
        return k;
    }
}
