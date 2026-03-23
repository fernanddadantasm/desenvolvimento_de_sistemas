package POO;
import java.util.Scanner;

public class CarroApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite a marca do carro:");
        String marca = sc.nextLine();
        System.out.println("Digite o modelo do carro:");
        String modelo = sc.nextLine();
        System.out.println("Digite o ano de fabricação do carro:");
        int ano = sc.nextInt();
        sc.nextLine(); // consume newline
        
        Carro carro = new Carro(marca, modelo, ano);

        System.out.println("O modelo do carro é: " + carro.getModelo());
        System.out.println("A marca do carro é: " + carro.getMarca());
        System.out.println("O ano de fabricação do carro é: " + carro.getAnoFabricacao());
        
        sc.close();
    }
}
