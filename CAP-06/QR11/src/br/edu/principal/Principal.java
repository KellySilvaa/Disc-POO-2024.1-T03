package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] temp = new int[12];
        int maior = 0, menor = 0, maiorMes = 0, menorMes = 0;
               
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
            temp[i] = scanner.nextInt();
                        
            if (temp[i] > maior || i == 0) {
                maior = temp[i];
                maiorMes = i;
            }
                        
            if (temp[i] < menor || i == 0) {
                menor = temp[i];
                menorMes = i;
            }
        }
               
        System.out.println("A maior temperatura do ano foi " + maior + "°C, ocorrendo em " + nomeDoMes(maiorMes));
               
        System.out.println("A menor temperatura do ano foi " + menor + "°C, ocorrendo em " + nomeDoMes(menorMes));
        
        scanner.close();
    }
        
    public static String nomeDoMes(int mes) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes];
    }
}
