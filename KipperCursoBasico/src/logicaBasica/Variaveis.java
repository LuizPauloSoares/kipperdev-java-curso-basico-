
package logicaBasica;


public class Variaveis {
    /*variavel e um espaço que o computador guarda na memoria para ser utilizado posteriormente 
      vc nao consegue converter um valor automaticamente 
  
    tipos de variaveis
        inteiros        cada um tem uma faixa de representaçao na memoria 
            byte — 8 bits (1 byte) — de -128 até 127 — padrão: 0
            short — 16 bits (2 bytes) — de -32.768 até 32.767 — padrão: 0
            int — 32 bits (4 bytes) — de -2.147.483.648 até 2.147.483.647 — padrão: 0
            long — 64 bits (8 bytes) — de -9.223.372.036.854.775.808 até 9.223.372.036.854.775.807 — padrão: 0L

        ponto flutuante     cada um tem uma faixa de representaçao na memoria 
            float — 32 bits (4 bytes) — de ~1,4E-45 até ~3,4028235E38 — padrão: 0.0f  ponto flutuante 
            double — 64 bits (8 bytes) — de ~4,9E-324 até ~1,7976931348623157E308 — padrão: 0.0d ponto flutuante com mais precisao
        caracteres
            char — 16 bits (2 bytes) — de 0 (\u0000) até 65.535 (\uffff) — padrão: \u0000 representa um unico caractere e utilizando aspas simples
            String (não primitivo, é referência) — não tem valor mínimo/máximo, padrão: null ele nao e tipo primitivo e uma classe
    
    boleanos
            boolean — não tem tamanho fixo definido (geralmente 1 byte na prática) — só true ou false — padrão: false
    
    vars
        voce pode declarar uma variavel tipo var e a jvm identifica altomaticamente o tipo de dado 
    
    sintaxe 
        tipo nomeVariavel = valo;
    */
    
        byte idade = 25;
        short ano = 2026;
        int quantidade = 150000;
        long populacao = 8000000000L;//definido com L no final
        float altura = 1.75f;//definido com F no final
        double preco = 19.99;
        char letra = 'A';
        boolean ativo = true;
        String nome = "Luiz";//e uma classe criada pra criar strings nao e um tipo primitivo
       
    
        //metodo static pertence a classe e nao a instancia do objeto 
    public static void main(String[] args) {
       var sobrenome = "paulo";//vc e obrigatoriamente coloca um tipo 
       //o formato de declaraçao var so funciona dentro de um metodo 
       //o java infere automaticamente pra ele 
        
    }
    
}
