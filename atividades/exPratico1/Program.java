/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expratico;

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
        Conta conta1 = new Conta();
        conta1.saldo=100;
        conta1.numero=001;
        conta1.limite=2000;
        conta1.nomeDono = "Fran";
        
        Conta conta2 = new Conta();
        conta2.saldo=12000;
        conta2.numero=002;
        conta2.limite=2500;
        conta2.nomeDono = "Sidney";
        while(true){
            int auth = Integer.parseInt(JOptionPane.showInputDialog("Insira o número da sua conta:"));
            Object[] opcoes = {"Sacar","Depositar","Transferência","Sair"};
            switch(auth){
                case 001: //fran
                    int operacao = JOptionPane.showOptionDialog(null, "Olá "+conta1.nomeDono+" seu saldo é: "+conta1.saldo, "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    //System.out.println(operacao);
                    while(operacao != 3){
                        switch(operacao){
                        case 0: // sacar
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser sacado."));
                            if (conta1.sacarDinheiro(valor)) {
                                conta1.saldo-=valor;
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
                            Object[] opcoes2 = {conta2.nomeDono};
                            String destino = (String)JOptionPane.showInputDialog(null, "Escolha a conta destino da transferência", "Escolha uma opção", 0, null, opcoes2, conta);
                            if (destino.equals(conta2.nomeDono)) {
                                conta1.transferirDinheiro(valor, conta2);
                            }

                            break;
                    }
                    System.out.println(conta1.saldo);
                    operacao = JOptionPane.showOptionDialog(null, "Seu saldo é: "+conta1.saldo, "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    }
                    break;
                case 002:
                    operacao = JOptionPane.showOptionDialog(null, "Olá "+conta2.nomeDono+" seu saldo é: "+conta2.saldo, "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    //System.out.println(operacao);
                    while(operacao != 3){
                        switch(operacao){
                        case 0: // sacar
                            valor = Double.parseDouble(JOptionPane.showInputDialog("Insira um valor a ser sacado."));
                            if (conta2.sacarDinheiro(valor)) {
                                conta2.saldo-=valor;
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
                            Object[] opcoes2 = {conta1.nomeDono};
                            String destino = (String)JOptionPane.showInputDialog(null, "Escolha a conta destino da transferência", "Escolha uma opção", 0, null, opcoes2, conta);
                            if (destino.equals(conta1.nomeDono)) {
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
                    System.out.println(conta2.saldo);
                    operacao = JOptionPane.showOptionDialog(null, "Seu saldo é: "+conta2.saldo, "Selecione uma operação.", 0, 3,null, opcoes, opcoes[0]);
                    }
                    break;
            }
        }
    }
}
