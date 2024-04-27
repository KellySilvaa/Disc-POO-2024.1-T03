package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        int x = verifica(num);
        if (x == 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }

    public static int verifica(int num) {
        int res;
        if (num >= 0) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }
}
