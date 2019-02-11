/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade4;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo C.
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Object[] opcoes = {"Ligar motor","Aumentar velocidade","Verificar marcha atual","Sair"};
        Carro novoCarro = new Carro();
        novoCarro.modelo = JOptionPane.showInputDialog(null, "Digite o modelo do carro", "Configurações iniciais...", 3);
        novoCarro.cor = JOptionPane.showInputDialog(null, "Digite a cor do carro", "Configurações iniciais...", 3);
        int opcao = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Carro", 1, 3,null, opcoes, opcoes[0]);
        novoCarro.carroLigado = false;
        while (opcao != 3) {
            switch(opcao){
                case 0:
                    if (!novoCarro.carroLigado) {
                        novoCarro.ligarMotor();
                        novoCarro.carroLigado = true;
                    }else{
                        JOptionPane.showMessageDialog(null, "O carro já está ligado");
                        
                    }
                    break;
                case 1:
                    int adicional = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a velocidade adicional", "Acelerando", 3));
                    novoCarro.acelerarCarro(adicional);
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
