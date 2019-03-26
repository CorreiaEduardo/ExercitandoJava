package org.fieb;

import javax.swing.JOptionPane;

/**
 * @author aluno
 */
public class Program {

    public static void main(String[] args) {
        String crm;
        String nome;
        int idade;
        double salario;
        Object[] cargos = {"Medico Auxiliar","Medico Cirurgiao","Não Atribuir"};
        int escolha = JOptionPane.showOptionDialog(null, "Deseja atribuir um cargo ao novo médico?", "Atribuindo cargo...", 0, 2, null, cargos, cargos[0]);
        switch(escolha){
            case 0:
                crm = JOptionPane.showInputDialog(null, "Insira o CRM do médico", "Cadastrando médico", 0);
                nome = JOptionPane.showInputDialog(null, "Insira o nome do médico", "Cadastrando médico", 0);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do médico", "Cadastrando médico", 0));
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário do médico", "Cadastrando médico", 0));
                MedicoAuxiliar medicoAuxiliar = new MedicoAuxiliar(crm,nome,idade,salario);
                if (medicoAuxiliar.medicoAposentado()) {
                    JOptionPane.showMessageDialog(null, "O médico pode se aposentar/está aposentado");
                    JOptionPane.showMessageDialog(null, "O médico tem direto a uma aposentadoria de "+medicoAuxiliar.valorAposentadoria());
                }else{
                    JOptionPane.showMessageDialog(null, "O médico não pode se aposentar/estar aposentado");
                }
                break;
            case 1:
                crm = JOptionPane.showInputDialog(null, "Insira o CRM do médico", "Cadastrando médico", 0);
                nome = JOptionPane.showInputDialog(null, "Insira o nome do médico", "Cadastrando médico", 0);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do médico", "Cadastrando médico", 0));
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário do médico", "Cadastrando médico", 0));
                MedicoCirurgiao medicoCirurgiao = new MedicoCirurgiao(crm,nome,idade,salario);
                if (medicoCirurgiao.medicoAposentado()) {
                    JOptionPane.showMessageDialog(null, "O médico pode se aposentar/está aposentado");
                    JOptionPane.showMessageDialog(null, "O médico tem direto a uma aposentadoria de "+medicoCirurgiao.valorAposentadoria());
                }else{
                    JOptionPane.showMessageDialog(null, "O médico não pode se aposentar/estar aposentado");
                }
                break;
            case 2:
                crm = JOptionPane.showInputDialog(null, "Insira o CRM do médico", "Cadastrando médico", 0);
                nome = JOptionPane.showInputDialog(null, "Insira o nome do médico", "Cadastrando médico", 0);
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira a idade do médico", "Cadastrando médico", 0));
                salario = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira o salário do médico", "Cadastrando médico", 0));
                Medico medico = new Medico(crm,nome,idade,salario);
                if (medico.medicoAposentado()) {
                    JOptionPane.showMessageDialog(null, "O médico pode se aposentar/está aposentado");
                    JOptionPane.showMessageDialog(null, "O médico tem direto a uma aposentadoria de "+medico.valorAposentadoria());
                }else{
                    JOptionPane.showMessageDialog(null, "O médico não pode se aposentar/estar aposentado");
                }
                break;
        }
        
        
        
    }
    
}
