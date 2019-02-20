/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

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
        double valor;
        Conta conta1 = new Conta(001);
        conta1.setLimite(2000);
        conta1.setNomeDono("Fran");
        
        Conta conta2 = new Conta(002,12000);
        conta2.setLimite(2500);
        conta2.setNomeDono("Sidney");
        while(true){
            int auth = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da sua conta:"));
            Object[] opcoes = {"Sacar","Depositar","Transferência","Sair"};
            switch(auth){
                case 001: //fran
                    int operacao = JOptionPane.showOptionDialog(null, "Olá "+conta1.getNomeDono()+" seu saldo é: "+conta1.getSaldo(), "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    //System.out.println(operacao);
                    while(operacao != 3){
                        switch(operacao){
                        case 0: // sacar
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser sacado."));
                            if (conta1.sacarDinheiro(valor)) {
                                JOptionPane.showMessageDialog(null, "Operação efetuada com sucesso.");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente na conta e/ou limite de saque excedido.");
                            }
                            break;
                        case 1:
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser depositado."));
                                conta1.depositarDinheiro(valor);
                            break;
                        case 2:
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser transferido."));
                            int conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da conta à ser transferido o dinheiro."));
                            while(conta != 002){
                                conta = Integer.parseInt(JOptionPane.showInputDialog("Conta inexistente. Insira outro número referente a uma conta válida à ser transferido o dinheiro."));
                            }
                            Object[] opcoes2 = {conta2.getNomeDono()};
                            String destino = (String)JOptionPane.showInputDialog(null, "Escolha a conta destino da transferência", "Escolha uma opção", 0, null, opcoes2, conta);
                            if (destino.equals(conta2.getNomeDono())) {
                                boolean transferencia = conta1.transferirDinheiro(valor, conta2);
                                if (transferencia) {
                                    JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Saldo insuficiente e/ou limite excedido.");
                                }
                            }
                            
                            

                            break;
                    }
                    System.out.println(conta1.getSaldo());
                    operacao = JOptionPane.showOptionDialog(null, "Seu saldo é: "+conta1.getSaldo(), "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    }
                    break;
                case 002:
                    operacao = JOptionPane.showOptionDialog(null, "Olá "+conta2.getNomeDono()+" seu saldo é: "+conta2.getSaldo(), "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    //System.out.println(operacao);
                    while(operacao != 3){
                        switch(operacao){
                        case 0: // sacar
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser sacado."));
                            if (conta2.sacarDinheiro(valor)) {
                                JOptionPane.showMessageDialog(null, "Operação efetuada com sucesso.");
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "Saldo insuficiente na conta e/ou limite de saque excedido.");
                            }
                            break;
                        case 1:
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser depositado."));
                                conta2.depositarDinheiro(valor);
                            break;
                        case 2:
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser transferido."));
                            int conta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da conta à ser transferido o dinheiro."));
                            while(conta != 001){
                                conta = Integer.parseInt(JOptionPane.showInputDialog("Conta inexistente. Insira outro número referente a uma conta válida à ser transferido o dinheiro."));
                            }
                            Object[] opcoes2 = {conta1.getNomeDono()};
                            String destino = (String)JOptionPane.showInputDialog(null, "Escolha a conta destino da transferência", "Escolha uma opção", 0, null, opcoes2, conta);
                            if (destino.equals(conta1.getNomeDono())) {
                                boolean transferencia = conta2.transferirDinheiro(valor, conta1);
                                if (transferencia) {
                                    JOptionPane.showMessageDialog(null, "Transferência realizada com sucesso.");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null, "Saldo insuficiente e/ou limite excedido.");
                                }
                            }

                            break;
                    }
                    System.out.println(conta2.getSaldo());
                    operacao = JOptionPane.showOptionDialog(null, "Seu saldo é: "+conta2.getSaldo(), "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    }
                    break;
            }
        }
    }
}
