package poo13;

/**
 *
 * @author lpaschoal
 */
public class Poo13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula de POO");
        v[1] = new Video("Aula de PW3");
        v[2] = new Video("Aula de SO2");
        
        Gafanhoto g[] = new Gafanhoto[3];
        g[0] = new Gafanhoto("Thiago", 30, "M", "thipaschoal");
        g[1] = new Gafanhoto("Marcela", 28, "F", "marcelinha");
        g[2] = new Gafanhoto("Lucas", 26, "M", "lpaschoal");
        
        /*System.out.println("---VIDEOS---");
        System.out.println("------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("---GAFANHOTOS---");
        System.out.println("----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());
        System.out.println(g[2].toString());*/
        
        Visualizacao vi[] = new Visualizacao[5];
        vi[0] = new Visualizacao(g[0], v[0]);
        vi[1] = new Visualizacao(g[0], v[2]);
        vi[2] = new Visualizacao(g[1], v[1]);
        vi[3] = new Visualizacao(g[2], v[2]);
        vi[4] = new Visualizacao(g[2], v[0]);
        
        vi[2].avaliar();
        vi[0].avaliar();
        System.out.println(vi[0].toString());
        System.out.println(vi[2].toString());
    }   
}
