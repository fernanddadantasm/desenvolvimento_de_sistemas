
// 1-Escrever os números de 10 a 20 em ordem crescente

import java.util.Scanner;
public class Laco06_ordem_crescente_atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    
        for(int i=10;i<=20;i++){
            System.out.println(i);

        }
        sc.close();
    }

}