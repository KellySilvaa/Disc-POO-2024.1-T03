package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
        int num = 5; 
        double resultado = sequencia(num);
        System.out.println("O valor de S é: " + resultado);
    }

    public static double sequencia(int n) {
        double seq = 1;
        double f = 1;
        
        for (int a = 1; a <= n; a++) {
            f *= a;
            seq += 1.0 / f;
        }
        
        return seq;
    }
}
