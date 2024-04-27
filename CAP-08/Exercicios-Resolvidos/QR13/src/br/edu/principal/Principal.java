package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
    
        for (int x = 0; x < 10; x++) {
            System.out.print("Digite o " + (x + 1) + "º elemento: ");
            vet1[x] = scanner.nextInt();
        }
      
        fatoriais(vet1, vet2);
       
        System.out.println("Vetor B (fatoriais): ");
        for (int x = 0; x < 10; x++) {
            System.out.println(vet2[x]);
        }
    }

    public static void fatoriais(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] == 0 || a[i] == 1) {
                b[i] = 1;
            } else {
                int f = 1;
                for (int j = 1; j <= a[i]; j++) {
                    f *= j;
                }
                b[i] = f;
            }
        }
    }
}
