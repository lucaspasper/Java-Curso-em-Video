package poo3;

/**
 *
 * @author lpaschoal
 */
public class Livro {
    String tipoCapa;
    String titulo;
    String autor;
    String editora;
    int ano, pag;
    String genero;
    boolean fechado;
    
    void status(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Editora: " + this.editora);
        System.out.println("Genero: " + this.genero);
        System.out.println("Tipo de capa: " + this.tipoCapa);
        System.out.println("Ano e nº pág: " + this.ano + this.pag);
        System.out.println("O livro está fechado?: " + this.fechado);
    }
    
    void abrir(){
        if(this.fechado == true){
            this.fechado = false;
        } else{
            System.out.println("Livro já está aberto para ler");
        }
        
    }
    
    void fechar(){
        if(this.fechado == false){
            this.fechado = true;
            System.out.println("Obrigado por ler, não esqueça de cuidar bem do seu livro!!! :)");
        } else{
            System.out.println("Livro já fechado!");
        }
    }
    
    void ler(){
        if(this.fechado == true){
            this.abrir();
            System.out.println("Boa leitura, sua escolha para o livro " + this.titulo +" é ótima");
        } else {
            System.out.println("Boa leitura, sua escolha para o livro " + this.titulo +" é ótima");
        }
    }
    
    void marcar(){
        
    }
}
