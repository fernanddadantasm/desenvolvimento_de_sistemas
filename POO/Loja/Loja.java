package POO.Loja;


public class Loja {
    private String nome;
    private String preco;
    private int quantidade;
    
    public Loja(String nome, String preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getPreco() {
        return preco;
    }
    
    public int getQuantidade() {
        return quantidade;
    }
    
   
}
