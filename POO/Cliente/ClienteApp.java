package POO.Cliente;

public class ClienteApp {
    public static void main(String[] args) {
        ClientePF c1 = new ClientePF(1, "Fernanda Dantas", "Rua das Flores , 156", "123.456.789-00");
        ClientePj c2 = new ClientePj(2, "Empresa F.A", "Avenida , 456", "12.345.678/0001-00");

        System.out.println("Dados do Cliente Pessoa Física:");
        c1.exibirDados();

        System.out.println("\nDados do Cliente Pessoa Jurídica:");
        c2.exibirDados();

    }
}
