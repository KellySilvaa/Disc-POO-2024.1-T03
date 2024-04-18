package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] conta = new int[10];
        double[] saldo = new double[10];
        int op, codigo;
        double valor;
        boolean achou;

        Scanner scanner = new Scanner(System.in);
       
        for (int i = 0; i < 10; i++) {
            achou = false;
            do {
                System.out.print("Digite o código da conta " + (i + 1) + ": ");
                conta[i] = scanner.nextInt();
                for (int j = 0; j < i; j++) {
                    if (conta[i] == conta[j]) {
                        achou = true;
                        System.out.println("Conta já cadastrada. Digite novamente.");
                        break;
                    }
                }
            } while (achou);

            System.out.print("Digite o saldo da conta " + (i + 1) + ": ");
            saldo[i] = scanner.nextDouble();
        }

        // Menu
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Efetuar depósito");
            System.out.println("2. Efetuar saque");
            System.out.println("3. Consultar o ativo bancário");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o código da conta: ");
                    codigo = scanner.nextInt();
                    achou = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigo == conta[i]) {
                            System.out.print("Digite o valor a ser depositado: ");
                            valor = scanner.nextDouble();
                            saldo[i] += valor;
                            System.out.println("Depósito efetuado.");
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Conta não cadastrada.");
                    }
                    break;
                case 2:
                    System.out.print("Digite o código da conta: ");
                    codigo = scanner.nextInt();
                    achou = false;
                    for (int i = 0; i < 10; i++) {
                        if (codigo == conta[i]) {
                            System.out.print("Digite o valor a ser sacado: ");
                            valor = scanner.nextDouble();
                            if (saldo[i] >= valor) {
                                saldo[i] -= valor;
                                System.out.println("Saque efetuado.");
                            } else {
                                System.out.println("Saldo insuficiente.");
                            }
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) {
                        System.out.println("Conta não cadastrada.");
                    }
                    break;
                case 3:
                    double soma = 0;
                    for (int i = 0; i < 10; i++) {
                        soma += saldo[i];
                    }
                    System.out.println("Ativo bancário total: " + soma);
                    break;
                case 4:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 4);

        scanner.close();
    }
}
