package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Declarando os vetores para armazenar informações sobre os voos
        int[] voo = new int[12];
        String[] origem = new String[12];
        String[] destino = new String[12];
        int[] lugares = new int[12];
        
        // Lendo informações sobre os voos
        for (int i = 0; i < 12; i++) {
            System.out.println("Informe o número do voo, origem, destino e número de lugares disponíveis para o voo " + (i + 1) + ":");
            voo[i] = scanner.nextInt();
            origem[i] = scanner.next();
            destino[i] = scanner.next();
            lugares[i] = scanner.nextInt();
        }
        
        int op;
        
        do {
            // Menu principal
            System.out.println("\nMenu:");
            System.out.println("1- Consultar");
            System.out.println("2- Efetuar reserva");
            System.out.println("3- Sair");
            System.out.print("Digite sua opção: ");
            op = scanner.nextInt();
            
            switch (op) {
                case 1:
                    consultar(voo, origem, destino, lugares);
                    break;
                case 2:
                    efetuarReserva(voo, lugares);
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente.");
            }
        } while (op != 3);
        
        scanner.close();
    }
    
    // Função para consultar informações sobre os voos
    public static void consultar(int[] voo, String[] origem, String[] destino, int[] lugares) {
        Scanner scanner = new Scanner(System.in);
        
        // Submenu de consulta
        System.out.println("\nSubmenu de Consulta:");
        System.out.println("1- Consulta por número do voo");
        System.out.println("2- Consulta por origem");
        System.out.println("3- Consulta por destino");
        System.out.print("Digite sua opção: ");
        int op = scanner.nextInt();
        
        switch (op) {
            case 1:
                System.out.print("Digite o número do voo: ");
                int num_voo = scanner.nextInt();
                for (int i = 0; i < 12; i++) {
                    if (voo[i] == num_voo) {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Local de destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                        return;
                    }
                }
                System.out.println("Voo inexistente.");
                break;
            case 2:
                System.out.print("Digite a origem: ");
                String origemConsulta = scanner.next();
                for (int i = 0; i < 12; i++) {
                    if (origem[i].equalsIgnoreCase(origemConsulta)) {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Local de destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }
                break;
            case 3:
                System.out.print("Digite o destino: ");
                String destinoConsulta = scanner.next();
                for (int i = 0; i < 12; i++) {
                    if (destino[i].equalsIgnoreCase(destinoConsulta)) {
                        System.out.println("Número do voo: " + voo[i]);
                        System.out.println("Local de origem: " + origem[i]);
                        System.out.println("Local de destino: " + destino[i]);
                        System.out.println("Lugares disponíveis: " + lugares[i]);
                    }
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
    
    // Função para efetuar a reserva de passagem
    public static void efetuarReserva(int[] voo, int[] lugares) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número do voo desejado: ");
        int num_voo = scanner.nextInt();
        
        for (int i = 0; i < 12; i++) {
            if (voo[i] == num_voo) {
                if (lugares[i] > 0) {
                    lugares[i]--;
                    System.out.println("Reserva confirmada!");
                } else {
                    System.out.println("Voo lotado.");
                }
                return;
            }
        }
        System.out.println("Número de voo não encontrado.");
    }
}
