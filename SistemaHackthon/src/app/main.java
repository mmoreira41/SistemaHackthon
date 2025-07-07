package app;

import model.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Sistema de Gerenciamento de Hackathons Universitários ---");

        Universidade puc = new Universidade("PUC Minas");
        Empresa google = new Empresa("Google");

        System.out.println("\n1. Criando equipes e alunos...");
        Equipe equipe1 = new Equipe("DevMinas");
        Equipe equipe2 = new Equipe("TechCoders");

        for (int i = 1; i <= 5; i++) {
            Estudante aluno1 = new Estudante("Aluno " + i, puc, "MAT" + i, "Engenharia de Software");
            equipe1.adicionarMembro(aluno1);

            Estudante aluno2 = new Estudante("Aluno " + (i + 5), puc, "MAT" + (i + 5), "Ciência da Computação");
            equipe2.adicionarMembro(aluno2);
        }

        // Adicionando as equipes à coleção Singleton
        Equipes.getInstance().adicionar(equipe1);
        Equipes.getInstance().adicionar(equipe2);
        System.out.println("Equipes criadas: " + equipe1.getNome() + " e " + equipe2.getNome());

        System.out.println("\n2. Criando e atribuindo projetos...");
        Profissional orientador1 = new Profissional("Prof. Daniel", puc, "Programação Modular");
        Profissional orientador2 = new Profissional("Prof. Ana", puc, "Inteligência Artificial");

        Projeto projeto1 = new Projeto("Sistema de Gerenciamento", orientador1);
        Projeto projeto2 = new Projeto("App de Saúde Mental", orientador2);

        // Associando projetos e equipes
        projeto1.setEquipe(equipe1);
        equipe1.setProjeto(projeto1);

        projeto2.setEquipe(equipe2);
        equipe2.setProjeto(projeto2);

        // Adicionando os projetos à coleção Singleton
        Projetos.getInstance().adicionar(projeto1);
        Projetos.getInstance().adicionar(projeto2);
        System.out.println("Projeto '" + projeto1.getNome() + "' atribuído à equipe " + equipe1.getNome());
        System.out.println("Projeto '" + projeto2.getNome() + "' atribuído à equipe " + equipe2.getNome());

        System.out.println("\n3. Montando as bancas avaliadoras...");
        Banca banca1 = new Banca(projeto1);
        Banca banca2 = new Banca(projeto2);
        Random random = new Random();

        for (int i = 1; i <= 4; i++) {
            // Criando jurados de instituições diferentes
            Jurado juradoPuc = new Jurado("Jurado " + i, puc, "Tecnologia");
            Jurado juradoGoogle = new Jurado("Jurado " + (i + 4), google, "Inovação");

            // Adicionando jurados e notas aleatórias (0 a 10) às bancas
            banca1.adicionarJurado(juradoPuc, random.nextInt(11));
            banca2.adicionarJurado(juradoGoogle, random.nextInt(11));
        }
        System.out.println("Bancas criadas e jurados adicionados.");

        System.out.println("\n4. Realizando as apresentações e avaliações...");
        Sala sala1 = new Sala("301", "Prédio 3");
        Sala sala2 = new Sala("Auditório", "Prédio 1");

        // Criando as apresentações
        Apresentacao ap1 = new Apresentacao(projeto1, banca1, sala1, LocalDateTime.now());
        Apresentacao ap2 = new Apresentacao(projeto2, banca2, sala2, LocalDateTime.now().plusHours(1));

        // Adicionando as apresentações à coleção Singleton
        Apresentacoes.getInstance().adicionar(ap1);
        Apresentacoes.getInstance().adicionar(ap2);

        ap1.avaliar();
        ap2.avaliar();

        System.out.println("\n5. Listando projetos aprovados (Nota Final >= 7):");

        List<Projeto> todosOsProjetos = Projetos.getInstance().getTodos();

        List<Projeto> projetosAprovados = todosOsProjetos.stream()
                .filter(p -> p.getNotaFinal() >= 7.0)
                .collect(Collectors.toList());

        if (projetosAprovados.isEmpty()) {
            System.out.println("Nenhum projeto foi aprovado.");
        } else {
            projetosAprovados.forEach(p -> System.out.printf("- Projeto: %s | Equipe: %s | Nota Final: %.2f\n",
                    p.getNome(), p.getEquipe().getNome(), p.getNotaFinal()));
        }
    }
}