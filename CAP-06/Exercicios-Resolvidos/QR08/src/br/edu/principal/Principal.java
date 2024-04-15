package br.edu.principal;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               
        int[] X = new int[5];
        System.out.println("Digite os 5 elementos do vetor X:");
        for (int i = 0; i < 5; i++) {
            X[i] = scanner.nextInt();
        }
        Arrays.sort(X);
                
        int[] Y = new int[5];
        System.out.println("Digite os 5 elementos do vetor Y:");
        for (int i = 0; i < 5; i++) {
            Y[i] = scanner.nextInt();
        }
        Arrays.sort(Y);
             
        int[] R = new int[10];
        int indexR = 0;
        int indexX = 0;
        int indexY = 0;
        
        while (indexX < 5 && indexY < 5) {
            if (X[indexX] < Y[indexY]) {
                R[indexR++] = X[indexX++];
            } else {
                R[indexR++] = Y[indexY++];
            }
        }
        
        while (indexX < 5) {
            R[indexR++] = X[indexX++];
        }
        
        while (indexY < 5) {
            R[indexR++] = Y[indexY++];
        }
                
        Arrays.sort(R);        
       
        System.out.println("Vetor X ordenado:");
        System.out.println(Arrays.toString(X));
        
        System.out.println("Vetor Y ordenado:");
        System.out.println(Arrays.toString(Y));
        
        System.out.println("Vetor R ordenado:");
        System.out.println(Arrays.toString(R));
        
        scanner.close();
    }
}
