package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3;
        char letra;
        
        System.out.println("Digite as três notas do aluno:");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        
        do {
            System.out.println("Digite 'A' para média aritmética ou 'P' para média ponderada:");
            letra = scanner.next().charAt(0);
        } while (letra != 'A' && letra != 'P');
        
        double media = calculaMedia(nota1, nota2, nota3, letra);
        
        if (letra == 'A') {
            System.out.println("A média aritmética é: " + media);
        } else {
            System.out.println("A média ponderada é: " + media);
        }
    }

    public static double calculaMedia(double nota1, double nota2, double nota3, char letra) {
        double media;
        if (letra == 'A') {
            media = (nota1 + nota2 + nota3) / 3;
        } else {
            media = (nota1 * 5 + nota2 * 3 + nota3 * 2) / (5 + 3 + 2);
        }
        return media;
    }
}
