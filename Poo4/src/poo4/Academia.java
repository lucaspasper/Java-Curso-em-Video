package poo4;

/**
 *
 * @author lpaschoal
 */
public class Academia {
    String endereco;
    String nomeAcademia;
    String tempoTreino;
    int diasTreino;
    String tipoExercicio;
    boolean treinar;    
    
    void status(){
        System.out.println("Local da academia: " + this.endereco);
        System.out.println("Nome da academia: " + this.nomeAcademia);
        System.out.println("Tempo de treino: " + this.tempoTreino);
        System.out.println("Dias que serão treinados: " + this.diasTreino);
        System.out.println("Tipo de treino selecionado: " + this.tipoExercicio);
    }
    
    void trinar(){
        
    }
    
    void cancelar(){
        
    }
    
}