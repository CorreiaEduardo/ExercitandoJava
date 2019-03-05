/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gerenciamentomoradia;

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
//        Porta porta = new Porta();
//        porta.setEstadoPorta(true);
//        System.out.println(porta.estaAberta());
//        porta.setEstadoPorta(false);
//        System.out.println(porta.estaAberta());
//        porta.pinta("azul");
//        System.out.println(porta.getCor());
//        porta.pinta("roxo");
//        System.out.println(porta.getCor());
//        porta.pinta("amarelo");
//        System.out.println(porta.getCor());
//        porta.pinta("vermelho");
//        System.out.println(porta.getCor());
//        porta.pinta("verde");
//        System.out.println(porta.getCor());
//        porta.setDimensaoX(50);
//        porta.setDimensaoY(240);
//        porta.setDimensaoZ(5);
//        System.out.println(porta.getDimensaoX());
//        System.out.println(porta.getDimensaoY());
//        System.out.println(porta.getDimensaoZ());
//        System.out.println(porta.estaAberta());

        // CASA
    
//    Casa casa = new Casa();
//    casa.pinta(JOptionPane.showInputDialog("Insira a cor da casa"));
//    Porta novaPorta = new Porta();
//    novaPorta.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento da porta")));
//    novaPorta.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura da porta")));
//    novaPorta.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura da porta")));
//    novaPorta.pinta(JOptionPane.showInputDialog("Insira a cor da porta"));
//    casa.cadastraPorta(novaPorta);
//    int escolha;
//        do {
//            escolha = JOptionPane.showConfirmDialog(null, "Deseja inserir outra porta?");
//            if (escolha == 0) {
//                novaPorta = new Porta();
//                novaPorta.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento da porta")));
//                novaPorta.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura da porta")));
//                novaPorta.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura da porta")));
//                novaPorta.pinta(JOptionPane.showInputDialog("Insira a cor da porta"));
//                casa.cadastraPorta(novaPorta);
//            }
//            else break;
//            
//        } while (true);
//        int cont=1;
//        for (Porta node:casa.getPortas()) {
//            if (cont%2==0) {
//                node.setEstadoPorta(false);
//            }else{
//                node.setEstadoPorta(true);
//            }
//            cont++;
//        }
//        JOptionPane.showMessageDialog(null, casa.quantasPortasEstaoAbertas()+" porta(s) esta(ão) aberta(s).");

            // EDIFICIO

        Edificio ed = new Edificio();
        ed.pinta(JOptionPane.showInputDialog("Insira a cor do edificio"));
        Porta novaPorta;
        for (int i = 0; i < 6; i++) {
            novaPorta = new Porta();
            novaPorta.setDimensaoX(50);
            novaPorta.setDimensaoY(260);
            novaPorta.setDimensaoZ(5);
            novaPorta.pinta("Marrom");
            
//            novaPorta.setDimensaoX(Double.parseDouble(JOptionPane.showInputDialog("Insira o comprimento da porta")));
//            novaPorta.setDimensaoY(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura da porta")));
//            novaPorta.setDimensaoZ(Double.parseDouble(JOptionPane.showInputDialog("Insira a largura da porta")));
//            novaPorta.pinta(JOptionPane.showInputDialog("Insira a cor da porta"));
            
            ed.cadastraPorta(novaPorta);
        }
        Object[] opcoes = {"Aberta","Fechada"};
        for (int i = 0; i < 6; i++) {
            int estado = JOptionPane.showOptionDialog(null, "Selecione o estado da"+ (i+1) +"porta", "Configurando porta", 0, 2, null, opcoes, opcoes[0]);
            if (estado == 0) {
                ed.getPortas().get(i).setEstadoPorta(true);
            }else ed.getPortas().get(i).setEstadoPorta(false);
            
        }
        JOptionPane.showMessageDialog(null, ed.quantasPortasEstaoAbertas()+" porta(s) esta(ão) aberta(s).");
        JOptionPane.showMessageDialog(null, "Existem "+ed.totalDePortas()+" porta(s) no edificio.");
        
        ed.adicionarAndar(JOptionPane.showInputDialog("Insira o nome do primeiro andar."));
        int escolha;
        do {
            escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar outro andar?");
            if (escolha == 0) {
                ed.adicionarAndar(JOptionPane.showInputDialog("Insira o nome do andar."));
            }
            else break;
            
        } while (true);
        JOptionPane.showMessageDialog(null, "Existem "+ed.totalDeAndares()+" andar(es) no edificio.");
        
        
    }
    
}
