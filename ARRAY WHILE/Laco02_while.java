import java.util.Scanner;

public class Laco02_while {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int contador = 1;
        System.out.println("Iniciando o contador com do-while");

        do {
            System.out.println("O valor do contador é: " + contador);
            contador++;
        } while (contador < 5);

        System.out.println("Fim do laço.");
        scanner.close();

        }
}

