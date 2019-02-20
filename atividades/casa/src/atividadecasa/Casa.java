/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecasa;

/**
 *
 * @author Edu
 */
public class Casa {
    private String dono;
    private int numero;
    private int quantidadeMoradores;
    
    public Casa(int numero){
        this.numero=numero;
    }
    
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getNumero() {
        return numero;
    }
    public int getQuantidadeMoradores() {
        return quantidadeMoradores;
    }

    public void setQuantidadeMoradores(int quantidadeMoradores) {
        this.quantidadeMoradores = quantidadeMoradores;
    }
    
}
