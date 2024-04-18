package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vet = new double[5];
        int cod;
      
        System.out.println("Digite cinco números reais para preencher o vetor:");
        for (int i = 0; i < 5; i++) {
            vet[i] = scanner.nextDouble();
        }
        
        System.out.println("Digite o código (0 para finalizar, 1 para mostrar na ordem direta, 2 para mostrar na ordem inversa):");
        cod = scanner.nextInt();
        
        switch (cod) {
            case 0:
                System.out.println("Fim do programa.");
            break;
            case 1:
                System.out.println("Vetor na ordem direta:");
                for (int i = 0; i < 5; i++) {
                    System.out.print(vet[i] + " ");
                }
                break;
            case 2:
                System.out.println("Vetor na ordem inversa:");
                for (int i = 4; i >= 0; i--) {
                    System.out.print(vet[i] + " ");
                }
                break;
            default:
                System.out.println("Código inválido.");
        }
    }
}
