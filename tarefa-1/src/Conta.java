public class Conta {
    
    private int nrConta;
    private double saldo;
    private Pessoa cliente;



    public Conta(int nrConta, double saldo, Pessoa cliente) {
        this.nrConta = nrConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }
    

    public int getNrConta() {
        return this.nrConta;
    }

    public void setNrConta(int nrConta) {
        this.nrConta = nrConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Pessoa getCliente() {
        return this.cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public void sacar(){

    }

    private void debitar(){

    }

    protected boolean temSaldo(){
        if(this.saldo > 0){
            return true;
        }else {
            return false;
        }
    }

    public void depositar(){

    }

    public void transferir(){
        
    }
    
}
