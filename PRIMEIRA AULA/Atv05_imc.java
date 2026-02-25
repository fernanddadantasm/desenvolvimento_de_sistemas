
import java.util.Scanner;
public class Atv05_imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu peso em kg: ");
        double peso = sc.nextDouble();
        System.out.print("Digite sua altura em metros: ");
        double altura = sc.nextDouble();
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é: " + imc);
        sc.close();
    }
}
