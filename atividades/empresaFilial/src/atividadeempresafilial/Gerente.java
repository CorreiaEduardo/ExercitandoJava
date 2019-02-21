/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeempresafilial;

/**
 *
 * @author Eduardo C.
 */
public class Gerente {
    private String nome;
    private String cpf;
    private String telefone;
    private float tempoEmpregado;
    private String disponibilidade;

    public Gerente(){
        this.tempoEmpregado = 0;
        this.disponibilidade = "Disponivel";
    }
    
    public Gerente(String nome, String cpf, String telefone, float tempoEmpregado){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.tempoEmpregado = tempoEmpregado;
        this.disponibilidade = "Disponivel";
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public float getTempoEmpregado(){
        return this.tempoEmpregado;
    }
    
    public void setTempoEmpregado(float tempoEmpregado){
        this.tempoEmpregado = tempoEmpregado;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
