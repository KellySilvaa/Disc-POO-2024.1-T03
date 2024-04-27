package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        do {
            System.out.println("Digite um número inteiro maior que 1: ");
            a = scanner.nextInt();
        } while (a <= 1);
        
        System.out.println("Digite dois números inteiros b e c: ");
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        int result = divisores(a, b, c);
        System.out.println("Soma dos inteiros = " + result);
        
        scanner.close();
    }

    public static int divisores(int a, int b, int c) {
        int s = 0;
        for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                s += i;
            }
        }
        return s;
    }
}
