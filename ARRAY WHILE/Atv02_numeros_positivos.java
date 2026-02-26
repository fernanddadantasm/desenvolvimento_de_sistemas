

import java.util.Scanner;
public class Atv02_numeros_positivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite números positivos (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("Número negativo detectado. Encerrando o programa.");
                break;
            }
        }

        scanner.close();
    }
}