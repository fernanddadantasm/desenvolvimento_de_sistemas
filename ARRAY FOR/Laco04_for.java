import java.util.Scanner;

public class Laco04_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        
        System.out.println("Informe um número: ");
        int numero = sc.nextInt();
        
        for(int i=1;i<=10;i++){
            System.out.println(numero+" x "+i+" = "+(numero*i));
        }
        sc.close();
    }
}
