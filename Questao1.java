import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Estudante {
    String nome;
    String matricula;
    String endereco;
    double nota1;
    double nota2;

    Estudante(String nome, String matricula, String endereco, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    double media() {
        return (nota1 + nota2) / 2;
    }
}

public class Questao1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudante> estudantes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1. Cadastrar um estudante");
            System.out.println("2. Calcular média de um estudante");
            System.out.println("3. Consultar matrícula de um estudante");
            System.out.println("4. Consultar endereço de um estudante");
            System.out.println("5. Calcular a média da turma");
            System.out.println("6. Exibir os nomes dos estudantes reprovados");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Matrícula: ");
                String matricula = sc.nextLine();
                System.out.print("Endereço: ");
                String endereco = sc.nextLine();
                System.out.print("Nota 1: ");
                double nota1 = sc.nextDouble();
                System.out.print("Nota 2: ");
                double nota2 = sc.nextDouble();
                estudantes.add(new Estudante(nome, matricula, endereco, nota1, nota2));
            } else if (opcao == 2) {
                System.out.print("Digite a matrícula: ");
                String matricula = sc.nextLine();
                for (Estudante e : estudantes) {
                    if (e.matricula.equals(matricula)) {
                        System.out.println("Média: " + e.media());
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                for (Estudante e : estudantes) {
                    if (e.nome.equalsIgnoreCase(nome)) {
                        System.out.println("Matrícula: " + e.matricula);
                    }
                }
            } else if (opcao == 4) {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();
                for (Estudante e : estudantes) {
                    if (e.nome.equalsIgnoreCase(nome)) {
                        System.out.println("Endereço: " + e.endereco);
                    }
                }
            } else if (opcao == 5) {
                double soma = 0;
                for (Estudante e : estudantes) soma += e.media();
                if (!estudantes.isEmpty())
                    System.out.println("Média da turma: " + soma / estudantes.size());
            } else if (opcao == 6) {
                for (Estudante e : estudantes) {
                    if (e.media() < 6) System.out.println(e.nome);
                }
            }
        } while (opcao != 0);
        sc.close();
    }
}
