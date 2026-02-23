import java.util.Scanner;

public class Laco05_for {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i=1;i<=3;i++){
            System.out.println("Informe o nome: "+i);
            String nome = sc.nextLine();

            System.out.println("O nome cadastrado foi: "+nome);

        }
        sc.close();
        }
}

