
package logicaBasica;
/*
Atributo estático → pertence à classe, cópia única compartilhada, alterar em um objeto reflete em todos
Chamada sem instância → Classe.metodo() funciona sem new
Sem conexão com não-estáticos → um método/atributo static não pode acessar diretamente atributos/métodos 
de instância (não-estáticos), porque static não "sabe" qual objeto usar. Mas o objeto pode acessar o static
normalmente, porque todo objeto tem acesso ao que é da classe.
*/
class Relogio {
    static int contador = 0; // static

    int hora; // não-static (pertence ao objeto)

    static void metodoEstatico() {
        // contador++; ✅ pode
        // hora = 10;  ❌ erro! não sabe de qual objeto é "hora"
    }

    void metodoNormal() {
        contador++; // ✅ objeto pode alterar o static
        hora = 10;  // ✅ pode alterar o não-static dele mesmo
    }
}
