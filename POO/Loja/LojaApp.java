package POO.Loja;

import java.util.Scanner;

public class LojaApp {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = sc.nextLine();
        System.out.println("Digite o preço do produto:");
        String preco = sc.nextLine();
        System.out.println("Digite a quantidade do produto:");
        int quantidade = sc.nextInt();
        
        Loja loja = new Loja(nome, preco, quantidade);

        System.out.println("Produto:");
        System.out.println("Nome: " + loja.getNome());
        System.out.println("Preço: R$" + loja.getPreco());
        System.out.println("Quantidade: " + loja.getQuantidade());
        
        sc.close();
    }
}

