package CRUD;

import java.util.Scanner;

public class ReservasOnibus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] onibus = new int[4];
        int[] totalAssentos = new int[4];          
        int[] assentosDisponiveis = new int[4];   
        String[][] reservas = new String[4][20];
        int qtdOnibus = 0;
        
        int opcao;
        while (true) {
            System.out.println("\n=== BEM-VINDO A VIAÇÃO ROADTRIP ===");
            System.out.println("\n=== GERENCIAMENTO DE RESERVAS DE ÔNIBUS ===");
            System.out.println("1 - Registrar ônibus");
            System.out.println("2 - Registrar assentos");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Digite  a opçao desejada: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            if (opcao == 6) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1:
                    if (qtdOnibus == onibus.length) {
                        System.out.println("Limite de ônibus atingido. Não é possível registrar mais.");
                        break;
                    }
                    System.out.print("Digite o número do ônibus: ");
                    int numReq = sc.nextInt();
                    sc.nextLine();
                    
                    boolean existe = false;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (onibus[i] == numReq) {
                            existe = true;
                            break;
                        }
                    }
                    if (existe) {
                        System.out.println("Ônibus já cadastrado.");
                        break;
                    }
                    onibus[qtdOnibus] = numReq;
                    totalAssentos[qtdOnibus] = 0;
                    assentosDisponiveis[qtdOnibus] = 0;
                    qtdOnibus++;
                    System.out.println("Ônibus registrado com sucesso!");
                    break;

                case 2:
                    if (qtdOnibus == 0) {
                        System.out.println("Nenhum ônibus registrado. Registre um ônibus primeiro.");
                        break;
                    }
                    System.out.print("Digite o número do ônibus para cadastrar assentos: ");
                    int numOnibusAss = sc.nextInt();
                    sc.nextLine();
                    int idxAss = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (onibus[i] == numOnibusAss) {
                            idxAss = i;
                            break;
                        }
                    }
                    if (idxAss == -1) {
                        System.out.println("Ônibus não encontrado. Cadastre o ônibus primeiro.");
                        break;
                    }
                    System.out.print("Digite a quantidade de assentos para o ônibus " + numOnibusAss + ": ");
                    int qtd = sc.nextInt();
                    sc.nextLine();
                    totalAssentos[idxAss] = qtd;
                    assentosDisponiveis[idxAss] = qtd;
                    System.out.println("Assentos registrados com sucesso para o ônibus " + numOnibusAss + "!");
                    break;

                case 3:
                    if (qtdOnibus == 0) {
                        System.out.println("Nenhum ônibus registrado. Registre um ônibus primeiro!!");
                        break;
                    }
                    
                    
                    System.out.println("\n--- ÔNIBUS DISPONÍVEIS ---");
                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.println("Ônibus " + onibus[i] + " - Assentos disponíveis: " + assentosDisponiveis[i]);
                    }
                    
                    System.out.print("\nDigite o número do ônibus: ");
                    int numOnibus = sc.nextInt();
                    sc.nextLine();
                    
                    int indiceOnibus = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (onibus[i] == numOnibus) {
                            indiceOnibus = i;
                            break;
                        }
                    }
                    
                    if (indiceOnibus == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }
                    
                    if (assentosDisponiveis[indiceOnibus] == 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }
                    
                    
                    
                    System.out.println("\nÔnibus " + numOnibus + " - Assentos disponíveis:");
                    for (int s = 0; s < totalAssentos[indiceOnibus]; s++) {
                        if (reservas[indiceOnibus][s] == null) {
                            System.out.print("Assento " + (s + 1) + "  ");
                            if ((s + 1) % 5 == 0) System.out.println(); 
                        }
                    }
                    System.out.println();
                    
                    System.out.print("Escolha o número do assento: ");
                    int escolha = sc.nextInt();
                    sc.nextLine();
                    
                    if (escolha < 1 || escolha > totalAssentos[indiceOnibus]) {
                        System.out.println("Número de assento inválido!");
                        break;
                    }
                    
                    if (reservas[indiceOnibus][escolha - 1] != null) {
                        System.out.println("Assento já reservado!");
                        break;
                    }
                    
                    System.out.print("Digite o nome do passageiro: ");
                    String nomePassageiro = sc.nextLine();
                    
                    reservas[indiceOnibus][escolha - 1] = nomePassageiro;
                    assentosDisponiveis[indiceOnibus]--;
                    
                    System.out.println("Reserva realizada com sucesso!");
                    System.out.println("Ônibus " + numOnibus + " - Assento " + escolha + " - Passageiro: " + nomePassageiro);
                    break;

                case 4:
                    System.out.print("Digite o número do ônibus: ");
                    numOnibus = sc.nextInt();
                    sc.nextLine();
                    
                    indiceOnibus = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (onibus[i] == numOnibus) {
                            indiceOnibus = i;
                            break;
                        }
                    }
                    
                    if (indiceOnibus == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }
                    
                    System.out.println("\n--- RESERVAS DO ÔNIBUS " + numOnibus + " ---");
                    boolean temReserva = false;
                    
                    for (int i = 0; i < totalAssentos[indiceOnibus]; i++) {
                        if (reservas[indiceOnibus][i] != null) {
                            System.out.println("Assento " + (i + 1) + ": " + reservas[indiceOnibus][i]);
                            temReserva = true;
                        } else {
                            System.out.println("Assento " + (i + 1) + ": Disponível");
                        }
                    }
                    
                    if (!temReserva) {
                        System.out.println("Todos os assentos estão disponíveis para este ônibus!");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do passageiro: ");
                    nomePassageiro = sc.nextLine();
                    
                    System.out.println("\n--- RESERVAS ENCONTRADAS PARA " + nomePassageiro.toUpperCase() + " ---");
                    boolean encontrou = false;
                    
                    for (int i = 0; i < qtdOnibus; i++) {
                        for (int j = 0; j < totalAssentos[i]; j++) {
                            if (reservas[i][j] != null && reservas[i][j].equalsIgnoreCase(nomePassageiro)) {
                                System.out.println("Ônibus " + onibus[i] + " - Assento " + (j + 1) + ": " + reservas[i][j]);
                                encontrou = true;
                            }
                        }
                    }
                    
                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;
            }
        }
        sc.close();
    }
}