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
        c1.modelo = "BIC Cristal";
        c1.cor = "Azul";
        c1.carga = 100;
        //c1.ponta = 0.5f;
        c1.destampada();
        c1.status();
        c1.rabiscar();
    }
   
}
