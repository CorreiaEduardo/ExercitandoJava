/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentomoradia;

import java.util.ArrayList;

/**
 *
 * @author Edu
 */
public class Edificio {
    private String cor;
    private ArrayList<String> nomesAndares = new ArrayList<>();
    private ArrayList<Porta> portas = new ArrayList<>();
    
    public void pinta(String cor) {
        this.cor = cor;
    }
    
    public int quantasPortasEstaoAbertas(){
        int cont = 0;
        for (Porta node:this.portas) {
            if (node.estaAberta() == true) {
                cont++;
            }
        }
        return cont;
    }

    public int totalDePortas() {
        return this.portas.size();
    }

    public void cadastraPorta(Porta p) {
        this.portas.add(p);
    }
    
    public ArrayList<Porta> getPortas(){
        return portas;
    }
    
    public void adicionarAndar(String nome){
        this.nomesAndares.add(nome);
    }
    
    public int totalDeAndares() {
        return this.nomesAndares.size();
    }
}
