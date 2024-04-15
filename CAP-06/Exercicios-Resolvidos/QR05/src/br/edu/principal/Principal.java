package br.edu.principal;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        int[] X = {3, 8, 4, 2, 1, 6, 8, 7, 11, 9};
        int[] Y = {2, 1, 5, 12, 3, 0, 1, 4, 5, 6};

        
        Set<Integer> uniao = new HashSet<>();
        for (int num : X) {
            uniao.add(num);
        }
        for (int num : Y) {
            uniao.add(num);
        }
        System.out.println("União: " + uniao);

       
        Set<Integer> diferenca = new HashSet<>();
        for (int num : X) {
            if (!Arrays.stream(Y).anyMatch(x -> x == num)) {
                diferenca.add(num);
            }
        }
        System.out.println("Diferença: " + diferenca);
        
        int[] soma = new int[10];
        for (int i = 0; i < 10; i++) {
            soma[i] = X[i] + Y[i];
        }
        System.out.println("Soma: " + Arrays.toString(soma));
      
        int[] produto = new int[10];
        for (int i = 0; i < 10; i++) {
            produto[i] = X[i] * Y[i];
        }
        System.out.println("Produto: " + Arrays.toString(produto));
        
        Set<Integer> intersecao = new HashSet<>();
        for (int num : X) {
            if (Arrays.stream(Y).anyMatch(x -> x == num)) {
                intersecao.add(num);
            }
        }
        System.out.println("Interseção: " + intersecao);
    }
}
