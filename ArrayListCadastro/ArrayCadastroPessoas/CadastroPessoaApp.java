package ArrayListCadastro.ArrayCadastroPessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoaApp {
    private static ArrayList<Pessoa> pessoas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Cadastrar Aluno");
            System.out.println("2. Cadastrar Professor");
            System.out.println("3. Listar");
            System.out.println("4. Alterar");
            System.out.println("5. Remover");
            System.out.println("6. Pesquisar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarAluno();
                    break;
                case 2:
                    cadastrarProfessor();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    alterar();
                    break;
                case 5:
                    remover();
                    break;
                case 6:
                    pesquisar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void cadastrarAluno() {
        System.out.println("\n=== CADASTRO DE ALUNO ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Matrícula: ");
        String matricula = sc.nextLine();
        
        pessoas.add(new Aluno(nome, idade, matricula));
        System.out.println("✓ Aluno cadastrado com sucesso!");
    }

    private static void cadastrarProfessor() {
        System.out.println("\n=== CADASTRO DE PROFESSOR ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();

        System.out.print("Disciplina: ");
        String disciplina = sc.nextLine();
        
        pessoas.add(new Professor(nome, idade, disciplina));
        System.out.println("✓ Professor cadastrado com sucesso!");
    }

    private static void listar() {
        if (pessoas.isEmpty()) {
            System.out.println("\nNenhuma pessoa cadastrada.");
        } else {
            System.out.println("\n=== LISTAGEM DE PESSOAS ===");
            for (int i = 0; i < pessoas.size(); i++) {
                Pessoa p = pessoas.get(i);
                System.out.println("\nÍndice: " + i);
                if (p instanceof Aluno) {
                    System.out.println("[ALUNO]");
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    System.out.println("Matrícula: " + ((Aluno) p).getMatricula());
                } else if (p instanceof Professor) {
                    System.out.println("[PROFESSOR]");
                    System.out.println("Nome: " + p.getNome());
                    System.out.println("Idade: " + p.getIdade());
                    System.out.println("Disciplina: " + ((Professor) p).getDisciplina());
                }
                System.out.println("---");
            }
        }
    }

    private static void alterar() {
        System.out.print("Índice da pessoa a alterar: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            Pessoa p = pessoas.get(indice);
            System.out.print("Novo nome: ");
            String nome = sc.nextLine();
            p.setNome(nome);

            System.out.print("Nova idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            p.setIdade(idade);

            if (p instanceof Aluno) {
                System.out.print("Nova matrícula: ");
                String matricula = sc.nextLine();
                ((Aluno) p).setMatricula(matricula);
            } else if (p instanceof Professor) {
                System.out.print("Nova disciplina: ");
                String disciplina = sc.nextLine();
                ((Professor) p).setDisciplina(disciplina);
            }
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void remover() {
        System.out.print("Índice da pessoa a remover: ");
        int indice = sc.nextInt();
        sc.nextLine();

        if (indice >= 0 && indice < pessoas.size()) {
            pessoas.remove(indice);
            System.out.println("Pessoa removida.");
        } else {
            System.out.println("Índice inválido!");
        }
    }

    private static void pesquisar() {
        System.out.print("Nome a pesquisar: ");
        String nome = sc.nextLine();

        boolean encontrado = false;
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.exibirDados();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Pessoa não encontrada.");
        }
    }
}


