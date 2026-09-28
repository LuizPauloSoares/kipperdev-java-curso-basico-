
package logicaBasica.Poo;

//nao pode ser instanciada
//mas diferente da da interface ele pode ter metodos descritos e atributos
//para uma classe utilizar temos que usar herança e polimorfismo

//herança uma classe filha herda metodos e atributos da classe pai 
public abstract class SerVivo {
    
    //abstrato metodo
    public abstract void respirar ();
    
    public void dormir(){
        System.out.println("dormindo ");}
}
