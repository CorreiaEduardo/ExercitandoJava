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
public class Casa {
    private String cor;
    private ArrayList<Porta> portas = new ArrayList<>();

    public String getCor() {
        return cor;
    }

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

    public void cadastraPorta(Porta novaPorta) {
        this.portas.add(novaPorta);
    }
    
    public ArrayList<Porta> getPortas(){
        return portas;
    }
    
}
