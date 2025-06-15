package controller;

import model.Jurado;

import java.util.List;
import java.util.ArrayList;

public class Banca {
    private List<Jurado> jurados;

    public Banca(List<Jurado> jurados) {
        this.jurados = new ArrayList<>(jurados); 
    }

    public double calcularNotaFinal() {
        double totalNotas = 0;
        for (Jurado jurado : jurados) {
            totalNotas += jurado.avaliarProjeto();
        }
        return totalNotas / jurados.size();
    }
}

