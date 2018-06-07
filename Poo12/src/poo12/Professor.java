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
public final class Professor extends Pessoa{
    private String especialidade;
    private float sal;
    
    public final void receberAumento(float aumento){
        this.setSal(this.getSal() + aumento);
    }
    
    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade = especialidade;}

    public float getSal() {return sal;}
    public void setSal(float sal) {this.sal = sal;}    
    
}
