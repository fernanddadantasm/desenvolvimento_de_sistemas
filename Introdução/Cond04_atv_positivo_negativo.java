package Introdução;
// Elaborar um programa que permita ler um número inteiro a partir do teclado, 
// e apresentar a indicação de que é positivo, negativo ou nulo.

import java.util.Scanner;
public class Cond04_atv_positivo_negativo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero > 0) {
            System.out.println("Número positivo.");
        } else if (numero < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número nulo.");
        }
        scanner.close();
    }
    
}
