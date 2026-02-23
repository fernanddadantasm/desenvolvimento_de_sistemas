// 3-Escreva um programa que imprima os números impares de 1 a 51 
// e os pares de 52 a 100

import java.util.Scanner;

public class Laco08_numeros_impares_atv {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i=1;i<=51;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        for(int i=52;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
