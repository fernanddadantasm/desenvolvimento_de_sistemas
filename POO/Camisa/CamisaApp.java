package POO.Camisa;
import java.util.Scanner;

public class CamisaApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a cor da camisa:");
        String cor = sc.nextLine();
        System.out.println("Digite o tamanho da camisa:");
        String tamanho = sc.nextLine();
        System.out.println("Digite o tipo da camisa:");
        String tipo = sc.nextLine();
        
        Camisa camisa = new Camisa(cor, tamanho, tipo);

        System.out.println("Camisa:");
        System.out.println("Cor: " + camisa.getCor());
        System.out.println("Tamanho: " + camisa.getTamanho());
        System.out.println("Tipo: " + camisa.getTipo());
        
        sc.close();
    }
}
