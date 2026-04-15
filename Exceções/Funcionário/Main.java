package Funcionário;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        try {
            System.out.print("Quantos funcionários deseja cadastrar? ");
            int n = sc.nextInt();
            sc.nextLine(); // limpar buffer

            for (int i = 0; i < n; i++) {
                System.out.println("\nFuncionário #" + (i + 1));
                System.out.print("Gerente ou Vendedor (g/v)? ");
                char tipo = sc.next().toLowerCase().charAt(0);
                sc.nextLine();

                System.out.print("Nome: ");
                String nome = sc.nextLine();

                System.out.print("Salário base: ");
                double salario = sc.nextDouble();

                if (tipo == 'g') {
                    funcionarios.add(new Gerente(nome, salario));

                } else if (tipo == 'v') {
                    System.out.print("Comissão: ");
                    double comissao = sc.nextDouble();

                    funcionarios.add(new Vendedor(nome, salario, comissao));
                } else {
                    System.out.println("Tipo inválido!");
                    i--; // repete o cadastro
                }
            }

            System.out.println("\n=== LISTA DE FUNCIONÁRIOS ===");
            for (Funcionario f : funcionarios) {
                f.exibirDados(); // polimorfismo
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada de dados inválida.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
