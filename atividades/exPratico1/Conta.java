/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expratico;

/**
 *
 * @author Eduardo C.
 */
public class Conta {
    int numero;
    double saldo;
    double limite;
    String nomeDono;
    
    public boolean sacarDinheiro(double valor){
        if (this.saldo+this.limite >= valor) {
            return true;
        }
        return false;
    }
    public void depositarDinheiro(double valor){
        this.saldo +=valor;
    }
    public boolean transferirDinheiro(double valor, Conta destino){
        if (this.saldo+this.limite >= valor) {
            this.saldo-= valor;
            destino.saldo+=valor;
            return true;
        }
        return false;
    }
    
    
    
}
