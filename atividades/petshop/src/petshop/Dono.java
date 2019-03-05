/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.util.ArrayList;

/**
 *
 * @author Edu
 */
public class Dono {
    private String nome;
    private double distancia;
    private String telefone;
    private ArrayList<Entrega> entregas = new ArrayList<>();
    private ArrayList<Pet> petList = new ArrayList<>();
    
    public ArrayList<Pet> getPetList(){
        return petList;
    }
    
    public void addToPetList(Pet novoPet){
        petList.add(novoPet);
    }
    
    public ArrayList<Entrega> getEntregas(){
        return entregas;
    }
    
    public void addEntrega(Entrega novaEntrega){
        entregas.add(novaEntrega);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDistancia() {
        return distancia;
    }

    public boolean setDistancia(double distancia) {
        if(distancia > 35){
            return false;
        }
        this.distancia = distancia;
        return true;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
