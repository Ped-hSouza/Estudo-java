# 🚀 Minha Jornada de Aprendizado em Java

Este repositório guarda a minha evolução no aprendizado da linguagem Java, saindo da base lógica até conceitos avançados de Orientação a Objetos.

## 📌 Marco 1: Fundamentos da Linguagem (Desafio Sistema de Notas)
Neste projeto prático, desenvolvi um sistema dinâmico para cálculo de médias, consolidando a base de como a máquina processa e armazena dados.

**O que aprendi e apliquei:**
* **Tipos de Dados e Variáveis:** Gerenciamento de memória com tipos primitivos (`int`, `double`).
* **Entrada de Dados (Input):** Utilização da classe `Scanner` para tornar o programa interativo e capturar dados do teclado.
* **Estruturas de Repetição:** Uso do laço `for` aliado a variáveis acumuladoras (`+=`) para processar múltiplas notas de forma dinâmica.
* **Estruturas de Decisão:** Controle de fluxo com `if/else` para aplicar regras de negócio (Aprovado/Reprovado).
* **Formatação de Saída (Output):** Domínio do método `System.out.printf` para formatar casas decimais (`%.2f`) e melhorar a experiência do usuário.

---

## 📌 Marco 2: Orientação a Objetos (Desafio Gestão Salarial)
Neste projeto, refatorei a forma de pensar o código, deixando de lado "scripts sequenciais" para projetar uma arquitetura de software modular usando o paradigma da Orientação a Objetos.

**O que aprendi e apliquei (Os 4 Pilares da OO):**
* **Abstração:** Criação da classe `Funcionario` como `abstract`, garantindo que ela sirva apenas como um "contrato" e não possa ser instanciada diretamente.
* **Encapsulamento:** Proteção do estado dos objetos usando modificadores de acesso (`protected` e `private`), liberando a leitura apenas através de métodos *Getters*.
* **Herança:** Utilização do `extends` para criar as classes filhas `Gerente` e `Desenvolvedor`, herdando características da classe mãe e utilizando o método `super()` nos construtores.
* **Polimorfismo:** Uso da anotação `@Override` para sobrescrever o método `calcularSalario()` de formas diferentes para cada cargo. Além disso, gerenciei objetos de tipos diferentes dentro de uma mesma `ArrayList<Funcionario>`, permitindo que o Java decida dinamicamente qual comportamento executar.
