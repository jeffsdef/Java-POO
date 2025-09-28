package exercicios.questao1;

import java.util.*;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        while (true){
            System.out.println("1. Adicionar funcionário.");
            System.out.println("2. Adicionar gerente.");                                               
            System.out.println("3. Obter salário (funcionário)");                                               
            System.out.println("4. Obter salário (gerente)");                                               
            System.out.println("0. SAIR.");
            System.out.print("Digite a opção: ");

            int opcao = scan.nextInt();
            scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome1 = scan.nextLine();

                    System.out.print("CPF: ");
                    String cpf1 = scan.nextLine();

                    System.out.print("Data de nascimento: ");
                    String dataNasc1 = scan.nextLine();

                    System.out.print("Salário: R$");
                    double salario1 = scan.nextInt();
                    scan.nextLine();

                    System.out.println("--- FUNCIONÁRIO CADASTRADO ---");

                    Funcionario funcionario = new Funcionario(nome1, cpf1, dataNasc1, salario1);
                    funcionarios.add(funcionario);
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nome2 = scan.nextLine();

                    System.out.print("CPF: ");
                    String cpf2 = scan.nextLine();

                    System.out.print("Data de nascimento: ");
                    String dataNasc2 = scan.nextLine();

                    System.out.print("Salário: R$");
                    double salario2 = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Departamento: ");
                    String departamento2 = scan.nextLine();

                    System.out.println("--- GERENTE CADASTRADO ---");

                    Gerente gerente = new Gerente(nome2, cpf2, dataNasc2, salario2, departamento2);
                    funcionarios.add(gerente);
                    break;

                case 3:
                    System.out.print("Digite o CPF: ");
                    String cpf3 = scan.nextLine();

                    for (Funcionario f : funcionarios) {
                        if (f.getCpf().equals(cpf3)) {
                            System.out.println("Salário: R$" + f.getSalario());
                        }
                    }
                    break;

                case 4:
                    System.out.print("Digite o CPF: ");
                    String cpf4 = scan.nextLine();

                    boolean gerenteEncontrado = false;
                    for (Funcionario f : funcionarios) {
                        if (f instanceof Gerente && f.getCpf().equals(cpf4)) {
                            System.out.println("Salário: R$" + f.getSalario());
                            gerenteEncontrado = true;
                            break;
                        }
                    }
                    if (!gerenteEncontrado) {
                        System.out.println("Gerente não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("--- SAINDO ---");
                    break;
            
                default:
                    break;
            }

        }
    }
}
