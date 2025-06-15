package model;
import controller.Banca;

public class Projeto {
    private String nome;
    private Banca banca;

    public Projeto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;  // Método getter para o nome
    }

    public void setBanca(Banca banca) {
        this.banca = banca;
    }

    public Banca getBanca() {
        return this.banca;
    }
}


