
package logicaBasica;
//sao condiçoes para o codigo ter varios caminhos

public class Condicionais {
    

    
    public static void main(String[] args) {
        //condicional sempre em metodos(main) ele sempre verifica em bytecode 1 ou 0 sempre se e vdd ou nao 
        //se (condiçao logica){açao}
        
            byte idade = 25;
    short ano = 2026;
    int quantidade = 150000;
    long populacao = 8000000000L;
    float altura = 1.75f;
    double preco = 19.99;
    char letra = 'A';
    boolean ativo = true;
    String nome = "Luiz";
    
        if(ativo){//verifica se strings sao iguais mas nao pode verificar se variaveis de tipos diferentes sao iguais
            System.out.println("verdadeiro");}
        else
            {System.out.println("falso");}
        
        
        if(nome.equals("Luiz")){//outro metodo pra ver se variavies sao iguais 
            System.out.println("verdadeiro");}
        else
            {System.out.println("falso");}
        
                if(nome.isBlank()){//verifica se a String e vazia 
            System.out.println("verdadeiro");}
        else
            {System.out.println("falso");}
                
                
                
        if(nome.isBlank()){ 
            System.out.println("verdadeiro");}
        else if(nome.equals("Luiz"))//sintaxe else if
        {System.out.println("verdadeiro");}
        else
            {System.out.println("falso");}
                          
                
                
                
    }
    }
            
    

