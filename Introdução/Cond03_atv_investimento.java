package Introdução;
// Desenvolver um programa em Java que identifique a categoria de taxa de um investimento com base no valor informado pelo usuário.
// Regras de Negócio:
// O programa deve solicitar um valor monetário e exibir a classificação da taxa seguindo estes critérios:
// Acima de 50.000: Exibir "Taxa Isenta (0%)".
// Acima de 20.000 (até 50.000): Exibir "Taxa Silver (0.5%)".
// Acima de 5.000 (até 20.000): Exibir "Taxa Bronze (1.0%)".
// 5.000 ou menos: Exibir "Taxa Padrão (2.0%)"

import java.util.Scanner;

public class Cond03_atv_investimento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.print("Informe o valor do investimento: ");
        
        double valorInvestimento = scanner.nextDouble();
        
        if (valorInvestimento > 50000) {
            System.out.println("Taxa Isenta (0%)");
        } else if (valorInvestimento > 20000) {
            System.out.println("Taxa Silver (0.5%)");
        } else if (valorInvestimento > 5000) {
            System.out.println("Taxa Bronze (1.0%)");
        } else {
            System.out.println("Taxa Padrão (2.0%)");
        }
        scanner.close();
    }
}
