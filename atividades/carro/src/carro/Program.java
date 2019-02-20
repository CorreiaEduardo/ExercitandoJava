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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] opcoes = {"Ligar motor","Aumentar velocidade","Verificar marcha atual","Sair"};
        Carro novoCarro = new Carro();
        novoCarro.setModelo(JOptionPane.showInputDialog(null, "Digite o modelo do carro", "Configurações iniciais...", 3));
        novoCarro.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro", "Configurações iniciais...", 3));
        novoCarro.setVelocidadeMaxima(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade máxima que seu "+novoCarro.getModelo()+" alcança.", "Configurações iniciais...", 3)));
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Carro", 1, 3,null, opcoes, opcoes[0]);
        novoCarro.setCarroLigado(false);
        while (opcao != 3) {
            switch(opcao){
                case 0:
                    if (!novoCarro.isCarroLigado()) {
                        boolean autorizacao = novoCarro.ligarMotor();
                        if (autorizacao) {
                            JOptionPane.showMessageDialog(null, "Carro ligado!");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "O carro já está ligado");
                        
                    }
                    break;
                case 1:
                    int adicional = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade adicional", "Acelerando", 3));
                    boolean autorizacao = novoCarro.acelerarCarro(adicional);
                    if (novoCarro.isCarroLigado()) {
                        if (autorizacao) {
                            JOptionPane.showMessageDialog(null, "A velocidade do carro aumentou em "+adicional+"km/h, e sua velocidade atual é "+novoCarro.getVelocidadeAtual()+"km/h");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "A velocidade do carro não aumentou em "+adicional+"km/h, e sua velocidade atual se manteve "+novoCarro.getVelocidadeAtual()+"km/h, se atente ao limite de velocidade! Você só pode aumentar a velocidade do carro em mais "+
                                (novoCarro.getVelocidadeMaxima()-novoCarro.getVelocidadeAtual())+" km/h");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Você precisa ligar o carro primeiro!");
                    
                    }
                    
                    break;
                case 2:
                    int marchaAtual = novoCarro.retornarMarcha();
                    JOptionPane.showMessageDialog(null, "A marcha atual é "+marchaAtual, "Olhando para a marcha...", 1);
                    
                    
                    break;
                case 3:
                    break;
            }
            opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Carro", 1, 3,null, opcoes, opcoes[0]);
        }
        
    }
    
}
