import java.util.Calendar;
import java.util.Date;

public class PessoaFisica extends Pessoa {

    private int cpf;
    private Calendar dtNascimento;
    private String genero;

    public PessoaFisica(int id, String nome, String endereco, int cpf, Calendar dtNascimento, String genero) {
        super(id, nome, endereco);
        this.cpf = cpf;
        this.dtNascimento = dtNascimento;
        this.genero = genero;
    }


    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Calendar getDtNascimento() {
        return this.dtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void getIdade(){
        Date data = new Date();
    }

}

