

import java.util.Scanner;

public class Atv01_menu_embalagens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        do{
            System.out.println("MENU");
            System.out.println("1 - Caixa de Papelão: Ideal para transporte e armazenamento.");
            System.out.println("2 - Sacola Plástica: Leve e prática, mas pouco sustentável. ");
            System.out.println("3 - Embalagem de vidro: Resistente e reutilizável.");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a embalagem caixa de papelão.");
                    break;
                case 2:
                    System.out.println("Você escolheu a embalagem sacola plástica.");
                    break;
                case 3:
                    System.out.println("Você escolheu a embalagem de vidro.");
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
