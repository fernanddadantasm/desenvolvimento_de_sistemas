public class ClienteApp {
    
    public static void main(String[] args) {
        ClientePf clientePf = new ClientePf("Fernanda Dantas", "Rua Flores", "123.456.789-00");
        
        ClientePj clientePj = new ClientePj("Empresa XYZ", "Avenida Princesa Isabel", "12.345.678/0001-00");

        System.out.println("Cliente Pessoa Física:" + clientePf.getNome());
        System.out.println("Cliente Pessoa Jurídica:" + clientePj.getNome());

        clientePf.atualizarDados("Fernanda Dantas Moreira", "Rua Flores, 123");
        clientePj.atualizarDados("Empresa XYZ LTDA");

        System.out.println("Cliente Pessoa Física atualizado:" + clientePf.getNome() + ", " + clientePf.getEndereco());
        System.out.println("Cliente Pessoa Jurídica atualizado:" + clientePj.getNome());
    }
    
}
