# SISTEMA HACKTHON

## Visão Geral

Este projeto foi desenvolvido para gerenciar e avaliar projetos de estudantes, incorporando diferentes aspectos como equipes, apresentações, jurados e avaliações. Ele oferece um sistema onde as equipes de estudantes podem ser designadas a projetos, e os jurados podem avaliar esses projetos com base em critérios específicos. O sistema armazena informações sobre pessoas (por exemplo, estudantes, profissionais, jurados) e suas interações com os projetos.


## UML
![UML-SISTEMA](https://github.com/user-attachments/assets/7479f74d-2f02-4ec5-b180-a6be02b9293b)



## Estrutura do Projeto

### `src/`

Este é o diretório principal do código-fonte, contendo todas as classes do projeto.

- **`app/`**
  - `Main.java`: O ponto de entrada da aplicação, onde a lógica principal para rodar o sistema está localizada.

- **`controller/`**
  - `Apresentacao.java`: Gerencia a lógica para gerenciar as apresentações.
  - `Banca.java`: Gerencia o júri (Banca) responsável pela avaliação dos projetos.

- **`model/`**
  - `Empresa.java`: Representa uma organização ou empresa no sistema.
  - `Equipe.java`: Representa uma equipe de estudantes trabalhando em um projeto.
  - `Estudante.java`: Representa um estudante individual.
  - `Instituicao.java`: Representa uma instituição educacional.
  - `Jurado.java`: Representa um jurado responsável pela avaliação dos projetos dos estudantes.
  - `Pessoa.java`: Representa uma pessoa, provavelmente uma classe base para `Estudante`, `Jurado` e `Profissional`.
  - `Profissional.java`: Representa um profissional, possivelmente um tipo especializado de pessoa.
  - `Projeto.java`: Representa um projeto de estudante.
  - `Sala.java`: Representa uma sala, provavelmente onde as apresentações acontecem.
  - `Universidade.java`: Representa uma universidade, o contexto onde os projetos e estudantes são avaliados.

## Configuração e Uso

1. **Clone o Repositório**:
   Clone este repositório para a sua máquina local utilizando:
   ```bash
   https://github.com/mmoreira41/SistemaHackthon/tree/main/SistemaHackthon
