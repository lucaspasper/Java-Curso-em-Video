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
public final class Bolsista extends Aluno {
    private float bolsa;
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa");
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista. Pagando com desconto!");  
    }
    
    public float getBolsa(){return bolsa;}
    public void setBolsa(float bolsa){this.bolsa = bolsa;}
}
