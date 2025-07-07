package model;

import java.util.HashMap;
import java.util.Map;

public class Banca implements Avaliavel {
    private Projeto projetoAvaliado;
    private Map<Jurado, Integer> jurados;

    public Banca(Projeto projetoAvaliado) {
        this.projetoAvaliado = projetoAvaliado;
        this.jurados = new HashMap<>();
    }

    public void adicionarJurado(Jurado jurado, int nota) {

        if (nota >= 0 && nota <= 10) {
            this.jurados.put(jurado, nota);
        } else {
            System.out.println("Nota inválida para o jurado " + jurado.getNome() + ". A nota deve ser entre 0 e 10.");
        }
    }

    @Override
    public void calcularNotaFinal() {
        if (jurados.isEmpty()) {
            projetoAvaliado.setNotaFinal(0);
            return;
        }

        // Calcula a média das notas dos jurados [cite: 11]
        double somaDasNotas = 0;
        for (Integer nota : jurados.values()) {
            somaDasNotas += nota;
        }

        double media = somaDasNotas / jurados.size();

        // Atribui a nota final ao projeto associado
        projetoAvaliado.setNotaFinal(media);
    }
}