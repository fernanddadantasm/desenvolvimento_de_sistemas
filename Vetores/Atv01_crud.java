package Vetores;
import java.util.Scanner;   
public class Atv01_crud {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        
        String[] carros = new String[10];
        int opcao;
        do {
            System.out.println("\nMenu:");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Alterar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
           
            opcao = sc.nextInt();
            sc.nextLine();        

            switch (opcao) {
                case 1:
                    // Cadastrar
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] == null) {
                            System.out.print("Digite o nome do carro para cadastrar: ");
                            carros[i] = sc.nextLine();
                            break;
                        }
                    }
                    break;
                case 2:
                    // Listar
                    System.out.println("\nCarros cadastrados:");
                    for (int i = 0; i < carros.length; i++) {
                        if (carros[i] != null) {
                            System.out.println(i + " - " + carros[i]);
                        }
                    }
                    break;
                case 3:
                    // Alterar
                    System.out.print("Digite a posição do carro que deseja alterar: ");
                    if (sc.hasNextInt()) {
                        int posicaoAlterar = sc.nextInt();
                        sc.nextLine(); 
                        if (posicaoAlterar >= 0 && posicaoAlterar < carros.length && carros[posicaoAlterar] != null) {
                            System.out.print("Digite o novo nome do carro: ");
                            carros[posicaoAlterar] = sc.nextLine();
                            System.out.println("Carro alterado com sucesso!");
                        } else {
                            System.out.println("Posição inválida ou vaga não cadastrada!");
                        }
                    } else {
                        System.out.println("Entrada inválida! Digite um número.");
                        sc.nextLine();
                    }
                    break;
                case 4:
                    // Remover
                    System.out.print("Digite a posição do carro que deseja remover: ");
                    if (sc.hasNextInt()) {
                        int posicaoRemover = sc.nextInt();
                        sc.nextLine(); 
                        if (posicaoRemover >= 0 && posicaoRemover < carros.length && carros[posicaoRemover] != null) {
                            carros[posicaoRemover] = null;
                            System.out.println("Carro removido com sucesso!");
                        } else {
                            System.out.println("Posição inválida ou vaga não cadastrada!");
                        }
                    } else {
                        System.out.println("Entrada inválida! Digite um número.");
                        sc.nextLine();
                    }
                    break;
                case 0:
                    // Sair
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();

}
}


