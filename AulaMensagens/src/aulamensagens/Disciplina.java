package aulamensagens;

/**
 *
 * @author lpaschoal
 */
public class Disciplina {
    private HistoricoDeDisciplina historicoDeDisciplina;
    private String sigla;
    private String nome;
    private int periodo;

    public String getSigla() {return sigla;}
    public void setSigla(String sigla) {this.sigla = sigla;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getPeriodo() {return periodo;}
    public void setPeriodo(int periodo) {this.periodo = periodo;}

    public HistoricoDeDisciplina getHistoricoDeDisciplina() {return historicoDeDisciplina;}
    public void setHistoricoDeDisciplina(HistoricoDeDisciplina historicoDeDisciplina) {
        this.historicoDeDisciplina = historicoDeDisciplina;
    }   
        
}
