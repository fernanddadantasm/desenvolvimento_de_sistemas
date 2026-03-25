package POO.Funcionários;

public class FuncionarioApp {
    public static void main(String[] args) {
        FuncionarioGerente gerente = new FuncionarioGerente("Fernanda Dantas", 5000.0);
        FuncionarioTecnico tecnico = new FuncionarioTecnico("Marina Silva", 3000.0);

        System.out.println("Informações do Gerente:");
        gerente.exibirInformacoes();

        System.out.println("\nInformações do Técnico:");
        tecnico.exibirInformacoes();
    }
}