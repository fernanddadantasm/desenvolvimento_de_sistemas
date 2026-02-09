// PROBLEMA: Controlar o acesso a uma porta usando uma senha pré-configurada no sistema.
// DADO DE ENTRADA: SENHA (variável alfanumérica)
// DADO DE SAÌDA: porta aberta (simulado com msg "PORTA ABERTA") ou mensagem de "SENHA NAO CONFERE"
// VARIÁVEIS: SENHA (tipo alfanumérica)

package Introdução;
import java.util.Scanner;
public class Cond07_atv_senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        String senhaPreConfigurada = "12345"; // Senha pré-configurada
        System.out.print("Digite a senha para abrir a porta: ");
        String senhaDigitada = scanner.nextLine();
        
        if (senhaDigitada.equals(senhaPreConfigurada)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }
        scanner.close();
    }
    
}
