package poo2;

/**
 *
 * @author lpaschoal
 */
public class Poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.carga = 100;
        c1.ponta = 0.5f;
        c1.destampada();
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.carga = 50;
        c2.cor = "Vermelha";
        c2.modelo = "Compactor";
        c2.ponta = 0.7f;
        c2.destampada();
        c2.status();
        c2.rabiscar();
    }
   
}
