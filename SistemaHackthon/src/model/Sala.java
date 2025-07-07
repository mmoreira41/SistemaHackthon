package model;

public class Sala {
    private String nome;
    private String bloco;

    public Sala(String nome, String bloco) {
        this.nome = nome;
        this.bloco = bloco;
    }

    public String getNome() {
        return nome;
    }

    public String getBloco() {
        return bloco;
    }

    @Override
    public String toString() {
        return "Sala " + nome + " (Bloco " + bloco + ")";
    }
}