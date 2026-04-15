

public abstract class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // método abstrato obrigatório
    public abstract double calcularValor();

    // método concreto
    public void exibir() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Valor: R$ " + calcularValor());
    }
}