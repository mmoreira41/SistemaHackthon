package model;

import java.time.LocalDateTime;

public class Apresentacao {
    private Projeto projeto;
    private Avaliavel banca; // interface
    private Sala local;
    private LocalDateTime dataHora;

    public Apresentacao(Projeto projeto, Avaliavel banca, Sala local, LocalDateTime dataHora) {
        this.projeto = projeto;
        this.banca = banca;
        this.local = local;
        this.dataHora = dataHora;
    }

    // O método 'avaliar' delega a responsabilidade para a banca
    public void avaliar() {
        System.out.println("Iniciando avaliação do projeto: " + projeto.getNome());
        banca.calcularNotaFinal();
        System.out.println("Avaliação finalizada. Nota: " + projeto.getNotaFinal());
    }

    public Projeto getProjeto() {
        return projeto;
    }
}