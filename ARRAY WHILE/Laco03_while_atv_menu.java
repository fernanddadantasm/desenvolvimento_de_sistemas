import java.util.Scanner;

public class Laco03_while_atv_menu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int op = 0;
        do{

            System.out.println("Menu de opções:");
            System.out.println("1. CADASTRO");
            System.out.println("2. LISTAR");
            System.out.println("3. REMOVER");
            System.out.println("4. Sair");
            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();


        switch (op) {
            case 1:
                System.out.println("Opção de cadastro selecionada.");
                break;
            case 2:
                System.out.println("Opção de listar selecionada.");
                break;
            case 3:
                System.out.println("Opção de remover selecionada.");
                break;
            case 4:
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Opção inválida. Por favor, selecione uma opção válida.");
                }
            } while(op != 4);
            
            sc.close();

    }
}
