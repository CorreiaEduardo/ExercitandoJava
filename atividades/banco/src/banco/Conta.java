/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Eduardo C.
 */
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private String nomeDono;
    
    public Conta(int numero){
        this.numero = numero;
    }
    
    public Conta(int numero, double saldoInicial){
        this.numero = numero;
        this.saldo = saldoInicial;
    }
    
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getLimite() {
        return limite;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public String getNomeDono() {
        return nomeDono;
    }
    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    public boolean sacarDinheiro(double valor){
        if (this.getSaldo()+this.getLimite() >= valor) {
            this.saldo-=valor;
            return true;
        }
        return false;
    }
    public void depositarDinheiro(double valor){
        this.saldo +=valor;
    }
    public boolean transferirDinheiro(double valor, Conta destino){
        if (this.getSaldo()+this.getLimite() >= valor) {
            this.saldo-= valor;
            destino.saldo+=valor;
            return true;
        }
        return false;
    }



    
    
    
}
