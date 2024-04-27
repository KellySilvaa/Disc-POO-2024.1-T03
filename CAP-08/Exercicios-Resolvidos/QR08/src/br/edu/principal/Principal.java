package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horaInicio, minInicio, horaFim, minFim;
        
        System.out.println("Digite a hora de início do jogo (horas minutos):");
        horaInicio = scanner.nextInt();
        minInicio = scanner.nextInt();
        
        System.out.println("Digite a hora de término do jogo (horas minutos):");
        horaFim = scanner.nextInt();
        minFim = scanner.nextInt();
        
        int minutos = calculo(horaInicio, minInicio, horaFim, minFim);
        
        System.out.println("A duração do jogo é de " + minutos + " minutos.");
    }

    public static int calculo(int hInicio, int mInicio, int hFim, int mFim) {
        if (mFim < mInicio) {
            mFim += 60;
            hFim--;
        }
        if (hFim < hInicio) {
            hFim += 24;
        }
        
        int totMinInicio = hInicio * 60 + mInicio;
        int totMinFim = hFim * 60 + mFim;
        
        return totMinFim - totMinInicio;
    }
}
