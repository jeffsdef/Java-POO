public class Poupanca extends Conta{
    public Poupanca(int numero, String cpf, double taxa, double saldo, String nome) {
        super(numero, cpf, taxa, saldo, nome);
    }

    @Override
    public double atualizar(double taxa) {
        return super.getSaldo() + super.getTaxa() * super.getSaldo();
    }
}
