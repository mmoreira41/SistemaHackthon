package model;

public class Jurado {
    private String nome;

    public Jurado(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public double avaliarProjeto() {
        return Math.random() * 10; 
    }
}
