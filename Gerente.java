package exercicios.questao1;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente (String nome,  String cpf, String dataNasc, double salario, String departamento){
        super(nome, cpf, dataNasc, salario);
        this.departamento = departamento;
    }

    public String getDepartamento(){
        return departamento;
    }

    public void setDepartamento (String departamento){
        this.departamento = departamento;
    }

    @Override
    public double getSalario(){
        return this.getSalario() + 1500;
    }
}
