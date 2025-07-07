# Sistema de Gerenciamento de Hackathon

## Visão Geral

[cite_start]Este projeto, desenvolvido para a disciplina de Programação Modular [cite: 1][cite_start], implementa um sistema em Java para gerenciar as atividades de um Hackathon Universitário[cite: 2]. [cite_start]O sistema modela e gerencia entidades como Equipes [cite: 3][cite_start], Projetos [cite: 3][cite_start], Apresentações [cite: 8] [cite_start]e Bancas Avaliadoras [cite: 11][cite_start], culminando no cálculo da nota final dos projetos [cite: 11] [cite_start]e na listagem dos aprovados[cite: 12].

[cite_start]A arquitetura segue os princípios de Orientação a Objetos, utilizando herança, interfaces e padrões de projeto como o Singleton [cite: 9] para garantir um código coeso, organizado e de fácil manutenção.

## UML

O diagrama abaixo representa a arquitetura final do sistema, com todas as classes, atributos, métodos e relacionamentos implementados.

![Diagrama UML Final](https://github.com/user-attachments/assets/fcf45e9a-7a4c-4235-862d-9eb58319f626)

## Estrutura do Projeto

O código-fonte está organizado nos seguintes pacotes e classes:

### `src/`

-   **`app/`**
    -   [cite_start]`Main.java`: Ponto de entrada da aplicação[cite: 10]. Contém o fluxo de execução que simula a criação de equipes, projetos, avaliações e a listagem dos resultados.

-   **`model/`**
    -   [cite_start]`Apresentacao.java`: Modela o evento de apresentação de um projeto[cite: 13].
    -   [cite_start]`Apresentacoes.java`: Coleção Singleton para gerenciar todos os objetos `Apresentacao`[cite: 8].
    -   [cite_start]`Avaliavel.java`: Interface que define o contrato para entidades que podem realizar avaliações[cite: 13].
    -   [cite_start]`Banca.java`: Representa a banca de jurados que implementa a avaliação de um projeto[cite: 13].
    -   [cite_start]`Empresa.java`: Modela uma organização/empresa (herda de `Instituicao`)[cite: 13].
    -   [cite_start]`Equipe.java`: Representa uma equipe de estudantes[cite: 13].
    -   [cite_start]`Equipes.java`: Coleção Singleton para gerenciar todos os objetos `Equipe`[cite: 8].
    -   [cite_start]`Estudante.java`: Modela um estudante (herda de `Pessoa`)[cite: 13].
    -   [cite_start]`Instituicao.java`: Classe base para representar uma instituição[cite: 13].
    -   [cite_start]`Jurado.java`: Modela um jurado (herda de `Profissional`)[cite: 13].
    -   [cite_start]`Pessoa.java`: Classe base abstrata para todos os tipos de pessoas no sistema[cite: 13].
    -   [cite_start]`Profissional.java`: Modela um profissional (herda de `Pessoa`)[cite: 13].
    -   [cite_start]`Projeto.java`: Representa um projeto a ser desenvolvido e avaliado[cite: 13].
    -   [cite_start]`Projetos.java`: Coleção Singleton para gerenciar todos os objetos `Projeto`[cite: 7].
    -   [cite_start]`Sala.java`: Representa uma sala física onde ocorrem as apresentações[cite: 13].
    -   [cite_start]`Universidade.java`: Modela uma universidade (herda de `Instituicao`)[cite: 13].

## Funcionalidades Implementadas
- [cite_start]**Modelagem Orientada a Objetos:** Utilização de herança, abstração e polimorfismo para criar um modelo coeso e desacoplado, conforme o diagrama UML proposto[cite: 3, 4].
- [cite_start]**Padrão de Projeto Singleton:** As classes de coleção (`Projetos`, `Equipes`, `Apresentacoes`) garantem uma instância única, centralizando o controle dos dados em memória[cite: 9].
- [cite_start]**Java Stream API:** A listagem de projetos aprovados é feita de forma funcional e eficiente utilizando `stream().filter()`[cite: 12].

## Configuração e Execução

### Pré-requisitos
- JDK (Java Development Kit) 11 ou superior instalado e configurado.

### Passos

1.  **Clone o Repositório**:
    Clone este repositório para a sua máquina local.
    ```bash
    git clone [https://github.com/mmoreira41/SistemaHackthon.git](https://github.com/mmoreira41/SistemaHackthon.git)
    ```

2.  **Navegue até o Diretório**:
    ```bash
    cd SistemaHackthon
    ```

3.  **Compile o Projeto**:
    Navegue até o diretório `src` e execute o comando de compilação.
    ```bash
    javac app/Main.java model/*.java
    ```

4.  **Execute a Aplicação**:
    Ainda no diretório `src`, execute a classe principal.
    ```bash
    java app.Main
    ```
