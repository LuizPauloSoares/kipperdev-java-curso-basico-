# ☕ Java — Core Logic and OOP Studies

[🇧🇷 Português](README.md) | [🇺🇸 English](README.en.md)

![Status](https://img.shields.io/badge/status-in%20progress-yellow)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![License](https://img.shields.io/badge/license-MIT-blue)

Repository with my **Java** studies, featuring commented examples of programming logic and Object-Oriented Programming (OOP).

---

## 📬 Contact

- 📧 Email: [luizdayspring@gmail.com](mailto:luizdayspring@gmail.com)
- 📸 Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- 💼 LinkedIn: [luiz-paulo-soares](https://www.linkedin.com/in/luiz-paulo-soares/)
- 🐙 GitHub: [LuizPauloSoares](https://github.com/LuizPauloSoares)

---

## 🛠️ Technologies

- Java (JDK 17+)
- NetBeans IDE
- Git and GitHub

---

## ⚙️ How it works

This is not a single application: each `.java` file is an **independent study topic**, with its own `main()` and comments explaining the concept. Just run the file for the topic you want.

---

## 💡 What the code does

| File | Content |
|---|---|
| `KipperCursoBasico.java` | Basics: JVM, bytecode, compilation (`javac`), strong typing |
| `Variaveis.java` | Primitive types, `String`, `var`, value ranges and defaults |
| `Casting.java` | Type conversion (`(int)`, `(double)`, `Integer.parseInt`) |
| `Condicionais.java` | `if`, `else if`, `else`, `equals()`, `isBlank()` |
| `Loops.java` | `for`, `for each`, `while` |
| `Vetores.java` | Arrays and `ArrayList` (add, remove, get) |
| `Relogio.java` | `static` vs. instance attributes and methods |
| `Pessoa.java` | Classes, attributes, constructor, methods, inheritance |
| `SerVivo.java` | Abstract class |
| `Carro.java` | Interface (contract) |
| `Fusca.java` | Interface implementation with `@Override` |
| `Main.java` | Entry point of the `javaintroducao` package |

---

## 🗂️ Data structures

- **Arrays** (`int[]`, `String[]`): fixed size
- **`ArrayList<String>`**: dynamic list
- **Objects**: `Pessoa` with `idade` (age), `nome` (name) and `altura` (height)

---

## 📁 Project structure

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

## 📋 Prerequisites

- [JDK 17 or higher](https://adoptium.net/)
- An IDE (NetBeans, IntelliJ, Eclipse) or just a terminal
- [Git](https://git-scm.com/)

Check your installation:

```bash
java -version
javac -version
git --version
```

---

## 📥 How to clone

```bash
git clone https://github.com/LuizPauloSoares/REPOSITORY-NAME.git
cd REPOSITORY-NAME
```

---

## 🚀 Installation and setup

1. Clone the repository (step above).
2. Open the folder in your IDE **or** use the terminal.
3. Compile from the `src` folder:
   ```bash
   cd src
   javac logicaBasica/Poo/Pessoa.java logicaBasica/Poo/SerVivo.java
   ```
4. Run:
   ```bash
   java logicaBasica.Poo.Pessoa
   ```

> Any file with a `main()` runs the same way: `java package.ClassName`.

---

## 🖼️ Usage examples

```java
Pessoa p1 = new Pessoa(21, "luiz", 1.80);
p1.exibirInfo();
p1.dormir();
p1.respirar();
```

Output:

```
meu nome e luiz tenho 21 anos e ja tenho 1.8 de altura
dormindo
respirando
```

📷 *Screenshots: add here (`docs/screenshot1.png`).*

---

## 📌 Project status

🚧 **In progress** — new topics are added as my studies advance.

---

## 🗺️ Roadmap / Next steps

- [ ] Exception handling (`try/catch`)
- [ ] Collections (`HashMap`, `HashSet`)
- [ ] Encapsulation (getters/setters)
- [ ] Polymorphism with practical examples
- [ ] File handling
- [ ] Database integration (JDBC)

---

## 📄 License

Distributed under the **MIT** license. See the `LICENSE` file for details.

---

## 👨‍💻 Author / Credits

**Luiz Paulo Soares**
Studies based on the Kipper basic Java course and technical course classes.
