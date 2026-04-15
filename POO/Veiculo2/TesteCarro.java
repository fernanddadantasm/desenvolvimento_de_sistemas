package POO.Veiculo2;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Civic", "Honda", 2020, 90000);
        Carro carro2 = new Carro("Corolla", "Toyota", 2021, 95000);

            carro1.exibirDetalhes();
            System.out.println();
            carro2.exibirDetalhes();
        }
    }
    