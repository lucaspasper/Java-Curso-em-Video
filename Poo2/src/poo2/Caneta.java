package poo2;

/**
 *
 * @author lpaschoal
 */
public class Caneta {
    String cor;
    String modelo;
    float ponta;
    boolean tampada;
    int carga;
    
    void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga " + this.carga);
    }
    
    void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, a caneta está tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
            
    }
    void tampada(){
        this.tampada = true;
    }
    
    void destampada(){
        this.tampada = false;
    }
}

