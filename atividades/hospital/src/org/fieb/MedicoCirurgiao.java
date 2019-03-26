package org.fieb;

/**
 * @author aluno
 */
public class MedicoCirurgiao extends Medico {
    public MedicoCirurgiao(String c, String n,int i,double s){
        this.CRM = c;
        this.nome = n;
        this.idade = i;
        this.salario = s;
    }
    @Override
    public boolean medicoAposentado(){
        if (this.idade >= 50) {
            return true;
        }return false;
    }
    @Override
    public double valorAposentadoria(){
        if (this.medicoAposentado()) {
            return super.valorAposentadoria()+800;
        }return 0;
    }
    
}

