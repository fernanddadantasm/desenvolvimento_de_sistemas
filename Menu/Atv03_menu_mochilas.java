import java.util.Scanner;

public class Atv03_menu_mochilas {
    
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        
        int opcao;
        do{
            System.out.println("MENU");
            System.out.println("1 -  Mochila Escolar.");
            System.out.println("2 - Mochila de Viagem. ");
            System.out.println("3 - Mochila Esportiva.");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Mochila Escolar: Compacta e ideal para estudantes.");
                    break;
                case 2:
                    System.out.println("Você escolheu a Mochila de Viagem: Espaçosa, ideal para longas jornadas .");
                    break;
                case 3:
                    System.out.println("Você escolheu a  Mochila Esportiva: Leve, resistente e ergonômica.");
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
        
    

