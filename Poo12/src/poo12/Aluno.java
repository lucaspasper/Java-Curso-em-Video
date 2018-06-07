/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo12;

/**
 *
 * @author lpaschoal
 */
public class Aluno extends Pessoa{
    private String matricula;
    private String curso;
    
    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.nome);
    }
    
    public String getMatricula(){return matricula;}
    public void setMatricula(String matricula){this.matricula = matricula;}
    
    public String getCurso(){return curso;}
    public void setCurso(String curso){this.curso = curso;}
}
