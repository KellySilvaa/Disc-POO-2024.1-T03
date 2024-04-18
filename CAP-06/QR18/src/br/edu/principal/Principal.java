package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dado = new int[20];
        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
        
        System.out.println("Digite os números sorteados em 20 jogadas:");
        for (int i = 0; i < 20; i++) {
            dado[i] = scanner.nextInt();
            
            while (dado[i] < 1 || dado[i] > 6) {
                System.out.println("Número inválido. Digite um número entre 1 e 6:");
                dado[i] = scanner.nextInt();
            }
        }
     
        for (int i = 0; i < 20; i++) {
            System.out.print(dado[i] + " ");
            switch (dado[i]) {
                case 1:
                    num1++;
                    break;
                case 2:
                    num2++;
                    break;
                case 3:
                    num3++;
                    break;
                case 4:
                    num4++;
                    break;
                case 5:
                    num5++;
                    break;
                case 6:
                    num6++;
                    break;
            }
        }
        
        System.out.println("\nFrequência dos números sorteados:");
        System.out.println("O número 1 foi sorteado " + num1 + " vez(es)");
        System.out.println("O número 2 foi sorteado " + num2 + " vez(es)");
        System.out.println("O número 3 foi sorteado " + num3 + " vez(es)");
        System.out.println("O número 4 foi sorteado " + num4 + " vez(es)");
        System.out.println("O número 5 foi sorteado " + num5 + " vez(es)");
        System.out.println("O número 6 foi sorteado " + num6 + " vez(es)");
    }
}
