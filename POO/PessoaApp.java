package POO;

public class PessoaApp {
    public static void main(String[] args) {
        
        Pessoa pessoa1 = new Pessoa("Vanessa", 22);
        Pessoa pessoa2 = new Pessoa("Gabriela", 25);

        System.out.println("O nome da pessoa 1 é: " + pessoa1.getNome());
        System.out.println("A idade da pessoa 1 é: " + pessoa1.getIdade());

        pessoa1.setNome("Maria do Carmo");
        pessoa1.setIdade(30);

        System.out.println("O nome da pessoa 1 é: " + pessoa1.getNome());
        System.out.println("A idade da pessoa 1 é: " + pessoa1.getIdade());

        pessoa2.setNome("Ana Clara");
        pessoa2.setIdade(28);

        System.out.println("O nome da pessoa 2 é: " + pessoa2.getNome());
        System.out.println("A idade da pessoa 2 é: " + pessoa2.getIdade());


    }

}
