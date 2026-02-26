// 3-Faça um programa que peça ao usuário para digitar  o nome do professor mais fofo do senai.  
// O programa só termina se ele digitar Anderson

import java.util.Scanner;
public class Atv03_professor_fofo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite o nome do professor mais fofo do Senai (digite 'Anderson' para encerrar):");

        while (true) {
            System.out.print("Nome: ");
            nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("Anderson")) {
                System.out.println("Você digitou o nome correto! Encerrando o programa.");
                break;
            }
        }

        scanner.close();
    }
}