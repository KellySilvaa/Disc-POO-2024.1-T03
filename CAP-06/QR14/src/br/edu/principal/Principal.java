package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] nome = new String[5];
        double[] salario = new double[5];
        int[] tempoServico = new int[5];
               
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do " + (i + 1) + "º funcionário: ");
            nome[i] = scanner.nextLine();
            System.out.print("Digite o salário do " + (i + 1) + "º funcionário: ");
            salario[i] = scanner.nextDouble();
            System.out.print("Digite o tempo de serviço do " + (i + 1) + "º funcionário (em anos): ");
            tempoServico[i] = scanner.nextInt();
            scanner.nextLine(); 
        }
        
        System.out.println("Funcionários sem aumento:");
        for (int i = 0; i < 5; i++) {
            if (tempoServico[i] <= 5 && salario[i] >= 800) {
                System.out.println(nome[i]);
            }
        }
                
        System.out.println("\nFuncionários com aumento e seus novos salários:");
        for (int i = 0; i < 5; i++) {
            double novoSalario = 0;
            if (tempoServico[i] > 5 || salario[i] < 800) {
                if (tempoServico[i] > 5 && salario[i] < 800) {
                    novoSalario = salario[i] * 1.35; 
                } else if (tempoServico[i] > 5) {
                    novoSalario = salario[i] * 1.25;
                } else {
                    novoSalario = salario[i] * 1.15;
                }
                System.out.println(nome[i] + ": " + novoSalario);
            }
        }
        
        scanner.close();
    }
}

