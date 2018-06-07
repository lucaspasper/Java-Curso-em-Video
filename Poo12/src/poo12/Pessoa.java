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
public abstract class Pessoa{
    protected String nome;
    protected int idade;
    protected String sexo;
    private Aluno aluno;
    
    public final void fazerAniversario(){
        this.setIdade(this.getIdade() + 1);
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    
    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getSexo() {return sexo;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    
    public Aluno getAluno(){return aluno;}
    public void setAluno(Aluno aluno){this.aluno = aluno;}

    @Override
    public String toString() {
        return "Dados: " + "nome=" + nome + ", idade=" + idade + /*aluno.getCurso()
               */", sexo=" + sexo + "\n=============" + ' ';
    }
    
    
    
}
