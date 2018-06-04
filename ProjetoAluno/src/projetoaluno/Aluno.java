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
public class Aluno implements IAluno{
    //Atributos
    private String nome;
    private String sobrenome;
    private int ra;
    private String curso;
    private float nota;
    private boolean prova;
    private String situacao;
    
    //Construtor

    public Aluno(String nome,String sobrenome, int ra, String curso, float nota) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.ra = ra;
        this.curso = curso;
        this.setNota(nota);
    }
    //Métodos Getters and Setters
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    
    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public int getRa() {return ra;}
    public void setRa(int ra) {this.ra = ra;}

    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso = curso;}

    public float getNota() {return nota;}
    public void setNota(float nota) {
        this.nota = nota;
        this.setSituacao();
    }

    public boolean isProva() {return prova;}
    public void setProva(boolean prova) {this.prova = prova;}

    public String getSituacao() {return situacao;}
    private void setSituacao() {
       // if (this.isProva()){  
            if (this.nota < 3){
                this.situacao = "Reprovado";
            } else if (this.nota < 5){
                this.situacao = "RE";
            } else if (this.nota < 10){
                this.situacao = "Aprovado";
            } else{
                this.situacao = "Aprovado com honras";
            }
       // } else {
       //   System.out.println("Falta fazer a prova");
        
    }

    //Métodos personalizados
    @Override
    public void inscrever() {
    }

    @Override
    public void trancar() {

    }

    @Override
    public void fazerProva() {
        this.setProva(true);
    }

    @Override
    public void presenca() {
    }
    
    @Override
    public void status(){
        System.out.println("------------");
        System.out.println("Bem-vindo ao curso de " + this.curso + " " + this.nome + " " + this.sobrenome);
        System.out.println("Você está: " + this.getSituacao());
    }
}
