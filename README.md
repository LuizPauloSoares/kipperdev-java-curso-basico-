# ☕ Java — Estudos de Lógica Básica e POO

[🇧🇷 Português](README.md) | [🇺🇸 English](README.en.md)

![Status](https://img.shields.io/badge/status-em%20andamento-yellow)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![License](https://img.shields.io/badge/license-MIT-blue)

Repositório com meus estudos de **Java**, com exemplos comentados de lógica de programação e Programação Orientada a Objetos (POO).

---

## 📬 Contato

- 📧 Email: [luizdayspring@gmail.com](mailto:luizdayspring@gmail.com)
- 📸 Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- 💼 LinkedIn: [luiz-paulo-soares](https://www.linkedin.com/in/luiz-paulo-soares/)
- 🐙 GitHub: [LuizPauloSoares](https://github.com/LuizPauloSoares)

---

## 🛠️ Tecnologias utilizadas

- Java (JDK 17+)
- NetBeans IDE
- Git e GitHub

---

## ⚙️ Como o sistema funciona

Não é uma aplicação única: cada arquivo `.java` é um **tópico de estudo independente**, com um `main()` próprio e comentários explicando o conceito. Basta executar o arquivo do tópico desejado.

---

## 💡 O que o código faz

| Arquivo | Conteúdo |
|---|---|
| `KipperCursoBasico.java` | Conceitos iniciais: JVM, bytecode, compilação (`javac`), tipagem forte |
| `Variaveis.java` | Tipos primitivos, `String`, `var`, faixas de valores e valores padrão |
| `Casting.java` | Conversão de tipos (`(int)`, `(double)`, `Integer.parseInt`) |
| `Condicionais.java` | `if`, `else if`, `else`, `equals()`, `isBlank()` |
| `Loops.java` | `for`, `for each`, `while` |
| `Vetores.java` | Arrays e `ArrayList` (adicionar, remover, buscar) |
| `Relogio.java` | Atributos e métodos `static` vs. de instância |
| `Pessoa.java` | Classes, atributos, construtor, métodos, herança |
| `SerVivo.java` | Classe abstrata |
| `Carro.java` | Interface (contrato) |
| `Fusca.java` | Implementação de interface com `@Override` |
| `Main.java` | Ponto de entrada do pacote `javaintroducao` |

---

## 🗂️ Estrutura de dados

- **Arrays** (`int[]`, `String[]`): tamanho fixo
- **`ArrayList<String>`**: lista dinâmica
- **Objetos**: `Pessoa` com `idade`, `nome` e `altura`

---

## 📁 Estrutura do projeto

```
src/
├── javaintroducao/
│   └── Main.java
└── logicaBasica/
    ├── KipperCursoBasico.java
    ├── Variaveis.java
    ├── Casting.java
    ├── Condicionais.java
    ├── Loops.java
    ├── Vetores.java
    ├── Relogio.java
    └── Poo/
        ├── SerVivo.java
        ├── Pessoa.java
        ├── Carro.java
        └── Fusca.java
```

---

## 📋 Pré-requisitos

- [JDK 17 ou superior](https://adoptium.net/)
- Uma IDE (NetBeans, IntelliJ, Eclipse) ou apenas o terminal
- [Git](https://git-scm.com/)

Verifique a instalação:

```bash
java -version
javac -version
git --version
```

---

## 📥 Como clonar o projeto

```bash
git clone https://github.com/LuizPauloSoares/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
```

---

## 🚀 Instalação e configuração

1. Clone o repositório (passo acima).
2. Abra a pasta na sua IDE **ou** use o terminal.
3. Compile a partir da pasta `src`:
   ```bash
   cd src
   javac logicaBasica/Poo/Pessoa.java logicaBasica/Poo/SerVivo.java
   ```
4. Execute:
   ```bash
   java logicaBasica.Poo.Pessoa
   ```

> Cada arquivo com `main()` roda do mesmo jeito: `java pacote.NomeDaClasse`.

---

## 🖼️ Exemplos de uso

```java
Pessoa p1 = new Pessoa(21, "luiz", 1.80);
p1.exibirInfo();
p1.dormir();
p1.respirar();
```

Saída:

```
meu nome e luiz tenho 21 anos e ja tenho 1.8 de altura
dormindo
respirando
```

📷 *Screenshots: adicione aqui (`docs/screenshot1.png`).*

---

## 📌 Status do projeto

🚧 **Em andamento** — novos tópicos são adicionados conforme avanço nos estudos.

---

## 🗺️ Roadmap / Próximos passos

- [ ] Tratamento de exceções (`try/catch`)
- [ ] Coleções (`HashMap`, `HashSet`)
- [ ] Encapsulamento (getters/setters)
- [ ] Polimorfismo com exemplos práticos
- [ ] Manipulação de arquivos
- [ ] Integração com banco de dados (JDBC)

---

## 📄 Licença

Distribuído sob a licença **MIT**. Veja o arquivo `LICENSE` para mais detalhes.

---

## 👨‍💻 Autor / Créditos

**Luiz Paulo Soares**
Estudos baseados no curso básico de Java (Kipper) e em aulas do curso técnico.
