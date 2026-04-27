import java.io.BufferedWriter;

public class Ex06 {
    public static void main(String[] args) {
        try{
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("dados.txt"));
            bw.write("Terceira linha");
            bw.newLine();
            bw.write("Quarta linha");
            
            bw.close();
        }catch(java.io.IOException e){
            e.printStackTrace();
        }
    }
}
