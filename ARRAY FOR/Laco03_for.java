import java.util.Scanner;

public class Laco03_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i=1;i<=5;i++){
    
            System.out.println("Informe o "+i+"º número: ");

            int num = sc.nextInt();

            System.out.println("O número informado foi: "+num);
        }

        sc.close();
    }

}


