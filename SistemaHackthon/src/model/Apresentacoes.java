package model;

import java.util.ArrayList;
import java.util.List;

public class Apresentacoes {
    private static Apresentacoes instance;
    private List<Apresentacao> apresentacoes;

    private Apresentacoes() {
        apresentacoes = new ArrayList<>();
    }

    public static Apresentacoes getInstance() {
        if (instance == null) {
            instance = new Apresentacoes();
        }
        return instance;
    }

    public void adicionar(Apresentacao apresentacao) {
        this.apresentacoes.add(apresentacao);
    }

    public List<Apresentacao> getTodas() {
        return this.apresentacoes;
    }
}