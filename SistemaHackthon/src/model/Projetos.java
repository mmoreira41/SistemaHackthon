package model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Projetos {
    private static Projetos instance;
    private List<Projeto> projetos;

    private Projetos() {
        projetos = new ArrayList<>();
    }

    public static Projetos getInstance() {
        if (instance == null) {
            instance = new Projetos();
        }
        return instance;
    }

    public void adicionar(Projeto projeto) {
        this.projetos.add(projeto);
    }

    public List<Projeto> getTodos() {
        return this.projetos;
    }

    public List<Projeto> getProjetosAprovados() {
        return this.projetos.stream()
                .filter(p -> p.getNotaFinal() >= 7.0)
                .collect(Collectors.toList());
    }
}