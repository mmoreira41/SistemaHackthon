package model;

public class Estudante extends Pessoa {
    private String matricula;
    private String curso;

    public Estudante(String nome, Instituicao instituicao, String matricula, String curso) {
        super(nome, instituicao);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }
}