
import java.util.Scanner;

public class Atv02_menu_canetas {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
        int opcao;
        do{
            System.out.println("MENU");
            System.out.println("1 - Caneta Esferográfica.");
            System.out.println("2 - Caneta Gel. ");
            System.out.println("3 - Caneta Tinteiro.");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Caneta Esferográfica: Econômica e de longa duração.");
                    break;
                case 2:
                    System.out.println("Você escolheu a Caneta Gel: Tinta mais pigmentada e escrita suave.");
                    break;
                case 3:
                    System.out.println("Você escolheu a  Caneta Tinteiro: Clássica e elegante, usada para caligrafia.");
                    break;
                case 4:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
        } while(opcao != 4);
        
        sc.close();
    }
    
}
        
    
