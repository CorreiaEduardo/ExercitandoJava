package org.fieb;

/**
 * @author aluno
 */
public class Medico {
    protected String CRM;
    protected String nome;
    protected int idade;
    protected double salario;

    public Medico(){
    }
    public Medico(String c, String n,int i,double s){
        this.CRM = c;
        this.nome = n;
        this.idade = i;
        this.salario = s;
    }
    
    public boolean medicoAposentado(){
        if (this.idade > 55) {
            return true;
        }return false;
    }
    public double valorAposentadoria(){
        if (this.medicoAposentado()) {
            return this.salario*0.8;
        }
        return 0;
    }
    
    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}
