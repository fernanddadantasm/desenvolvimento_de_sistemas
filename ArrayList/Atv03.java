package ArrayList;

import java.util.Scanner;

import java.util.ArrayList;

public class Atv03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();
        // Adicionando
        for(int i=0;i<3;i++){
            System.out.println("Digite o nome "+(i+1)+ ":" );
            nomes.add(sc.nextLine());
        }
        // Listando
        for(int i=0;i<nomes.size();i++){
            System.out.println(i+" - "+nomes.get(i));
        }

        // Alterando

        int indiceALterar;
        do{
            System.out.println("\nDigite o indice que deseja alterar: ");
            indiceALterar = sc.nextInt();
            sc.nextLine();
            if(indiceALterar < 0 || indiceALterar>=nomes.size())
                System.out.println("Indice inválido!");
            
        }while(indiceALterar < 0 || indiceALterar>=nomes.size());
        System.out.println("Digite o novo nome: ");
        String novoNome = sc.nextLine();

        nomes.set(indiceALterar, novoNome);
        System.out.println("Nome alterado com sucesso!");

        // Removendo

        int indice;
        do{
            System.out.println("Digite o indice para remover");
            indice=sc.nextInt();

            if(indice<0 || indice>=nomes.size())
                System.out.println("Indice inválido");
        }while(indice<0 || indice>=nomes.size());
        nomes.remove(indice);
        System.out.println("Nome inválido");

        for(String nome: nomes){
            System.out.println(nome);
        }


        
       sc.close(); 
    }    
}
