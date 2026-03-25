package POO.Cliente;

public class Cliente {
   private String nome;
   private String endereco;
   private int codigo;

   public Cliente(int codigo, String nome, String endereco) {
    this.codigo = codigo;
    this.nome = nome;
    this.endereco = endereco;
   }

   public int getCodigo(){
    return codigo;
   }

   public void SetCodigo(int codigo){
    this.codigo = codigo;
   }

   public String getNome(){
    return nome;
   }

    public void setNome(String nome){
     this.nome = nome;
    }
   public String getEndereco(){
    return endereco;
   }

    public void setEndereco(String endereco){
     this.endereco = endereco;
    }

    public void exibirDados(){
        System.out.println("Código: " + getCodigo());
        System.out.println("Nome: " + getNome());
        System.out.println("Endereço: " + getEndereco());
    }


}
