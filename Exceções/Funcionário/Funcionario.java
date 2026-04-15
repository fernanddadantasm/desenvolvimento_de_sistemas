package Funcionário;
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }

        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário final: R$ " + calcularSalario());
        System.out.println("-------------------------");
    }
}