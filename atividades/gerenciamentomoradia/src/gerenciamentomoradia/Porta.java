/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentomoradia;

/**
 *
 * @author Edu
 */
public class Porta {
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;
    private boolean aberta;
    
    public String getCor() {
        return cor;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return aberta;
    }

     /**
     * @param estado true para aberta, false para fechada
     */
    public void setEstadoPorta(boolean estado) {
        this.aberta = estado;
    }
    
    public double getDimensaoX() {
        return dimensaoX;
    }

    public void setDimensaoX(double dimensaoX) {
        this.dimensaoX = dimensaoX;
    }

    public double getDimensaoY() {
        return dimensaoY;
    }

    public void setDimensaoY(double dimensaoY) {
        this.dimensaoY = dimensaoY;
    }

    public double getDimensaoZ() {
        return dimensaoZ;
    }

    public void setDimensaoZ(double dimensaoZ) {
        this.dimensaoZ = dimensaoZ;
    }
    
}
