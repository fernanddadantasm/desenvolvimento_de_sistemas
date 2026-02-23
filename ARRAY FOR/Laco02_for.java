import java.util.Scanner;

public class Laco02_for {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        for(int i=1;i<=100;i++){
            if(i%2!=0)

            System.out.println(i);
        scanner.close();
        }
    }
}

