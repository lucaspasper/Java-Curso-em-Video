package aulamensagens;

import java.util.Arrays;

/**
 *
 * @author lpaschoal
 */
public class Aluno {
    private int ra;
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private int periodoAtual;
    private boolean matriculado;
    private double media;
    private HistoricoDeDisciplina historicoDeDisciplinas[];

    public Aluno(String nome, int idade, String endereco, String telefone) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.matriculado = false;
        this.periodoAtual = 0;
    } 

    public HistoricoDeDisciplina[] getHistoricoDeDisciplinas() {return historicoDeDisciplinas;}
    public void setHistoricoDeDisciplinas(HistoricoDeDisciplina[] historicoDeDisciplinas) {
        this.historicoDeDisciplinas = historicoDeDisciplinas;
    }

    public int getRa() {return ra;}
    public void setRa(int ra) {this.ra = ra;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {this.endereco = endereco;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public int getPeriodoAtual() {return periodoAtual;}
    public void setPeriodoAtual(int periodoAtual) {this.periodoAtual = periodoAtual;}

    public boolean isMatriculado() {return matriculado;}
    public void setMatriculado(boolean matriculado) {this.matriculado = matriculado;}

    public double getMedia() {return media;}
    public void setMedia(double media) {this.media = media;}
    
    public void fazerAniversario(){
        this.setIdade(this.getIdade() +1);
    }
    
    public void fazerMatricula(Disciplina f){
        if (this.isMatriculado()){
            Disciplina d = new Disciplina();
            d.setSigla("POO");
            d.setNome("Programação Orientada a Objetos");
            d.setPeriodo(5);
        }
        System.out.println("Aluno não matriculado!!!");
    }
    
    public void calcularMedia(float media){
        
    }
    
    public void imprimirHistorico(){
        System.out.println(Arrays.toString(this.getHistoricoDeDisciplinas()));
    }
}
