/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetoaluno;

/**
 *
 * @author lpaschoal
 */
public class ProjetoAluno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a[] = new Aluno[10];
        
        a[0] = new Aluno("Lucas", "Paschoal Perpétuo", 88376, "Sistemas", 1f);
        a[0].fazerProva();
        a[0].status();
    }
    
}
