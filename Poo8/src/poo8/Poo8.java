package poo8;

/**
 *
 * @author lpaschoal
 */
public class Poo8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumBanco(666);
        p1.setDono("Lucas");
        p1.abrirConta("CC");
        p1.depositar(350f);
        p1.depositar(678f);
        p1.sacar(800f);
        p1.sacar(278f);
        p1.fecharConta();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumBanco(2424);
        p2.setDono("Karen");
        p2.abrirConta("CP");
        p2.sacar(149f);
        p2.depositar(2562f);
        
        p1.varDump();
        p2.varDump();
    }
    
}
