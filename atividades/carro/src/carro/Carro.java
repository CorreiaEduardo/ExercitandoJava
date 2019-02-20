/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class Carro {
    private String cor;
    private String modelo;
    private double velocidadeAtual;
    private double velocidadeMaxima;
    private boolean carroLigado;
    
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public boolean isCarroLigado() {
        return carroLigado;
    }
    public void setCarroLigado(boolean carroLigado) {
        this.carroLigado = carroLigado;
    }
    
    public boolean ligarMotor(){
        this.setCarroLigado(true);
        return true;
    }
    
    public boolean acelerarCarro(double adicional){
        
        if (this.velocidadeAtual+adicional <= this.velocidadeMaxima) {
            this.velocidadeAtual+=adicional;
            return true;
        }
        
       return false;
    }
    
    public int retornarMarcha(){
        
        if (this.getVelocidadeAtual() >= 0 && this.getVelocidadeAtual()<20 ) {
            return 1;
        }
        else if (this.getVelocidadeAtual() >20 && this.getVelocidadeAtual() < 40) {
            return 2;
        }
        else if (this.getVelocidadeAtual() > 40 && this.getVelocidadeAtual() < 60) {
            return 3;
        }
        else if (this.getVelocidadeAtual() > 70 && this.getVelocidadeAtual() < 100) {
            return 4;
        }
        else{
            return 5;
        }
    }

    
    
    
}
