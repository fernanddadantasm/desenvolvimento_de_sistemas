package CRUD;


import java.util.Scanner;

public class CadastroLoja {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("\033[H\033[2J");
        System.out.flush();

        String[] produtos = new String[5];
        int[] quantidades = new int[5]; 
        int qtd = 0; 
        int opcao;
        
        while (true){
            System.out.println("=== Cadastro de Produtos ====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");   
            System.out.println("3 - Pesquisar (por nome)");
            System.out.println("4 - Alterar (por nome)");
            System.out.println("5 - Remover (por nome)");
            System.out.println("6 - Sair");
            System.out.print("Digite a opção desejada: ");
            opcao = sc.nextInt();
            sc.nextLine();         

            if (opcao == 6){
                System.out.println("Saindo...");
                break;

            } switch (opcao){
                case 1: // CADASTRAR    
                    if (qtd == produtos.length){
                        System.out.println("Lista cheia! Não é possível cadastrar.");
                        break;
                    }

                    System.out.print("Digite o nome do produto: ");
                    produtos[qtd] = sc.nextLine();

                    System.out.print("Digite a quantidade em estoque: ");
                    quantidades[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2: // LISTAR
                    if (qtd == 0){
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.println("\nProdutos cadastrados:");
                    for (int i = 0; i < qtd; i++){
                        System.out.println(i + " - " + produtos[i] + " - " + quantidades[i] + " unidades");
                    }       
                    break;
                case 3: // PESQUISAR
                    if (qtd == 0){
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.print("Digite o nome do produto para pesquisar: ");
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < qtd; i++){
                        if (produtos[i].equalsIgnoreCase(nomePesquisa)){
                            System.out.println("Produto encontrado: " + produtos[i] + " - " + quantidades[i] + " unidades");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 4: // ALTERAR
                    if (qtd == 0){
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.print("Digite o nome do produto para alterar: ");
                    String nomeAlterar = sc.nextLine();
                    boolean encontradoAlterar = false;
                    for (int i = 0; i < qtd; i++){
                        if (produtos[i].equalsIgnoreCase(nomeAlterar)){
                            System.out.print("Digite o novo nome do produto: ");
                            produtos[i] = sc.nextLine();
                            System.out.print("Digite a nova quantidade em estoque: ");
                            quantidades[i] = sc.nextInt();
                            sc.nextLine();
                            System.out.println("Produto alterado com sucesso!");
                            encontradoAlterar = true;
                            break;
                        }
                    }
                    if (!encontradoAlterar){
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 5: // REMOVER
                    if (qtd == 0){
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    System.out.print("Digite o nome do produto para remover: ");
                    String nomeRemover = sc.nextLine();
                    boolean encontradoRemover = false;
                    for (int i = 0; i < qtd; i++){
                        if (produtos[i].equalsIgnoreCase(nomeRemover)){
                            for (int j = i; j < qtd - 1; j++){
                                produtos[j] = produtos[j + 1];
                                quantidades[j] = quantidades[j + 1];
                            }
                            produtos[qtd - 1] = null;
                            quantidades[qtd - 1] = 0;
                            qtd--;
                            System.out.println("Produto removido com sucesso!");
                            encontradoRemover = true;
                            break;
                        }
                    }
                    if (!encontradoRemover){
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

                case 6: // SAIR
                    System.out.println("Saindo...");
                    break;
            }
            System.out.println();   
        }
        sc.close();
    }
}
        
        