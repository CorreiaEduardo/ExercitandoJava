/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

/**
 *
 * @author Edu
 */
public class Entrega {
    private double valor;
    private Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public double getValor() {
        return valor;
    }
    
    public void calculaPreço(){
        double distancia = this.pet.getDono().getDistancia();
        if(distancia >= 0 && distancia <= 5){
            this.valor = 10;
        }
        else if(distancia >5 && distancia <= 15){
            this.valor = 20;
        }
        else if(distancia > 15){
            this.valor = 50;
        } 
    }
}
