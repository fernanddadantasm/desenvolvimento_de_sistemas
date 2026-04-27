import java.io.File;

public class RemoverArquivo {
    public static void main(String[] args) {
        String arquivo = "arquivo.txt";

        File file = new File(arquivo);

        if(file.exists()){
            if(file.delete()){
            System.out.println("Arquivo removido com sucesso!");
        }else{
            System.out.println("Erro ao remover o arquivo!");
        }
    }else{
        System.out.println("O arquivo não existe!");
    }
    }
    
}
