//classes sao moldes para a criaçao de um objeto ele e um paradigma 
//tudo que tem atributos(caracteristicas) metodos(açoes)

package logicaBasica.Poo;
//pacotes serve pra organizaçao organizando o codigo  estrutura de diretorios e pastas



/*modificadores de acesso ele controla a visibilidade das classe e metodos
public              ele e acessado de qualquer lugar (em diferentes pacotes) acessado de qualquer lugar
private             ele e acessado somente no mesmo pacote 
default             java ele deixa altomaticamente como private so e acessado pelo mesmo pacote mas caso estiver fora ele nao e acessado
protected           so ve o mesmo pacote  so e acessado pela propria classe e pelas subclasses

atributos private e default so e acessado pela propria classe

*/
//quando vc herda vc deve obrigatoriamente herdar um metodo abstrato 
public class Pessoa extends SerVivo {
    
    
//public class e a classe principal do projeto
//sempre com primeira letra maiuscula 

    //atributos valores e caracteristicas
    int idade;
    String nome;
    double altura;
    
    //construtor ele  um metodo especial sempre que um objero e criado ele serve pra atribuir valores inicias
    //mesmo nome da classe vc pode ter mais construtores isso se chama sobrecarga de metodo
    //cada construtor com diferentes parametros
    public Pessoa(int idade,String nome, double altura ){
        this.idade = idade;
        this.nome = nome;
        this.altura = altura;
    }
    
    //metodos sao açoes do objeto
    //modificador de acesso retorno nome(parametros){logica}
    public void exibirInfo(){
        System.out.println("meu nome e " +nome+ " tenho " +idade+ " anos e ja tenho " +altura+ " de altura");}
    
        @Override
    public void respirar() {
        System.out.println("respirando");
    }
    
    @Override
    public void dormir(){
        System.out.println("dormindo ");}

    public static void main(String[] args) {
        //uma instancia um objeto da classe carro 
        //podemos definir valores ja no metodo construtor
        Pessoa p1 = new Pessoa(21, "luiz", 1.80);
        
        p1.exibirInfo();
        p1.dormir();
        p1.respirar();
        
    }


}

