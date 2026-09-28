//repetiçao serve pra repetir uma logica uma qnt determinada 
package logicaBasica;

import java.util.ArrayList;


public class Loops {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
            nomes.add("Luiz");
            nomes.add("Maria");
            nomes.add("João");
             int [] colecaoInteiros = {1,2,3,4,5,6};
                  //contador condiçao manipulação
            for (int i=0; i<nomes.size();i++){
                //logica  lembando q o iterador pode mudar o nome 
                System.out.println(nomes.get(i));
                System.out.println(colecaoInteiros[i]);
            }
            
            //tem outra forma o for eache somente usaco com listas vetores etc
            for(String n: nomes){
                System.out.println(n);}
            
            
            //wile
            int o = 0;
            while(o<10){
                int n =1;
                System.out.println(n);
            n++;
            o++;
            }
    }
}
