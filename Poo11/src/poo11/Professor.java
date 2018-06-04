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
public class Professor {
    private String especialidade;
    private float sal;
    
    public void aumSal(float aumSal){
       this.setSal(this.getSal() + aumSal);
    }
    public String getEspecialidade(){return especialidade;}
    public void setEspecialidade(String especialidade){this.especialidade = especialidade;}
    
    public float getSal(){return sal;}
    public void setSal(float sal){this.sal = sal;}
}
