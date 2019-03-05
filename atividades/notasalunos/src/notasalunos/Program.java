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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[30];
        Aluno aluno1 = new Aluno("Rodiney",7);
        Aluno aluno2 = new Aluno("Claudio",8);
        Aluno aluno3 = new Aluno("Joao",5);
        Aluno aluno4 = new Aluno("Maria",9);
        Aluno aluno5 = new Aluno("Ana",6);
        alunos[0] = aluno1;
        alunos[1] = aluno2;
        alunos[2] = aluno3;
        alunos[3] = aluno4;
        alunos[4] = aluno5;
        for (int i = 0; i < 5; i++) {
            System.out.println("O(a) aluno(a) "+alunos[i].getNome()+" obteve a nota "+alunos[i].getNota()+".");
        }
    }
    
}
