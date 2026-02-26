import java.util.Scanner;

public class Laco02_while_atv_positivo {
    public static void main(String[] args) {

    
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int numero;

        do{
            System.out.println("Digite o número positivo: ");
            numero=scanner.nextInt();
        } while (numero <= 0);
        System.out.println("O número digitado é POSITIVO! ");
        scanner.close();
        }
}



