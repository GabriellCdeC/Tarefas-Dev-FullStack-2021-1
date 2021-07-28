public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int nrConta, double saldo, Pessoa cliente, double limite){
        super(nrConta, saldo, cliente);
        this.limite = limite;
    }


    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    protected boolean temSaldo(){
        if(super.getSaldo() + this.limite > 0){
            return true;
        }else {
            return false;
        }
    }

    public void abrirConta(){

    }

}
