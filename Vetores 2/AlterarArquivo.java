import java.io.FileWriter;

public class AlterarArquivo {
    public static void main(String[] args) {
       String caminho = "arquivo.txt";

       try{
            FileWriter writer  = new FileWriter(caminho);
            writer.write("Conteudo Atualizado!\n");
            writer.write("Este texto substituirá o conteúdo anterior do arquivo.");

            writer.close();
            System.out.println("Arquivo alterado!");
         }catch(java.io.IOException e){
            System.out.println("Ocorreu um erro ao alterar o arquivo: " + e.getMessage());
       }
    }
}
