package controller;

import model.Projeto;

public class Apresentacao {
    private Projeto projeto;

    public Apresentacao(Projeto projeto) {
        this.projeto = projeto;
    }

    public double calcularNotaFinal() {
        return projeto.getBanca().calcularNotaFinal();
    }
}
