package POO.Cliente;

public class ClientePF extends Cliente {
    private String cpf;

    public ClientePF(int codigo, String nome, String endereco, String cpf) {
        super(codigo, nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("CPF: " + getCpf());
    }
    
}


