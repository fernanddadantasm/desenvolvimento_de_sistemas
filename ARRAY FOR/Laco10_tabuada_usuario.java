
// CRIE UM PROGRAMA QUE SOLICITE AO USUÁRIO UM NÚMERO 
// E EXIBA A TABUADA DESSE NÚMERO UTILIZANDO UM LAÇO DE REPETIÇÃO
import java.util.Scanner;
public class Laco10_tabuada_usuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Digite um número para calcular a tabuada:");
        int numero = sc.nextInt();

        for(int i=0;i<=10;i++){
            System.out.println(numero + " x " + i + " = " + (numero*i));
        }

        sc.close();
    }
}
