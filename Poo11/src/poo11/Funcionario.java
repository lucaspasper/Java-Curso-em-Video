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
public class Funcionario {
    private String setor;
    private boolean trabalhando;
    
    public void mudarTrabalho(){
        //this.setTrabalhando(!(this.isTrabalhando()));
        this.trabalhando = ! this.trabalhando;
    }
    
    public String getSetor(){return setor;}
    public void setSetor(String setor){this.setor = setor;}
    
    public boolean isTrabalhando(){return trabalhando;}
    public void setTrabalhando(boolean trabalhando){this.trabalhando = trabalhando;}
}
