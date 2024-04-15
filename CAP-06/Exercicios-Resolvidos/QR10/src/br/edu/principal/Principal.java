package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
              
        String[] gabarito = new String[8];
               
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite a resposta da questão " + (i + 1) + ": ");
            gabarito[i] = scanner.next();
        }
        
        int totalAprovados = 0;
               
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número do " + i + "º aluno: ");
            int num = scanner.nextInt();
            int pontos = 0;
                       
            for (int j = 0; j < 8; j++) {
                System.out.print("Digite a resposta dada pelo aluno " + num + " à " + (j + 1) + "ª questão: ");
                String resposta = scanner.next();
                
                if (resposta.equalsIgnoreCase(gabarito[j])) {
                    pontos++;
                }
            }
                       
            System.out.println("A nota do aluno " + num + " foi " + pontos);
                     
            if (pontos >= 6) {
                totalAprovados++;
            }
        }
                
        double perc_ap = (double) totalAprovados / 10 * 100;
                
        System.out.println("O percentual de alunos aprovados é " + perc_ap + "%");
        
        scanner.close();
    }
}
