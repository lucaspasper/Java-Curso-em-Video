package poo8;

/**
 *
 * @author lpaschoal
 */
public class ContaBanco {
    //Atributos
    public int numBanco;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos especiais
    public void ContaBanco(float saldo, boolean status) {
        this.saldo = (saldo = 0f);
        this.status = (status = false);
    }


    public int getNumBanco() {return numBanco;}
    public void setNumBanco(int numBanco) {this.numBanco = numBanco;}

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public String getDono() {return dono;}
    public void setDono(String dono) {this.dono = dono;}

    public float getSaldo() {return saldo;}
    public void setSaldo(float saldo) {this.saldo = saldo;}

    public boolean isStatus() {return status;}
    public void setStatus(boolean status) {this.status = status;}
        
    //Métudos personalizados
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Não é possível fechar conta, saldo positivo");
        } else if (this.getSaldo() < 0){
            System.out.println("Não é possível fechar conta, saldo negativo");
        } else
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!!!");
    }
    
    public void depositar(float v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depositado na conta de " + this.getDono());
        } else{
            System.out.println("Impossível depositar em conta fechada!");
        }
    }
    
    public void sacar(float v){
        if (this.isStatus())
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado com sucesso na conta de " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque :(");
            }
        else {
            System.out.println("Imposível sacar de uma conta fechada!");
        }
    }
    
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())){
            v = 12;
        } else if ("CP".equals(this.getTipo())){            
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso po " + this.getDono());
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    
    public void varDump(){
        System.out.println("----------------");
        System.out.println("Numero conta: " + this.getNumBanco());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus() + "\n");
    }
}
