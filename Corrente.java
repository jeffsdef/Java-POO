public class Corrente extends Conta {

    public Corrente(int numero, String cpf, double taxa, double saldo, String nome) {
        super(numero, cpf, taxa, saldo, nome);
    }

    @Override
    public double saque(double valorSacado){
        if(super.getSaldo() >= valorSacado){
            return valorSacado - 0.30;
        }
        return 0;
    }

}
