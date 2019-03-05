/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notasalunos;

/**
 *
 * @author Edu
 */
public class Aluno {
    private String nome;
    private float nota;

    public Aluno(){
    
    }
    
    public Aluno(String nome, float nota) {
        this.nome = nome;
        this.nota = nota;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
