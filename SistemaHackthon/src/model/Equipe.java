package model;

import java.util.ArrayList;
import java.util.List;

public class Equipe {
    private String nome;
    private List<Estudante> membros;
    private Projeto projeto;

    public Equipe(String nome) {
        this.nome = nome;
        this.membros = new ArrayList<>();
    }

    // MÉTODO QUE FALTAVA - ADICIONE ESTE BLOCO
    public String getNome() {
        return this.nome;
    }

    public void adicionarMembro(Estudante aluno) {
        this.membros.add(aluno);
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Projeto getProjeto() {
        return this.projeto;
    }

    public List<Estudante> getMembros() {
        return this.membros;
    }
}