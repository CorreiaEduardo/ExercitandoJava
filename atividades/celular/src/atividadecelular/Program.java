/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecelular;

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
        Celular celFabricante = new Celular("S9","Samsung",64);
        Celular celLoja = new Celular(2700,"S9","Samsung",64);
        JOptionPane.showMessageDialog(null, "Modelo: "+celFabricante.getModelo()+"\nMarca: "+celFabricante.getMarca()+"\nGigas de armazenamento: "+celFabricante.getArmazenamento(), "Verificando informações do fabricante...", 2);
        JOptionPane.showMessageDialog(null, "Modelo: "+celLoja.getModelo()+"\nMarca: "+celLoja.getMarca()+"\nGigas de armazenamento: "+celLoja.getArmazenamento()+"\nPreço: R$"+celLoja.getPreco(), "Verificando informações da loja...", 2);
    }
    
}
