package poo6;

/**
 *
 * @author lpaschoal
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public float getPonta() {return ponta;}
    public void setPonta(float ponta) {this.ponta = ponta;}

    public String getCor() {return cor;}
    public void setCor(String cor) {this.cor = cor;}

    public boolean isTampada() {return tampada;}
    public void setTampada(boolean tampada) {this.tampada = tampada;}
    
    public void tampar(){
        if(this.tampada == false){
            this.tampada = true;
            System.out.println("TAMPADA COM SUCESSO!!");
        } else{
            System.out.println("CANETA JÁ TAMPADA");
        }            
    }
    
    public void destampar(){
        if(this.tampada == true){
            this.tampada = false;
            System.out.println("PRONTO PARA RABISCAR");
        } else{
            System.out.println("CANETA JÁ ESTAVA DESTAMPADA");
        }
    }
    
    public void rabiscar(){
        if(this.tampada == false){
            System.out.println("VAMOS RABISCAR");
        } else{
            System.out.println("ERRO AO RABISCAR!!");
        }
    }
    
    public void status(){
        System.out.println("MARCA: " + this.getModelo());
        System.out.println("COR: " + this.getCor());
        System.out.println("PONTA: " + this.getPonta());
    }
}
