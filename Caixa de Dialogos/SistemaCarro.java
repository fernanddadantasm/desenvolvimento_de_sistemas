

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class SistemaCarro {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>();
        boolean executando = true;

        while (executando) {
            String opcao = JOptionPane.showInputDialog(null, "Escolha uma opcao:\n 1 - Cadastrar Carro\n 2 - Listar Carros\n 3 - Detalhar Carro\n 4 - Alterar Carro\n 5 - Remover Carro\n 6 - Gravar em Arquivo\n 7 - Sair", "MENU PRINCIPAL", JOptionPane.QUESTION_MESSAGE);

            if (opcao == null) {
                JOptionPane.showMessageDialog(null, "Operacao cancelada.");
                break;
            }

            switch (opcao) {

                case "1":
                    String marca = JOptionPane.showInputDialog(null, "Digite a marca: ", "Cadastrar Carro", JOptionPane.QUESTION_MESSAGE);
                    String modelo = JOptionPane.showInputDialog(null, "Digite o modelo: ", "Cadastrar Carro", JOptionPane.QUESTION_MESSAGE);
                    String anoTexto = JOptionPane.showInputDialog(null, "Digite o ano: ", "Cadastrar Carro", JOptionPane.QUESTION_MESSAGE);
                    int ano = Integer.parseInt(anoTexto);
                    carros.add(new Carro(marca, modelo, ano));
                    JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case "2":
                    if (carros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        String lista = "Carros cadastrados:\n";
                        for (int i = 0; i < carros.size(); i++) {
                            lista += (i + 1) + " - " + carros.get(i).getMarca() + " " + carros.get(i).getModelo() + "\n";
                        }
                        JOptionPane.showMessageDialog(null, lista, "Lista de Carros", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case "3":
                    if (carros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        String numTexto = JOptionPane.showInputDialog(null, "Digite o numero do carro: ", "Detalhar Carro", JOptionPane.QUESTION_MESSAGE);
                        int num = Integer.parseInt(numTexto) - 1;
                        if (num >= 0 && num < carros.size()) {
                            JOptionPane.showMessageDialog(null, carros.get(num).exibirDetalhes(), "Detalhes do Carro", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Numero invalido.");
                        }
                    }
                    break;

                case "4":
                    if (carros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        String numAltTexto = JOptionPane.showInputDialog(null, "Digite o numero do carro: ", "Alterar Carro", JOptionPane.QUESTION_MESSAGE);
                        int numAlt = Integer.parseInt(numAltTexto) - 1;
                        if (numAlt >= 0 && numAlt < carros.size()) {
                            String novaMarca = JOptionPane.showInputDialog(null, "Digite a nova marca: ", "Alterar Carro", JOptionPane.QUESTION_MESSAGE);
                            String novoModelo = JOptionPane.showInputDialog(null, "Digite o novo modelo: ", "Alterar Carro", JOptionPane.QUESTION_MESSAGE);
                            String novoAnoTexto = JOptionPane.showInputDialog(null, "Digite o novo ano: ", "Alterar Carro", JOptionPane.QUESTION_MESSAGE);
                            int novoAno = Integer.parseInt(novoAnoTexto);
                            carros.get(numAlt).setMarca(novaMarca);
                            carros.get(numAlt).setModelo(novoModelo);
                            carros.get(numAlt).setAno(novoAno);
                            JOptionPane.showMessageDialog(null, "Carro alterado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Numero invalido.");
                        }
                    }
                    break;

                case "5":
                    if (carros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        String numRemTexto = JOptionPane.showInputDialog(null, "Digite o numero do carro: ", "Remover Carro", JOptionPane.QUESTION_MESSAGE);
                        int numRem = Integer.parseInt(numRemTexto) - 1;
                        if (numRem >= 0 && numRem < carros.size()) {
                            carros.remove(numRem);
                            JOptionPane.showMessageDialog(null, "Carro removido com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "Numero invalido.");
                        }
                    }
                    break;

                case "6":
                    if (carros.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
                    } else {
                        try {
                            FileWriter fw = new FileWriter("carros.txt");
                            for (int i = 0; i < carros.size(); i++) {
                                fw.write("Marca: " + carros.get(i).getMarca() + "\n");
                                fw.write("Modelo: " + carros.get(i).getModelo() + "\n");
                                fw.write("Ano: " + carros.get(i).getAno() + "\n\n");
                            }
                            fw.close();
                            JOptionPane.showMessageDialog(null, "Informacoes gravadas em carros.txt!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        } catch (IOException e) {
                            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo.");
                        }
                    }
                    break;

                case "7":
                    JOptionPane.showMessageDialog(null, "Saindo do programa...");
                    executando = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcao invalida, tente novamente.");
                    break;
            }
        }
    }
}
