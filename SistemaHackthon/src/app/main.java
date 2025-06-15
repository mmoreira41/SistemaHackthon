package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import controller.*;
import model.*;

public class Main {
    public static void main(String[] args) {
        // Criar 2 equipes com 5 alunos cada
        Equipe equipe1 = new Equipe("Equipe 1");
        Equipe equipe2 = new Equipe("Equipe 2");

        // Adicionar alunos (estudantes) às equipes
        for (int i = 1; i <= 5; i++) {
            Estudante aluno1 = new Estudante("Aluno" + i);
            equipe1.adicionarMembro(aluno1);
            System.out.println("Equipe 1 adicionou: " + aluno1.getNome());  // Exibe os alunos da equipe 1

            Estudante aluno2 = new Estudante("Aluno" + (i + 5));
            equipe2.adicionarMembro(aluno2);
            System.out.println("Equipe 2 adicionou: " + aluno2.getNome());  // Exibe os alunos da equipe 2
        }

        // Criar projetos diferentes para cada equipe
        Projeto projeto1 = new Projeto("Projeto 1");
        Projeto projeto2 = new Projeto("Projeto 2");

       
            List<Jurado> juradosEquipe1 = new ArrayList<>();
            List<Jurado> juradosEquipe2 = new ArrayList<>();
            for (int i = 1; i <= 4; i++) {
                Jurado jurado1 = new Jurado("Jurado " + i);
                juradosEquipe1.add(jurado1);
                System.out.println("Banca 1: " + jurado1.getNome());  // Exibe os jurados da banca 1

                Jurado jurado2 = new Jurado("Jurado " + (i + 4));
                juradosEquipe2.add(jurado2);
                System.out.println("Banca 2: " + jurado2.getNome());  // Exibe os jurados da banca 2
            }


        Banca banca1 = new Banca(juradosEquipe1);
        Banca banca2 = new Banca(juradosEquipe2);

        projeto1.setBanca(banca1);
        projeto2.setBanca(banca2);

        // Associar projetos às equipes
        equipe1.setProjeto(projeto1);
        equipe2.setProjeto(projeto2);

        // Exibir os projetos associados às equipes
        System.out.println("Equipe 1 está trabalhando no projeto: " + equipe1.getProjeto().getNome());
        System.out.println("Equipe 2 está trabalhando no projeto: " + equipe2.getProjeto().getNome());

        // Criar apresentações e calcular as notas finais
        Apresentacao apresentacao1 = new Apresentacao(projeto1);
        Apresentacao apresentacao2 = new Apresentacao(projeto2);

        double notaFinal1 = apresentacao1.calcularNotaFinal();
        double notaFinal2 = apresentacao2.calcularNotaFinal();

        // Exibir as notas finais de cada projeto
        System.out.println("Nota final do " + projeto1.getNome() + ": " + notaFinal1);
        System.out.println("Nota final do " + projeto2.getNome() + ": " + notaFinal2);

        // Listar projetos com nota final >= 7 usando stream
        List<Projeto> projetosAprovados = new ArrayList<>();
        if (notaFinal1 >= 7) projetosAprovados.add(projeto1);
        if (notaFinal2 >= 7) projetosAprovados.add(projeto2);

        // Exibir os projetos aprovados
        System.out.println("\nProjetos aprovados:");
        projetosAprovados.forEach(projeto -> System.out.println("Nome do Projeto: " + projeto.getNome()));
    }
}
