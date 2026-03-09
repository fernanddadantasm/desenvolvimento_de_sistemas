package Vetores;

import java.util.Scanner;

public class Vet06 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String[] nomes = new String[3];
        double[] idade = new double[3];

        for (int i=0;i<3;i++){
            System.out.print("Digite o nome: ");
            nomes[i] = sc.nextLine();
            
            System.out.print("Digite a idade: ");
            idade[i] = sc.nextInt();
            sc.nextLine();
        }
        for (int i=0;i<3;i++){
            System.out.println("Nome: " + nomes[i] + ", Idade: " + idade[i]+" anos");
        }
        sc.close();
    }
}
