import java.io.BufferedReader;
import java.io.FileReader;

public class Ex07 {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new FileReader("dados.txt"));
            String linha;
            
            while((linha = br.readLine()) != null){
                System.out.println(linha);
            }
            
            br.close();
        }catch(java.io.IOException e){
            e.printStackTrace();
        }
    }
}
