package poo2;

/**
 *
 * @author lpaschoal
 */
public class Caneta {
    public String cor;
    public String modelo;
    private float ponta;
    private boolean tampada;
    protected int carga;
    
    public void status(){
        System.out.println("Modelo " + this.modelo);
        System.out.println("Cor " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Carga " + this.carga);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro, a caneta está tampada");
        } else {
            System.out.println("Estou rabiscando");
        }
            
    }
    public void tampada(){
        this.tampada = true;
    }
    
    public void destampada(){
        this.tampada = false;
    }
}

