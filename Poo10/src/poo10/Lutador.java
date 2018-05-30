/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo10;

/**
 *
 * @author lpaschoal
 */
public class Lutador {
    //Atributos 
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura, peso;
    private String categoria;
    private int vitorias, derrotas, empates;
    
    //Construtor
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    
    //Métodos especiais
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getNacionalidade() {return nacionalidade;}
    public void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}
    
    public float getAltura() {return altura;}
    public void setAltura(float altura) {this.altura = altura;}
    
    public float getPeso() {return peso;}
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria() {return categoria;}
    private void setCategoria() {
        if (this.peso < 52.2){
            this.categoria = "Inválido";
        } else if (this.peso <= 70.3){
            this.categoria = "Peso Leve";
        } else if (this.peso <= 83.9){
            this.categoria = "Peso Médio";
        } else if (this.peso <= 120.2){
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    
    public int getVitorias() {return vitorias;}
    public void setVitorias(int vitorias) {this.vitorias = vitorias;}
    
    public int getDerrotas() {return derrotas;}
    public void setDerrotas(int derrotas) {this.derrotas = derrotas;}
    
    public int getEmpates() {return empates;}
    public void setEmpates(int empates) {this.empates = empates;}
   
    //Métodos personalizados
    public void apresentar(){
        System.out.println("---------------------------------");
        System.out.println("CHEGOU a hora de apresentar o lutador " + this.getNome());
        System.out.println("Diretamente de " + this.getNacionalidade());
        System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + "M de altura");
        System.out.println("Pesando " + this.getPeso() + "kg");
        System.out.println(this.getVitorias() + " vitórias!");
        System.out.println(this.getDerrotas() + " derrotas!");
        System.out.println(this.getEmpates() + " empates!");        
    }
    
    public void status(){
        System.out.println(this.getNome() + " é um peso " + this.categoria);
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpates() + " vezes");        
    }
    
    public void ganharLuta(){
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas() + 1);
    }
    
    public void empatarLuta(){
        this.setEmpates(this.getEmpates() + 1);
    }
}
