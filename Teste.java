import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Teste {
    
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        List<Conta> contas = new ArrayList<>();
        while (true) {
            System.out.println("1. Cadastrar Conta Corrente.");
            System.out.println("2. Cadastrar Poupanca.");
            System.out.println("3. Verificar saldo");
            System.out.println("4. Efetuar saque");
            System.out.println("5. Atualizar");
            System.out.println("0. Sair");
            System.out.println(" Digite a opcao:");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Numero da conta:");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("CPF:");
                    String cpf = scanner.nextLine();

                    System.out.println("Taxa:");
                    double taxa = scanner.nextDouble();

                    System.out.println("Saldo:");
                    double saldo = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Banco:");
                    String nome = scanner.nextLine();

                    Corrente contaCorrente = new Corrente(numero, cpf, taxa, saldo, nome);
                    contas.add(contaCorrente);

                    break;

                case 2:
                    System.out.println("Numero da conta:");
                    int numero1 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("CPF:");
                    String cpf1 = scanner.nextLine();

                    System.out.println("Taxa:");
                    double taxa1 = scanner.nextDouble();

                    System.out.println("Saldo:");
                    double saldo1 = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Banco:");
                    String nome1 = scanner.nextLine();

                    Poupanca contaPoup = new Poupanca(numero1, cpf1, taxa1, saldo1, nome1);
                    contas.add(contaPoup);

                    break;

                case 3:
                    System.out.println("Numero da conta:");
                    int numero2 = scanner.nextInt();

                    for (Conta conta : contas) {
                        if (conta.getNumero() == numero2) {
                            System.out.println(conta.getSaldo());
                        }
                    }

                    break;

                case 4:
                    System.out.println("Numero da conta:");
                    int numero3 = scanner.nextInt();

                    for (Conta conta : contas) {
                        if (conta.getNumero() == numero3) {
                            System.out.println("Qual o valor do saque: ");
                            double valorSaque = scanner.nextDouble();

                            if (conta instanceof Corrente) {
                                System.out.println("Esta é uma Conta Corrente.");
                                System.out.println(conta.getSaldo() - conta.saque(valorSaque));

                            } else if (conta instanceof Poupanca) {
                                System.out.println("Esta é uma Conta Poupança.");
                                System.out.println(conta.getSaldo() - conta.saque(valorSaque));
                            }

                        } else {
                            System.out.println("Nenhuma conta cadastrada!");
                        }
                    }


                    break;

                case 5:
                    for (Conta conta : contas) {
                        System.out.println("Qual é a taxa:");
                        double taxa2 = scanner.nextDouble();

                        System.out.println("Atualizando...");
                        System.out.println(conta.atualizar(taxa2));
                    }
                    break;

                case 0:
                    return;
                default:
                    System.out.println("Digite novamente.");
                    break;
            }
        }
        
    }
}
