// CRIE UM PROGRAMA QUE SOLICITE A IDADE DE UMA PESSOA E EXIBA SE ELA É CRIANÇA (0-12 ANOS),
// ADOLESCENTE(13-17 ANO), ADULTO (18-59 ANOS) OU IDOSO(60 ANOS OU MAIS)
package Introdução;
import java.util.Scanner;
public class Cond06_atv_idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        System.out.print("Informe a idade da pessoa: ");
        int idade = scanner.nextInt();
        
        if (idade >= 0 && idade <= 12) {
            System.out.println("Criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Adolescente.");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Adulto.");
        } else {
            System.out.println("Idoso.");
        }
        scanner.close();
    }
    
}
