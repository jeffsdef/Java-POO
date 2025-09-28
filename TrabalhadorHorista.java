public class TrabalhadorHorista extends Trabalhador {
    private double valorHora;
    private int horasTrabalhadas;

    public TrabalhadorHorista(String nome, double salario, int matricula, int idade, String endereco, double valorHora, int horasTrabalhadas) {
        super(nome, salario, matricula, idade, endereco);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double getSalario() {
        return valorHora * horasTrabalhadas;
    }
    
}
