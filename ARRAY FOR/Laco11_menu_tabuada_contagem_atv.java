// 6-Escreva o programa que deverá apresentar o seguinte menu ao usuário:
// 1 - Calcular Tabuada
// 2 - Realizar Contagem Regressiva
// 0 - Sair

import java.util.Scanner;
public class Laco11_menu_tabuada_contagem_atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    
        int opcao;
        do{
            System.out.println("1 - Calcular Tabuada");
            System.out.println("2 - Realizar Contagem Regressiva");
            System.out.println("0 - Sair");
            opcao = sc.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("Digite um número para calcular a tabuada:");
                    int numero = sc.nextInt();
                    for(int i=0;i<=10;i++){
                        System.out.println(numero + " x " + i + " = " + (numero*i));
                    }
                    break;
                case 2:
                    System.out.println("Digite um número para realizar a contagem regressiva:");
                    int contagem = sc.nextInt();
                    for(int i=contagem;i>=0;i--){
                        System.out.println(i);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }while(opcao != 0);
        
        sc.close();
    }



    
}
