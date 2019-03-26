package org.fieb;

/**
 * @author aluno
 */
public class MedicoAuxiliar extends Medico {

    public MedicoAuxiliar() {
    }
    public MedicoAuxiliar(String c, String n,int i,double s){
        this.CRM = c;
        this.nome = n;
        this.idade = i;
        this.salario = s;
    }
    
    @Override
    public boolean medicoAposentado(){
        if (this.idade >= 60) {
            return true;
        }return false;
    }
}
