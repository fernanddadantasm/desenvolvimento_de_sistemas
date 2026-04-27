

import javax.swing.JOptionPane;

public class CadastroPessoa {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Digite seu nome: ");
        String idadeTexto = JOptionPane.showInputDialog("Digite sua idade: ");
        int idade = Integer.parseInt(idadeTexto);

        String status;
        if (idade >= 18) {
            status = "Maior de idade.";
        } else {
            status = "Menor de idade.";
        }

        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + idade + "\n" + status, "Dados do Usuário", JOptionPane.INFORMATION_MESSAGE);
    }
}
