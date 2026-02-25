
import java.util.Scanner;
public class Atv02_media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("\033[H\033[2J");
        // System.out.flush();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        double media = (nota1 + nota2) / 2 ;

        System.out.println("A média é: " + media);

        sc.close();
}
}
