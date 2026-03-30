package ArrayList;

import java.util.ArrayList;

public class Atv02 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        System.out.println(numeros);
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        numeros.set(1, 50);

        System.out.println(numeros);

        numeros.remove(0);

        System.out.println("----------------------------------");
        for(Integer numero: numeros)
            System.out.println(numero);
    }



}
