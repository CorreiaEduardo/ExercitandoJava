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
public class Filial {
    private String endereco;
    private String telefone;
    private int anoAbertura;
    private float notaAvaliacao;
    private Gerente gerenteFilial;

    public Filial(int anoAbertura){
        this.anoAbertura = anoAbertura;
    }
    
    public Filial(String endereco, String telefone, int anoAbertura,float nota){
        this.endereco = endereco;
        this.telefone = telefone;
        this.anoAbertura = anoAbertura;
        this.notaAvaliacao = nota;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getAnoAbertura() {
        return anoAbertura;
    }

    public float getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public int setNotaAvaliacao(float notaAvaliacao) {
        if (notaAvaliacao >=0 && notaAvaliacao <= 5) {
            this.notaAvaliacao = notaAvaliacao;
            return 1;
        }
        else if(notaAvaliacao > 5){
            this.notaAvaliacao = 5;
            return 5;
        }
        else{
            this.notaAvaliacao = 0;
            return 0;
        }
    }

    public Gerente getGerenteFilial() {
        return this.gerenteFilial;
    }

    public void setGerenteFilial(Gerente gerenteFilial) {
        this.gerenteFilial = gerenteFilial;
    }
}
