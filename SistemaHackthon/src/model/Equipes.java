package model;

import java.util.ArrayList;
import java.util.List;

public class Equipes {
    private static Equipes instance;
    private List<Equipe> equipes;

    private Equipes() {
        equipes = new ArrayList<>();
    }

    public static Equipes getInstance() {
        if (instance == null) {
            instance = new Equipes();
        }
        return instance;
    }

    public void adicionar(Equipe equipe) {
        this.equipes.add(equipe);
    }

    public List<Equipe> getTodas() {
        return this.equipes;
    }
}