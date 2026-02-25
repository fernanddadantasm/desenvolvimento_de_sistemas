// ESCREVA UM PROGRAMA QUE CALCULE O TRABALHO REALIZADO POR UMA FORÇA QUE ATUA SOBRE UM OBJETO, UTILIZANDO A FÓRMULA T=F*D, ONDE T É O TRABALHO, 
// F É A FORÇA APLICADA E D É A DISTÂNCIA PERCORRIDA PELO OBJETO


import java.util.Scanner;
public class Atv04_forca_trabalho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a força aplicada: ");
        double forca = sc.nextDouble();
        System.out.print("Digite a distância percorrida: ");
        double distancia = sc.nextDouble();
        double trabalho = forca * distancia;
        System.out.println("O trabalho realizado é: " + trabalho);
        sc.close();

    }
    
}
