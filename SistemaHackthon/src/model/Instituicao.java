package model;

public class Instituicao {
    private String nome;
    private String localizacao;

    public Instituicao(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }
}
