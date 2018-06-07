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
public final class Tecnico extends Aluno {
    private String regProfissional;
    
    public final void praticar(){
        System.out.println("Estou praticando!!!");
    }

    public String getRegProfissional() {return regProfissional;}
    public void setRegProfissional(String regProfissional) {this.regProfissional = regProfissional;}
    
}

