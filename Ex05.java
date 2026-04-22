
import java.io.FileReader;
import java.io.IOException;

public class Ex05 {
    public static void main(String[]args){
        try{
            FileReader fr = new FileReader("dados.txt");
            int caractere;

            while((caractere = fr.read()) != -1){
                System.out.print((char)caractere);
            }
            fr.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
