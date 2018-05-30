package poo7;

/**
 *
 * @author lpaschoal
 */
public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private String genero;
    private String nacionalidade;
    private int ano;
    private int paginas;
    private boolean fechado;

    public Livro(String titulo, String autor, String editora, String genero, String nacionalidade, int ano, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.ano = ano;
        this.paginas = paginas;
    }

    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}

    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}

    public String getEditora() {return editora;}
    public void setEditora(String editora) {this.editora = editora;}

    public String getGenero() {return genero;}
    public void setGenero(String genero) {this.genero = genero;}
    
    public String getNacionalidade() {return nacionalidade;}
    public void setNacionalidade(String nacionalidade) {this.nacionalidade = nacionalidade;}

    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public int getPaginas() {return paginas;}
    public void setPaginas(int paginas) {this.paginas = paginas;}

    public boolean isFechado() {return fechado;}
    public void setFechado(boolean fechado) {this.fechado = fechado;}
    
    public void abri(){
        
    }
    
    public void fechar(){
        
    }
    
    public void ler(){
        
    }
    
    public void status(){
        System.out.println("TITULO: " + this.getTitulo());
        System.out.println("AUTOR: " + this.getAutor());
        System.out.println("EDITORA: " + this.getEditora());
        System.out.println("ANO: " + this.getAno());
        System.out.println("GENERO: " + this.getGenero());
        System.out.println("PAGINAS: " + this.getPaginas());
        System.out.println("NACIONALIDADE: " + this.getNacionalidade()+"\n");
    }
}
