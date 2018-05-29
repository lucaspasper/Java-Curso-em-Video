package poo3;

/**
 *
 * @author lpaschoal
 */
public class Poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l1 = new Livro();
        l1.autor = "Augusto Cury";
        l1.titulo = "O homem mais feliz da história";
        l1.ano = 2017;
        l1.editora = "Sextante";
        l1.tipoCapa = "Dura";
        l1.pag = 340;
        l1.genero = "Romance - Auto Ajuda";
        l1.abrir();
        l1.ler();
        //l1.status();
        l1.fechar();
    }
    
}
