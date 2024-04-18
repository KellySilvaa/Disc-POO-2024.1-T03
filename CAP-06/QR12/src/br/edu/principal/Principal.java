package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] veiculo = new String[5];
        double[] consumo = new double[5];
        double menorConsumo = Double.MAX_VALUE;
        int indiceMaisEconomico = 0;
                
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o modelo do " + (i + 1) + "º carro: ");
            veiculo[i] = scanner.nextLine();
            System.out.print("Digite o consumo do " + (i + 1) + "º carro (km/l): ");
            consumo[i] = scanner.nextDouble();
            scanner.nextLine();
            
                       if (consumo[i] < menorConsumo) {
                menorConsumo = consumo[i];
                indiceMaisEconomico = i;
            }
        }
              
        System.out.println("Consumo de combustível para percorrer 1000 km:");
        for (int i = 0; i < 5; i++) {
            double litros = 1000 / consumo[i];
            System.out.println("O veículo " + veiculo[i] + " consome " + litros + " litro(s) de combustível para percorrer 1000 km.");
        }
             
        System.out.println("O veículo mais econômico é o " + veiculo[indiceMaisEconomico]);
        
        scanner.close();
    }
}

