/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.ArrayList;
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
        int escolhaPet = 1;
        Dono novoDono = new Dono();
        Object[] opcoes = {"Cadastrar novo cliente","Sair"};
        int escolha;
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção",
                "Bem-vindo(a)", 0, 2, null, opcoes, opcoes[0]);
            if (escolha == 0) {
                novoDono.setNome(JOptionPane.showInputDialog(null, "Insira o nome do cliente", "Configurando novo cliente. 1/3", 3));
                novoDono.setTelefone(JOptionPane.showInputDialog(null, "Insira o telefone do cliente", "Configurando novo cliente. 3/3", 3));
                if (novoDono.setDistancia(Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a distância do cliente", "Configurando novo cliente. 2/3", 3)))) {
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Operação efetuada", 1);
                }else{
                  JOptionPane.showMessageDialog(null, "Distância fora do limite.", "Não é possivel continuar.", 1);
                }
                Object[] opcoesCadastro = {"Cadastrar um pet","Finalizar cadastro"};
                int cont = 0;
                do {
                    if (cont !=3) {
                        escolhaPet = JOptionPane.showOptionDialog(null, "Escolha uma opção",
                        "Bem-vindo(a)", 0, 2, null, opcoesCadastro, opcoesCadastro[0]);
                    }else{
                        JOptionPane.showMessageDialog(null, "Limite de pets alcançado, finalizando cadastro de cliente.");
                    }
                    if (escolhaPet != 0 || cont == 3) break;
                    cont++;
                    Pet novoPet = new Pet();
                    novoPet.setNome(JOptionPane.showInputDialog(null, "Insira o nome do pet", "Configurando novo pet. 1/3", 3));
                    novoPet.setRaca(JOptionPane.showInputDialog(null, "Insira a raça do pet", "Configurando novo pet. 2/3", 3));
                    novoPet.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do pet", "Configurando novo pet. 3/3", 3)));
                    novoPet.setDono(novoDono);
                    novoDono.addToPetList(novoPet);
                } while (true);
            }
            
        
        if (escolha != 1) {
            ArrayList<Entrega> entregas = new ArrayList<>();
            Object[] opcoesEntrega = {"Entregar","Avançar"};
            for (int i = 0; i<novoDono.getPetList().size();i++) {
                escolha = JOptionPane.showOptionDialog(null, "Nome:"+novoDono.getPetList().get(i).getNome(),
                    "Escolha uma opção", 0, 2, null, opcoesEntrega, opcoesEntrega[0]);
                switch(escolha){
                    case 1:
                        if (i == novoDono.getPetList().size()-1) {
                            i = -1;
                        }
                        break;
                    case 0: // inicio entrega
                        Entrega novaEntrega = new Entrega();
                        novaEntrega.setPet(novoDono.getPetList().get(i));
                        novaEntrega.calculaPreço();
                        novoDono.addEntrega(novaEntrega);
                        JOptionPane.showMessageDialog(null, "O preço da entrega será de R$"+novaEntrega.getValor(), "Entrega", 2);
                        if (novoDono.getPetList().size() > 1) {
                            int proxEntrega = JOptionPane.showConfirmDialog(null, "Deseja entregar outro pet?");
                            switch(proxEntrega){
                                case 0:
                                    for (int j = 0; j<novoDono.getPetList().size();j++) {
                                        if (j==i){
                                            if (j == novoDono.getPetList().size()-1) {
                                                    j = -1;
                                                }
                                            continue;
                                        }
                                        escolha = JOptionPane.showOptionDialog(null, "Nome:"+novoDono.getPetList().get(j).getNome(),
                                            "Escolha uma opção", 0, 2, null, opcoesEntrega, opcoesEntrega[0]);
                                        switch(escolha){
                                            case 0:
                                                Entrega novaEntrega2 = new Entrega();
                                                novaEntrega2.setPet(novoDono.getPetList().get(i));
                                                novaEntrega2.calculaPreço();
                                                novoDono.addEntrega(novaEntrega2);
                                                JOptionPane.showMessageDialog(null, "O preço total da entrega será de R$"+(novaEntrega.getValor()+novaEntrega2.getValor()), "Entrega", 2);
                                                
                                                if (novoDono.getPetList().size()>2) {
                                                    proxEntrega = JOptionPane.showConfirmDialog(null, "Deseja entregar outro pet?");
                                                    switch(proxEntrega){
                                                        case 0:
                                                            for (int k = 0; k < novoDono.getPetList().size(); k++) {
                                                                if (k == i || k == j){
                                                                    if (k == novoDono.getPetList().size()-1) {
                                                                            k = -1;
                                                                    }
                                                                    continue;
                                                                }
                                                                escolha = JOptionPane.showOptionDialog(null, "Nome:"+novoDono.getPetList().get(k).getNome(),
                                                                    "Escolha uma opção", 0, 2, null, opcoesEntrega, opcoesEntrega[0]);
                                                                switch(escolha){
                                                                    case 0:
                                                                        Entrega novaEntrega3 = new Entrega();
                                                                        novaEntrega3.setPet(novoDono.getPetList().get(i));
                                                                        novaEntrega3.calculaPreço();
                                                                        novoDono.addEntrega(novaEntrega3);
                                                                        JOptionPane.showMessageDialog(null, "O preço total da entrega será de R$"+(novaEntrega.getValor()+novaEntrega2.getValor()+novaEntrega3.getValor()), "Entrega", 2);
                                                                        k=100;
                                                                        j =100;
                                                                        i =100;
                                                                        break;
                                                                    case 1:
                                                                        if (k == novoDono.getPetList().size()-1) {
                                                                            k = -1;
                                                                        }
                                                                        break;
                                                                }
                                                            }
                                                            break;
                                                        case 1:
                                                            JOptionPane.showMessageDialog(null, "O preço total da entrega será de R$"+(novaEntrega.getValor()+novaEntrega2.getValor()), "Entrega", 2);
                                                            i =100;
                                                            j = 100;
                                                            break;
                                                        
                                                    }
                                                }else{
                                                    j = 100;
                                                    i = 100;
                                                }
                                                break;
                                            case 1:
                                                if (j == novoDono.getPetList().size()-1) {
                                                    j = -1;
                                                }
                                                break;    
                                        }
                                    }
                                    break;
                                case 1:
                                    JOptionPane.showMessageDialog(null, "O preço da entrega será de R$"+novaEntrega.getValor(), "Entrega", 2);
                                    i =100;
                                    break;
                            }
                        }
                        
                        break; // fim da entrega
                }
                
            }
            
        } 
    }
}
