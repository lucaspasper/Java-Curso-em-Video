/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo11;

/**
 *
 * @author lpaschoal
 */
public class Aluno {
    private String matricula;
    private String curso;
    
    public void cancelarMatricula(){
        System.out.println("Cancelando matricula!...");
    }
    public String getMatricula(){return matricula;}
    public void setMatricula(String matricula) {this.matricula = matricula;}
    
    public String getCurso(){return curso;}
    public void setCurso(String curso){this.curso = curso;}
}
