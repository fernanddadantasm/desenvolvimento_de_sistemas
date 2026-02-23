// 2-Escrever os números de 20 a 10 em ordem decrescente

import java.util.Scanner;
public class Laco07_ordem_descrescente_atv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
    
        for(int i=20;i>=10;i--){
            System.out.println(i);

        }
        sc.close();
    }

}

