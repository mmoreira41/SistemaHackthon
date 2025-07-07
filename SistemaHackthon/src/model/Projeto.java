package model;

public class Projeto {
    private String nome;
    private Equipe equipe;
    private Profissional orientador;
    private double notaFinal;

    public Projeto(String nome, Profissional orientador) {
        this.nome = nome;
        this.orientador = orientador;
        this.notaFinal = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public Profissional getOrientador() {
        return orientador;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}