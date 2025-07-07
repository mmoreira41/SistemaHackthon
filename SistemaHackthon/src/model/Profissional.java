package model;

public class Profissional extends Pessoa {
    private String area;

    public Profissional(String nome, Instituicao instituicao, String area) {
        super(nome, instituicao);
        this.area = area;
    }

    public String getArea() {
        return area;
    }
}