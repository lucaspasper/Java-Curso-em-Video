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
public class Poo12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pessoa p1 = new Pessoa();
        Visitante v1 = new Visitante();
        v1.setNome("Lucas Paschoal");
        v1.setIdade(26);
        v1.setSexo("M");
        v1.fazerAniversario();
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Rodrigo");
        a1.setIdade(27);
        a1.setSexo("M");
        a1.setCurso("Arquitetura");
        a1.pagarMensalidade();
        System.out.println(a1.toString());
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Itamar");
        b1.setIdade(27);
        b1.setSexo("M");
        b1.renovarBolsa();
        b1.pagarMensalidade();
        System.out.println(b1.toString());
        
        Professor p1 = new Professor();
        p1.setNome("Ivanovisk");
        p1.setIdade(60);
        p1.setSexo("M");
        p1.setEspecialidade("Todas");
        p1.setSal(4000f);
        System.out.println(p1.toString());
    }
    
}
