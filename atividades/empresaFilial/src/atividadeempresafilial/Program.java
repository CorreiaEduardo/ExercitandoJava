/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeempresafilial;

import java.util.ArrayList;
import java.util.List;
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
        
        String nome = JOptionPane.showInputDialog(null, "Insira o nome do primeiro gerente", "Alocando para gerentes disponíveis", 0);
        String cpf = JOptionPane.showInputDialog(null, "Insira o cpf do primeiro gerente", "Alocando para gerentes disponíveis", 0);
        String telefone = JOptionPane.showInputDialog(null, "Insira o telefone do primeiro gerente", "Alocando para gerentes disponíveis", 0);
        float tempoEmpregado = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o tempo que o primeiro gerente está empregado", "Alocando para gerentes disponíveis", 0));
        Gerente gerente1 = new Gerente(nome,cpf,telefone,tempoEmpregado);
        
        String nome2 = JOptionPane.showInputDialog(null, "Insira o nome do segundo gerente", "Alocando para gerentes disponíveis", 0);
        String cpf2 = JOptionPane.showInputDialog(null, "Insira o cpf do segundo gerente", "Alocando para gerentes disponíveis", 0);
        String telefone2 = JOptionPane.showInputDialog(null, "Insira o telefone do segundo gerente", "Alocando para gerentes disponíveis", 0);
        float tempoEmpregado2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o tempo que o segundo gerente está empregado", "Alocando para gerentes disponíveis", 0));
        Gerente gerente2 = new Gerente(nome2,cpf2,telefone2,tempoEmpregado2);
        
        String nome3 = JOptionPane.showInputDialog(null, "Insira o nome do terceiro gerente", "Alocando para gerentes disponíveis", 0);
        String cpf3 = JOptionPane.showInputDialog(null, "Insira o cpf do terceiro gerente", "Alocando para gerentes disponíveis", 0);
        String telefone3 = JOptionPane.showInputDialog(null, "Insira o telefone do terceiro gerente", "Alocando para gerentes disponíveis", 0);
        float tempoEmpregado3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira o tempo que o terceiro gerente está empregado", "Alocando para gerentes disponíveis", 0));
        Gerente gerente3 = new Gerente(nome3,cpf3,telefone3,tempoEmpregado3);
        
        
        String endereco = JOptionPane.showInputDialog(null, "Insira o endereco da primeira filial", "Cadastrando a primeira filial", 0);
        String telefoneFilial = JOptionPane.showInputDialog(null, "Insira o telefone da primeira filial", "Cadastrando a primeira filial", 0);
        int anoAbertura = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de abertura da primeira filial", "Cadastrando a primeira filial", 0));
        float notaAvaliacao = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota de avaliacao da primeira filial", "Cadastrando a primeira filial", 0));
        Filial filial1= new Filial(endereco,telefoneFilial,anoAbertura,notaAvaliacao);
        
        Object[] opcoes = {gerente1.getNome()+"-"+gerente1.getDisponibilidade(),gerente2.getNome()+"-"+gerente2.getDisponibilidade(),gerente3.getNome()+"-"+gerente3.getDisponibilidade()};
        String nomeEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha um gerente entre os disponíveis", "Escolhendo gerente", 2, null, opcoes, opcoes[0]);
        if (nomeEscolhido.equals(gerente1.getNome()+"-"+gerente1.getDisponibilidade())) {
            gerente1.setDisponibilidade("Indisponível");
            filial1.setGerenteFilial(gerente1);
        }
        else if (nomeEscolhido.equals(gerente2.getNome()+"-"+gerente2.getDisponibilidade())) {
            gerente2.setDisponibilidade("Indisponível");
            filial1.setGerenteFilial(gerente2);
        }
        else if (nomeEscolhido.equals(gerente3.getNome()+"-"+gerente3.getDisponibilidade())){
            gerente3.setDisponibilidade("Indisponível");
            filial1.setGerenteFilial(gerente3);
        }
        
        System.out.println(gerente1.getNome()+"-"+gerente1.getDisponibilidade()+" "+gerente2.getNome()+"-"+gerente2.getDisponibilidade()+" "+gerente3.getNome()+"-"+gerente3.getDisponibilidade());
        
        String endereco2 = JOptionPane.showInputDialog(null, "Insira o endereco da segunda filial", "Cadastrando a segunda filial", 0);
        String telefoneFilial2 = JOptionPane.showInputDialog(null, "Insira o telefone da segunda filial", "Cadastrando a segunda filial", 0);
        int anoAbertura2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de abertura da segunda filial", "Cadastrando a segunda filial", 0));
        float notaAvaliacao2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota de avaliacao da segunda filial", "Cadastrando a segunda filial", 0));
        Filial filial2= new Filial(endereco2,telefone2,anoAbertura2,notaAvaliacao2);
        
        Object[] opcoes2 = {gerente1.getNome()+"-"+gerente1.getDisponibilidade(),gerente2.getNome()+"-"+gerente2.getDisponibilidade(),gerente3.getNome()+"-"+gerente3.getDisponibilidade()};
        nomeEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha um gerente entre os disponíveis", "Escolhendo gerente", 2, null, opcoes2, opcoes2[0]);
        if (nomeEscolhido.equals(gerente1.getNome()+"-"+gerente1.getDisponibilidade())) {
            gerente1.setDisponibilidade("Indisponível");
            filial2.setGerenteFilial(gerente1);
        }
        else if (nomeEscolhido.equals(gerente2.getNome()+"-"+gerente2.getDisponibilidade())) {
            gerente2.setDisponibilidade("Indisponível");
            filial2.setGerenteFilial(gerente2);
        }
        else if (nomeEscolhido.equals(gerente3.getNome()+"-"+gerente3.getDisponibilidade())){
            gerente3.setDisponibilidade("Indisponível");
            filial2.setGerenteFilial(gerente3);
        }
        
        String endereco3 = JOptionPane.showInputDialog(null, "Insira o endereco da terceira filial", "Cadastrando a terceira filial", 0);
        String telefoneFilial3 = JOptionPane.showInputDialog(null, "Insira o telefone da terceira filial", "Cadastrando a terceira filial", 0);
        int anoAbertura3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o ano de abertura da terceira filial", "Cadastrando a terceira filial", 0));
        float notaAvaliacao3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Insira a nota de avaliacao da terceira filial", "Cadastrando a terceira filial", 0));
        Filial filial3= new Filial(endereco3,telefone3,anoAbertura3,notaAvaliacao3);
        
        Object[] opcoes3 = {gerente1.getNome()+"-"+gerente1.getDisponibilidade(),gerente2.getNome()+"-"+gerente2.getDisponibilidade(),gerente3.getNome()+"-"+gerente3.getDisponibilidade()};
        nomeEscolhido = (String) JOptionPane.showInputDialog(null, "Escolha um gerente entre os disponíveis", "Escolhendo gerente", 2, null, opcoes3, opcoes3[0]);
        if (nomeEscolhido.equals(gerente1.getNome()+"-"+gerente1.getDisponibilidade())) {
            gerente1.setDisponibilidade("Indisponível");
            filial3.setGerenteFilial(gerente1);
        }
        else if (nomeEscolhido.equals(gerente2.getNome()+"-"+gerente2.getDisponibilidade())) {
            gerente2.setDisponibilidade("Indisponível");
            filial3.setGerenteFilial(gerente2);
        }
        else if (nomeEscolhido.equals(gerente3.getNome()+"-"+gerente3.getDisponibilidade())){
            gerente3.setDisponibilidade("Indisponível");
            filial3.setGerenteFilial(gerente3);
        }
        
        JOptionPane.showMessageDialog(null, "Endereço: "+filial1.getEndereco()+
                "\nTelefone: "+filial1.getTelefone()+
                "\nAno de abertura: "+filial1.getAnoAbertura()+
                "\nNota de Avaliação: "+filial1.getNotaAvaliacao()+
                "\n--------\n"+
                "Gerente:\n"+
                "Nome: "+filial1.getGerenteFilial().getNome()+
                "\nCPF: "+filial1.getGerenteFilial().getCpf()+
                "\nTelefone: "+filial1.getGerenteFilial().getTelefone()+
                "\nTempo de Empresa: "+filial1.getGerenteFilial().getTempoEmpregado(), "Filial 1", 2);
        
        JOptionPane.showMessageDialog(null, "Endereço: "+filial2.getEndereco()+
                "\nTelefone: "+filial2.getTelefone()+
                "\nAno de abertura: "+filial2.getAnoAbertura()+
                "\nNota de Avaliação: "+filial2.getNotaAvaliacao()+
                "\n--------\n"+
                "Gerente:\n"+
                "Nome: "+filial2.getGerenteFilial().getNome()+
                "\nCPF: "+filial2.getGerenteFilial().getCpf()+
                "\nTelefone: "+filial2.getGerenteFilial().getTelefone()+
                "\nTempo de Empresa: "+filial2.getGerenteFilial().getTempoEmpregado(), "Filial 2", 2);
        
        JOptionPane.showMessageDialog(null, "Endereço: "+filial3.getEndereco()+
                "\nTelefone: "+filial3.getTelefone()+
                "\nAno de abertura: "+filial3.getAnoAbertura()+
                "\nNota de Avaliação: "+filial3.getNotaAvaliacao()+
                "\n--------\n"+
                "Gerente:\n"+
                "Nome: "+filial3.getGerenteFilial().getNome()+
                "\nCPF: "+filial3.getGerenteFilial().getCpf()+
                "\nTelefone: "+filial3.getGerenteFilial().getTelefone()+
                "\nTempo de Empresa: "+filial3.getGerenteFilial().getTempoEmpregado(), "Filial 3", 2);
        
        
    }
    
}
