package POO.Funcionários;

public class FuncionarioTecnico {
    private String nome;
    private double salarioBase;
    private static final double BONUS = 1000.0;

    public FuncionarioTecnico(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double calcularSalario() {
        return getSalarioBase() + BONUS;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: " + getSalarioBase());
        System.out.println("Bônus: " + BONUS);
        System.out.println("Salário Total: " + calcularSalario());
    }
    
}
