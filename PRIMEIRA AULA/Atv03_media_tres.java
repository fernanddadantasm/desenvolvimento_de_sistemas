import java.util.Scanner;

public class Atv03_media_tres {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 ) / 3;

        System.out.println("A média é " + media);

        sc.close();
        
    }
    
}
