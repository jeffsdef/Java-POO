package exercicios.questao1;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario (String nome, String cpf, String dataNasc, double salario){
        super(nome, cpf, dataNasc);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
