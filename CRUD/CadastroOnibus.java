package CRUD;
import java.util.Scanner;

public class CadastroOnibus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // --- BANCO DE DADOS (ARRAYS) ---
        int[] numeroDosOnibus = new int[4];
        int[] capacidadeAssentos = new int[4];
        
        String[] nomesPassageiros = new String[20];
        int[] onibusDaReserva = new int[20];
        int[] assentoDaReserva = new int[20];

        // --- VARIÁVEIS DE GESTÃO ---
        int qtdOnibus = 0;    // Quantos ônibus existem
        int qtdReservas = 0;  // Quantas reservas existem
        int opcao = 0;        // Escolha do usuário

        // Laço principal (Menu)
        while (true) {
            System.out.println("\n=== SISTEMA ROADTRIP ===");
            System.out.println("1 - Registrar número do ônibus");
            System.out.println("2 - Registrar assentos disponíveis");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar por ônibus");
            System.out.println("5 - Consultar por nome de passageiro");
            System.out.println("6 - Saindo");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // Limpeza de buffer obrigatória após nextInt()

            // O switch processa a escolha do usuário
            switch (opcao) {
                case 1: // CADASTRO DE ÔNIBUS
                    if (qtdOnibus == 4) { 
                        System.out.println("Limite de 4 ônibus atingido!");
                    } else {
                        System.out.print("Informe o número do ônibus: ");
                        numeroDosOnibus[qtdOnibus] = sc.nextInt();
                        qtdOnibus++;
                        System.out.println("Ônibus registrado com sucesso!");
                    }
                    break;
                    
                case 2: // CADASTRO DE CAPACIDADE
                    if (qtdOnibus == 0) { 
                        System.out.println("Nenhum ônibus cadastrado ainda!");
                    } else {
                        for (int i = 0; i < qtdOnibus; i++) {
                            System.out.print("Qual a capacidade do ônibus " + numeroDosOnibus[i] + "? ");
                            capacidadeAssentos[i] = sc.nextInt();
                        }
                        System.out.println("Capacidades registradas!");
                    }
                    break;
                    
                case 3: // REALIZAR RESERVA
                    if (qtdReservas == 20) {
                        System.out.println("Limite de 20 reservas atingido!");
                    } else {
                        System.out.print("Número do ônibus para reserva: ");
                        int onibusDesejado = sc.nextInt();
                        
                        // Busca se o ônibus existe no sistema
                        int posOnibus = -1;
                        for (int i = 0; i < qtdOnibus; i++) {
                            if (numeroDosOnibus[i] == onibusDesejado) {
                                posOnibus = i;
                                break;
                            }
                        }
                        
                        if (posOnibus == -1) {
                            System.out.println("ERRO: Ônibus não cadastrado!");
                        } else {
                            System.out.print("Poltrona (1 a " + capacidadeAssentos[posOnibus] + "): ");
                            int poltronaDesejada = sc.nextInt();
                            sc.nextLine(); 

                            // Verifica se a poltrona é válida para este ônibus
                            if (poltronaDesejada < 1 || poltronaDesejada > capacidadeAssentos[posOnibus]) {
                                System.out.println("ERRO: Poltrona inexistente!");
                            } else {
                                // Verifica se a poltrona já está ocupada
                                boolean ocupada = false;
                                for (int j = 0; j < qtdReservas; j++) {
                                    if (onibusDaReserva[j] == onibusDesejado && assentoDaReserva[j] == poltronaDesejada) {
                                        ocupada = true;
                                        break;
                                    }
                                }
                                
                                if (ocupada) {
                                    System.out.println("ERRO: Esta poltrona já está ocupada!");
                                } else {
                                    System.out.print("Nome do passageiro: ");
                                    nomesPassageiros[qtdReservas] = sc.nextLine();
                                    onibusDaReserva[qtdReservas] = onibusDesejado;
                                    assentoDaReserva[qtdReservas] = poltronaDesejada;
                                    qtdReservas++;
                                    System.out.println("Reserva realizada!");
                                }
                            }
                        }
                    }
                    break;

                case 4: // CONSULTA POR ÔNIBUS
                    System.out.print("Digite o número do ônibus: ");
                    int busBusca = sc.nextInt();
                    boolean achouBus = false;

                    System.out.println("--- Reservas do Ônibus " + busBusca + " ---");
                    for (int i = 0; i < qtdReservas; i++) {
                        if (onibusDaReserva[i] == busBusca) {
                            System.out.println("Assento: " + assentoDaReserva[i] + " | Nome: " + nomesPassageiros[i]);
                            achouBus = true;
                        }
                    }
                    if (!achouBus) System.out.println("Nenhuma reserva encontrada.");
                    break;

                case 5: // CONSULTA POR PASSAGEIRO
                    System.out.print("Digite o nome do passageiro: ");
                    String nomeBusca = sc.nextLine();
                    boolean achouNome = false;

                    System.out.println("--- Viagens de " + nomeBusca + " ---");
                    for (int i = 0; i < qtdReservas; i++) {
                        if (nomesPassageiros[i].equalsIgnoreCase(nomeBusca)) {
                            System.out.println("Ônibus: " + onibusDaReserva[i] + " | Assento: " + assentoDaReserva[i]);
                            achouNome = true;
                        }
                    }
                    if (!achouNome) System.out.println("Passageiro não possui reservas.");
                    break;

                case 6: // SAÍDA DO SISTEMA
                    System.out.println("Finalizando o Sistema ROADTRIP... Até logo! 🚌💨");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

            // Se a opção for 6, quebra o laço 'while' para encerrar o programa de vez
            if (opcao == 6) {
                break;
            }
        }
        sc.close(); // Fecha o Scanner para liberar memória
    }
}