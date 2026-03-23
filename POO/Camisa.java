package POO;
public class Camisa {
    private String cor;
    private String tamanho;
    private String tipo;

    public Camisa(String cor, String tamanho, String tipo){
        this.cor = cor;
        this.tamanho = tamanho; 
        this.tipo = tipo;
    }

    public String getCor(){
        return cor;
    }

    public String getTamanho(){
        return tamanho;
    }

    public String getTipo(){
        return tipo;
    }
        
}
