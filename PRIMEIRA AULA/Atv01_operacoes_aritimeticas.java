// ESCREVA UM PROGRAMA QUE SOLICITE AO USUÁRIO DOIS NÚMEROS E EXIBA A SOMA, SUBTRAÇÃO, DIVISÃO E MULTIPLICAÇÃO.


import java.util.Scanner;
public class Atv01_operacoes_aritimeticas {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + subtracao);
        System.out.println("A multiplicação é: " + multiplicacao);
        System.out.println("A divisão é: " + divisao);


    

        sc.close();

}
}

