package POO.Funcionários;


public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calcularSalario() {
        return getSalario();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Salário: " + getSalario());
    }
}
