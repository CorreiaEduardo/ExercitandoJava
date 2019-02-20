/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadecelular;

/**
 *
 * @author Edu
 */
public class Celular {
    private double preco;
    private String modelo;
    private String marca;
    private int armazenamento;

    public Celular(double preco, String modelo, String marca, int armazenamento){
        this.armazenamento = armazenamento;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
    }
    
        public Celular(String modelo, String marca, int armazenamento){
        this.armazenamento = armazenamento;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public boolean alterarPreço(double novoPreco){
        this.preco = novoPreco;
        return true;
        
    }
    
    
    public double getPreco() {
        return preco;
    }


    public String getModelo() {
        return modelo;
    }


    public String getMarca() {
        return marca;
    }


    public int getArmazenamento() {
        return armazenamento;
    }
    
}
