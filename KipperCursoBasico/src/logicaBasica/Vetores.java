//sao estruturas de dados que guardamos uma coleçao de dados que guardamos varios valores do mesmo tipo
package logicaBasica;

import java.util.ArrayList;


public class Vetores {

    
    public static void main(String[] args) {
        //tipo [] nome = new tipo [qntvalor]
        String [] dias = new String[10];
        dias[0] = "segunda";//adicionando valor 
        
            //tipo [] nomeArray  = {valores}
    int [] colecaoInteiros = {1,2,3,4,5,6};//ja iniciando com valores com tamanho fixo vc nao pode incrementar mais valores
   //vc pode criar array de qualquer tipo 
   
   //array list e uma classe no java que permite uma lista dinamica permine colocar e retirar valores
   ArrayList<String> nomes = new ArrayList<>();//cria uma lista dinamica chamda nome
   nomes.add("luiz"); //add e um metodo dessa classe pra adicionar nomes podendo adicionar quantos quiser 
   nomes.add("paulo");
   nomes.remove(0);//remove por indice 
    nomes.remove("paulo");//remove por valor 
   
   
    
        System.out.println(colecaoInteiros[0]);//emprimindo o valor um por que indices sempre começa com 0
        System.out.println(colecaoInteiros.length);//ve a quantidade de valores 
        System.out.println(nomes.get(0));//para buscar em array list 
        
    }
}
