package aulamensagens;

/**
 *
 * @author lpaschoal
 */
public class HistoricoDeDisciplina {
    private int ano;
    private int semestre;
    private double nota;

    public HistoricoDeDisciplina(int ano, int semestre, double nota) {
        this.ano = ano;
        this.semestre = semestre;
        this.nota = nota;
    }
  
    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}

    public int getSemestre() {return semestre;}
    public void setSemestre(int semestre) {this.semestre = semestre;}

    public double getNota() {return nota;}
    public void setNota(double nota) {this.nota = nota;}
        
}
