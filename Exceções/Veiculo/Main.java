

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> lista = new ArrayList<>();

        try {
            System.out.print("Digite o modelo: ");
            String modelo = sc.nextLine();

            if (modelo.trim().isEmpty()) {
                throw new IllegalArgumentException("Modelo não pode ser vazio.");
            }

            System.out.print("Digite o ano: ");
            int ano = sc.nextInt();

            if (ano < 2000) {
                throw new IllegalArgumentException("Ano deve ser >= 2000.");
            }

            System.out.print("Tipo (1-Carro / 2-Moto): ");
            int tipo = sc.nextInt();

            Veiculo v;

            if (tipo == 1) {
                v = new Carro(modelo, ano);
            } else if (tipo == 2) {
                v = new Moto(modelo, ano);
            } else {
                System.out.println("Tipo inválido!");
                sc.close();
                return;
            }

            lista.add(v);

            System.out.println("\n--- VEÍCULOS CADASTRADOS ---");
            for (Veiculo veic : lista) {
                veic.exibir();
                System.out.println("------------------------");
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: digite um número válido para o ano.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}