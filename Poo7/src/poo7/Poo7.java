package poo7;

/**
 *
 * @author lpaschoal
 */
public class Poo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro l1 = new Livro("O PRÍNCIPE", "NICOLAU MAQUIAVEL", "WMF", "POLITICA/GUERRA", 
                "ITALIA", 1513, 250);
        l1.status();
        Livro l2 = new Livro("O HOMEM MAIS FELIZ DA HISTÓRIA", "AUGUSTO CURY", "SEXTANTE",
                "ROMANCE/AUTO-AJUDA", "BRASIL", 2018, 230);
        l2.status();
    }
    
}
