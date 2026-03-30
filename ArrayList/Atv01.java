package ArrayList;

import java.util.ArrayList;

public class Atv01 {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        // Adicionando
        nomes.add("Fernanda");
        nomes.add("Amanda");
        nomes.add("Vanessa");

        for(int i=0; i<nomes.size();i++){
            System.out.println((i+1)+"- "+nomes.get(i));
        }
        nomes.set(2, "Maria");
        
        System.out.println(nomes);
        nomes.remove(0);
       
        System.out.println("===============================");
        for(String nome: nomes)
            System.out.println(nome);
    }
}
