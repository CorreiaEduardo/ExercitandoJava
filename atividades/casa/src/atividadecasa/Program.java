/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package atividadecasa;

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
        int num = Integer.parseInt((JOptionPane.showInputDialog(null, "Insira o número da casa")));
        Casa novaCasa = new Casa(num);
        novaCasa.setDono(JOptionPane.showInputDialog(null, "Insira o nome do dono da casa " + novaCasa.getNumero()+"."));
        novaCasa.setQuantidadeMoradores(Integer.parseInt((JOptionPane.showInputDialog(null, "Insira a quantidade de moradores da casa " + novaCasa.getNumero()+"."))));
        JOptionPane.showMessageDialog(null, "A casa de número " + novaCasa.getNumero()+" é do proprietário "+novaCasa.getDono()+" e nela moram "+novaCasa.getQuantidadeMoradores()+" pessoas.", "Verificando casa...", 2);
    }
    
}
