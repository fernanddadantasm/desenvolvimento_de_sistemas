import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
    
public class CadastroAnimalApp {
    public static void CadastroAnimal(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());

        int opcao;
        do{
            System.out.println("1. Cachorro");
            System.out.println("2. Gato");
            System.out.println("0. Sair");
            System.out.println("Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    animais.get(0).fazerSom();
                    break;
                case 2:
                    animais.get(1).fazerSom();
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
        scanner.close();

        }


 

       

