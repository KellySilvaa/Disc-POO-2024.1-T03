package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números positivos:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int s = somar(num1, num2);
        System.out.println("Soma = " + s);
    }

    public static int somar(int num1, int num2) {
        int s = 0;
        for (int i = num1 + 1; i < num2; i++) {
            s += i;
        }
        return s;
    }
}
