// Fazer um programa para ler um número inteiro 
// e dizer se este número é par ou ímpar. 

package Introdução;
import java.util.Scanner;
public class Cond05_atv_par_impar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.print("Informe um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
        scanner.close();
    }
}

