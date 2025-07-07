# Sistema de Gerenciamento de Hackathon

## Visão Geral

Este projeto, desenvolvido para a disciplina de Programação Modular, implementa um sistema em Java para gerenciar as atividades de um Hackathon Universitário. O sistema modela e gerencia entidades como Equipes, Projetos, Apresentações e Bancas Avaliadoras, culminando no cálculo da nota final dos projetos e na listagem dos aprovados.

A arquitetura segue os princípios de Orientação a Objetos, utilizando herança, interfaces e padrões de projeto como o Singleton para garantir um código coeso, organizado e de fácil manutenção.

## UML

O diagrama abaixo representa a arquitetura final do sistema, com todas as classes, atributos, métodos e relacionamentos implementados.
![NovoDiagramaUML](https://github.com/user-attachments/assets/4b0f8588-dd05-4783-af3a-98a5d2de63aa)



## Estrutura do Projeto

O código-fonte está organizado nos seguintes pacotes e classes:

### `src/`

-   **`app/`**
    -   `Main.java`: Ponto de entrada da aplicação. Contém o fluxo de execução que simula a criação de equipes, projetos, avaliações e a listagem dos resultados.

-   **`model/`**
    -   `Apresentacao.java`: Modela o evento de apresentação de um projeto.
    -   `Apresentacoes.java`: Coleção Singleton para gerenciar todos os objetos `Apresentacao`.
    -   `Avaliavel.java`: Interface que define o contrato para entidades que podem realizar avaliações.
    -   `Banca.java`: Representa a banca de jurados que implementa a avaliação de um projeto.
    -   `Empresa.java`: Modela uma organização/empresa (herda de `Instituicao`).
    -   `Equipe.java`: Representa uma equipe de estudantes.
    -   `Equipes.java`: Coleção Singleton para gerenciar todos os objetos `Equipe`.
    -   `Estudante.java`: Modela um estudante (herda de `Pessoa`).
    -   `Instituicao.java`: Classe base para representar uma instituição.
    -   `Jurado.java`: Modela um jurado (herda de `Profissional`).
    -   `Pessoa.java`: Classe base abstrata para todos os tipos de pessoas no sistema.
    -   `Profissional.java`: Modela um profissional (herda de `Pessoa`).
    -   `Projeto.java`: Representa um projeto a ser desenvolvido e avaliado.
    -   `Projetos.java`: Coleção Singleton para gerenciar todos os objetos `Projeto`.
    -   `Sala.java`: Representa uma sala física onde ocorrem as apresentações.
    -   `Universidade.java`: Modela uma universidade (herda de `Instituicao`).

## Funcionalidades Implementadas
- **Modelagem Orientada a Objetos:** Utilização de herança, abstração e polimorfismo para criar um modelo coeso e desacoplado, conforme o diagrama UML proposto.
- **Padrão de Projeto Singleton:** As classes de coleção (`Projetos`, `Equipes`, `Apresentacoes`) garantem uma instância única, centralizando o controle dos dados em memória.
- **Java Stream API:** A listagem de projetos aprovados é feita de forma funcional e eficiente utilizando `stream().filter()`.

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
