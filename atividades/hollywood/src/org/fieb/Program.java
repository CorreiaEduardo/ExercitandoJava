/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fieb;

import javax.swing.JOptionPane;

/**
 * @author aluno
 */
public class Program {

    public static void main(String[] args) {
        Diretor diretor1 = new Diretor();
        diretor1.setNome(JOptionPane.showInputDialog("Insira o nome do novo diretor."));
        diretor1.setCpf(JOptionPane.showInputDialog("Insira o cpf do novo diretor."));
        diretor1.setNivel(Integer.parseInt(JOptionPane.showInputDialog("Insira o nivel do novo diretor.")));
        Filme filme1;
        while (true) {            
            if (JOptionPane.showConfirmDialog(null, "Deseja atribuir um filme a este diretor?") == 0) {
                filme1 = new Filme();
                filme1.setTitulo(JOptionPane.showInputDialog("Insira o titulo do novo filme."));
                filme1.setGenero(JOptionPane.showInputDialog("Insira o genero do novo filme."));
                filme1.setNivel(Integer.parseInt(JOptionPane.showInputDialog("Insira o nivel do novo filme.")));
                if (filme1.getNivel() > diretor1.getNivel()) {
                    JOptionPane.showMessageDialog(null, "O nível de complexidade do filme requer um diretor com melhores skills");
                }else{
                    diretor1.setFilme(filme1);
                }
            }
            else{
                break;
            }
        }
        System.out.println("O diretor "+diretor1.getNome()+" possui os seguintes filmes:");
        for(Filme node:diretor1.getFilmes()){
            System.out.println(node.getTitulo());
        }
    }
    
}
