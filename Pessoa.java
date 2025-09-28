package exercicios.questao1;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dataNasc;

    public Pessoa(String nome, String cpf, String dataNasc){
        nome = this.nome;
        cpf = this.cpf;
        dataNasc = this.dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    
    public String getDataNasc() {
        return dataNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
}
