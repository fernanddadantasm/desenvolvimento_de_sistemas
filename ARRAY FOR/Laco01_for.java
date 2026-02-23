import java.util.Scanner;

public class Laco01_for {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        for(int i=1;i<=5;i++){
            System.out.println("Contador: " + i);
        
        scanner.close();

        }
    }
}
