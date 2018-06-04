package execpoo;

/**
 *
 * @author lpaschoal
 */
public class ExecPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];
        
        p[0] = new Pessoa("Lucas", 26, "Masculino");
        p[1] = new Pessoa("Karen", 32, "Feminino");
        p[2] = new Pessoa("Rosa Maria", 54, "Feminino");
        
        l[0] = new Livro("O homem mais feliz da história", "Augusto Cury",
                         345, p[0]);
        l[1] = new Livro("Livro dos Espiritos", "Alan Kardec", 560, p[1]);
        l[2] = new Livro("Livro teste", "Alan Kardec", 300, p[2]);
        
        l[0].abrir();
        l[0].folhear(344);
        System.out.println(l[0].detalhes());
        System.out.println(l[1].detalhes());
    }
    
}
