public class TrabalhadorIntegral extends Trabalhador{   
    public TrabalhadorIntegral(String nome, double salario, int matricula, int idade, String endereco) {
        super(nome, salario, matricula, idade, endereco);
    }

    @Override
    public double getSalario() {
        if(getIdade() <= 30){
            return super.getSalario() * 1.16;
        } else {
            return super.getSalario() * 1.25;
        }
    }
}
