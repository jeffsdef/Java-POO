import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in); 
       List<Trabalhador> trabalhadores = new ArrayList<>();
        while (true){
            System.out.println("1. Cadastrar Trabalhador Integral.");
            System.out.println("2. Cadastrar Trabalhador Horista.");
            System.out.println("3. Obter salario.");
            System.out.println("4. Obter dados do trabalhador.");
            System.out.println("5. Obter maior salario (entre INTEGRAIS).");
            System.out.println("6. Obter maior salario (entre HORISTAS).");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Nome: ");
                    String nome1 = scanner.nextLine();

                    System.out.println("Salario: ");
                    double salario1 = scanner.nextDouble();

                    System.out.println("Matricula: ");
                    int matricula1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Idade: ");
                    int idade1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Endereco: ");
                    String endereco1 = scanner.nextLine();

                    TrabalhadorIntegral trabalhadorIntegral = new TrabalhadorIntegral(nome1, salario1, matricula1, idade1, endereco1);
                    trabalhadores.add(trabalhadorIntegral);

                    break;

                case 2:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Salario: ");
                    double salario = scanner.nextDouble();

                    System.out.println("Matricula: ");
                    int matricula2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Idade: ");
                    int idade2 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Endereco: ");
                    String endereco2 = scanner.nextLine();

                    System.out.println("Valor por hora: ");
                    double valorHora = scanner.nextDouble();

                    System.out.println("Horas trabalhadas: ");
                    int horasTrabalhadas = scanner.nextInt();
                    scanner.nextLine();

                    TrabalhadorHorista trabalhadorHorista = new TrabalhadorHorista(nome, salario, matricula2, idade2, endereco2, valorHora, horasTrabalhadas);
                    trabalhadores.add(trabalhadorHorista);

                    break;

                case 3:
                   System.out.print("Informe a matrícula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    for (Trabalhador t : trabalhadores) {
                        if (t.getMatricula() == matricula) {
                            System.out.println("Salário: R$" + String.format("%.2f", t.getSalario()));
                            return;
                        }
                    }
                    System.out.println("Trabalhador não encontrado.");

                    break;

                case 4:
                    System.out.print("Informe a matrícula: ");
                    int matriculaT = scanner.nextInt();
                    scanner.nextLine();
                    for (Trabalhador t : trabalhadores) {
                        if (t.getMatricula() == matriculaT) {
                            System.out.println(t.getDados());
                            return;
                        }
                    }
                    System.out.println("Trabalhador não encontrado.");
                    break;

                case 5:
                    double maior = 0;
                    String nomeMaior = null;
                    for (Trabalhador t : trabalhadores) {
                        if (t instanceof TrabalhadorIntegral) {
                            if (t.getSalario() > maior) {
                                maior = t.getSalario();
                                nomeMaior = t.getNome();
                            }
                        }
                    }
                    if (nomeMaior != null) {
                        System.out.println("Maior salário entre trabalhadores integrais: " + nomeMaior + " : R$" + String.format("%.2f", maior));
                    } else {
                        System.out.println("Nenhum trabalhador integral cadastrado.");
                    }
                    break;

                case 6:
                    double maiorH = 0;
                    String nomeMaiorH = null;
                    for (Trabalhador t : trabalhadores) {
                        if (t instanceof TrabalhadorHorista) {
                            if (t.getSalario() > maiorH) {
                                maiorH = t.getSalario();
                                nomeMaiorH = t.getNome();
                            }
                        }
                    }
                    if(nomeMaiorH != null){
                        System.out.println("Maior salário entre trabalhadores horistas: " + nomeMaiorH + " : R$" + String.format("%.2f", maiorH));
                    } else {
                        System.out.println("Nenhum trabalhador horista cadastrado.");
                    }
                    break;
            
                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    break;
            }
        }
    }
}
