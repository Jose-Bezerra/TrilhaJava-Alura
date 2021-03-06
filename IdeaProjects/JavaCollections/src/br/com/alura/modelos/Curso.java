package br.com.alura.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    String nome;
    String instrutor;
    List<Aula> aulas = new ArrayList<>();

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }


    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas); //devolve uma cópia, read only
    }

    public void adiciona (Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal( ){
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }

    @Override
    public String toString() {
        return "[ Curso: " +
                nome +
                ", tempo total = " + this.getTempoTotal() +
                ", aulas = " + aulas +
                " ]";
    }
}
