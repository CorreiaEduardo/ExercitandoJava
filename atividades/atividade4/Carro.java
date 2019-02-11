/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author Edu
 */
public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    boolean carroLigado;
    
    
    public void ligarMotor(){
        JOptionPane.showMessageDialog(null, "Carro ligado");
    }
    
    public void acelerarCarro(double adicional){
        this.velocidadeAtual+=adicional;
        JOptionPane.showMessageDialog(null, "A velocidade do carro aumentou em "+adicional+"km/h, e sua velocidade atual é "+this.velocidadeAtual+"km/h");
    }
    
    public int retornarMarcha(){
        
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual<20 ) {
            return 1;
        }
        else if (this.velocidadeAtual >20 && this.velocidadeAtual < 40) {
            return 2;
        }
        else if (this.velocidadeAtual > 40 && this.velocidadeAtual < 60) {
            return 3;
        }
        else if (this.velocidadeAtual > 70 && this.velocidadeAtual < 100) {
            return 4;
        }
        else{
            return 5;
        }
    }
    
    
    
    
}
