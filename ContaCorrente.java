package exercicios.lista13;

public class ContaCorrente extends Conta{
    public ContaCorrente(Cliente cliente, int numero, double taxa, double saldo){
        super(cliente, numero, taxa, saldo);
    }

    public void Atualizar(){
        super.Sacar(getTaxa());
    }
}
