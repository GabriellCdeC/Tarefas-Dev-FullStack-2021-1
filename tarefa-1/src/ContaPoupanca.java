public class ContaPoupanca extends Conta {
    private double txCorrecao;

    public ContaPoupanca(int nrConta, double saldo, Pessoa cliente, double txCorrecao){
        super(nrConta, saldo, cliente);
        this.txCorrecao = txCorrecao;
    }

    public double getTxCorrecao() {
        return this.txCorrecao;
    }

    public void setTxCorrecao(double txCorrecao) {
        this.txCorrecao = txCorrecao;
    }

    public void atualizaSaldoRendimento(){

    }

    public void abrirConta(){

    }

}
