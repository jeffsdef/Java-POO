public class Trabalhador {
    private String nome;
    private double salario;
    private int matricula;
    private int idade;
    private String endereco;
    
    public Trabalhador(String nome, double salario, int matricula, int idade, String endereco) {
        this.nome = nome;
        this.salario = salario;
        this.matricula = matricula;
        this.idade = idade;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDados() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Salário: " + salario;
    }
}