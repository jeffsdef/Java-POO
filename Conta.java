import org.w3c.dom.ls.LSOutput;

public class Conta {
    private int numero;
    private String cpf;
    private double taxa;
    private double saldo;
    private String nome;

    public Conta(int numero, String cpf, double taxa, double saldo, String nome) {
        this.numero = numero;
        this.cpf = cpf;
        this.taxa = taxa;
        this.saldo = saldo;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double atualizar(double taxa){
        return this.saldo - this.taxa * this.saldo;
    }

    public double saque(double valorSacado){
        if(this.saldo >= valorSacado){
            return valorSacado;
        }
        return 0;
    }

    public double deposito(double valorDeposito){
        return this.saldo + valorDeposito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
