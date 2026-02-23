// ESCREVA UM CÓDIGO QUE IMPRIMA NA TELA A TABUADA DE TODOS OS NÚEMROS DE 1 A 10

import java.util.Scanner;
public class Laco09_tabuada_atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int num=1;num<=10;num++){
            System.out.println("Tabuada do " + num + ":");
            for(int i=0;i<=10;i++){
                System.out.println(num + " x " + i + " = " + (num*i));
            }
            System.out.println();
        }

        sc.close();
    }
}

