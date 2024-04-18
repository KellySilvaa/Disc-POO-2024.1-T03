package br.edu.principal;

public class Principal {
    public static void main(String[] args) {
        int[] primos = new int[10];
        int qtde = 0;
        int num = 101;
        int divisores;
      
        while (qtde < 10) {
            divisores = 0;           
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    divisores++;
                }
            }           
            if (divisores <= 2) {
                primos[qtde] = num;
                qtde++;
            }
            num++;
        }
    
        System.out.println("Os dez primeiros números primos acima de 100 são:");
        for (int i = 0; i < 10; i++) {
            System.out.print(primos[i] + " ");
        }
    }
}
