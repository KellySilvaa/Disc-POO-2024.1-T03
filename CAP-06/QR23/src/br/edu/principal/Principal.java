package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] corredor = new int[24];
        int[] janela = new int[24];
        boolean achou;
        String posicao;
        int op, num;
     
        for (int i = 0; i < 24; i++) {
            corredor[i] = 0;
            janela[i] = 0;
        }

        Scanner scanner = new Scanner(System.in);

        // Menu
        do {
            System.out.println("\nMenu:");
            System.out.println("1- Vender passagem");
            System.out.println("2- Mostrar mapa de ocupação do ônibus");
            System.out.println("3- Encerrar");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1: 
                    achou = false;
                    for (int i = 0; i < 24; i++) {
                        if (corredor[i] == 0 || janela[i] == 0) {
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Ônibus lotado.");
                    } else {
                        System.out.println("Informe J para janela ou C para corredor:");
                        posicao = scanner.next().toUpperCase();
                        System.out.println("Informe o número da poltrona (1 a 24):");
                        num = scanner.nextInt();

                        if (posicao.equals("J")) {
                            if (janela[num - 1] == 1) {
                                System.out.println("Poltrona ocupada.");
                            } else {
                                System.out.println("Venda efetivada.");
                                janela[num - 1] = 1;
                            }
                        } else if (posicao.equals("C")) {
                            if (corredor[num - 1] == 1) {
                                System.out.println("Poltrona ocupada.");
                            } else {
                                System.out.println("Venda efetivada.");
                                corredor[num - 1] = 1;
                            }
                        } else {
                            System.out.println("Opção inválida.");
                        }
                    }
                    break;
                case 2: 
                    System.out.println("JANELA   CORREDOR");
                    for (int i = 0; i < 24; i++) {
                        System.out.print((i + 1) + "- ");
                        if (janela[i] == 0) {
                            System.out.print("Livre     ");
                        } else {
                            System.out.print("Ocupada ");
                        }
                        if (corredor[i] == 0) {
                            System.out.println((i + 1) + "- Livre");
                        } else {
                            System.out.println((i + 1) + "- Ocupada");
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 3);

        scanner.close();
    }
}