/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fieb;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Diretor {
    private String nome;
    private String cpf;
    private int nivel;
    private ArrayList<Filme> filmes;
    
    public Diretor(){
        filmes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Filme> getFilmes() {
        return this.filmes;
    }

    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    public void setFilme(Filme filme){
        this.filmes.add(filme);
    }
}
