import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Cliente {
    String nome;
    String numeroConta;
    double saldo;

    Cliente(String nome, String numeroConta, double saldo) {
        this.nome = nome;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
}

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Cliente> clientes = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Consultar dados de um cliente");
            System.out.println("3. Verificar saldo");
            System.out.println("4. Efetuar saque da conta");
            System.out.println("5. Efetuar depósito na conta");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Número da conta: ");
                String numeroConta = sc.nextLine();
                System.out.print("Saldo inicial: ");
                double saldo = sc.nextDouble();
                clientes.add(new Cliente(nome, numeroConta, saldo));
            } else if (opcao == 2) {
                System.out.print("Digite o número da conta: ");
                String conta = sc.nextLine();
                for (Cliente c : clientes) {
                    if (c.numeroConta.equals(conta)) {
                        System.out.println("Nome: " + c.nome + ", Conta: " + c.numeroConta + ", Saldo: " + c.saldo);
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Digite o número da conta: ");
                String conta = sc.nextLine();
                for (Cliente c : clientes) {
                    if (c.numeroConta.equals(conta)) {
                        System.out.println("Saldo: " + c.saldo);
                    }
                }
            } else if (opcao == 4) {
                System.out.print("Digite o número da conta: ");
                String conta = sc.nextLine();
                for (Cliente c : clientes) {
                    if (c.numeroConta.equals(conta)) {
                        System.out.print("Valor do saque: ");
                        double saque = sc.nextDouble();
                        if (saque <= c.saldo) {
                            c.saldo -= saque;
                            System.out.println("Saque realizado. Novo saldo: " + c.saldo);
                        } else {
                            System.out.println("Saldo insuficiente.");
                        }
                    }
                }
            } else if (opcao == 5) {
                System.out.print("Digite o número da conta: ");
                String conta = sc.nextLine();
                for (Cliente c : clientes) {
                    if (c.numeroConta.equals(conta)) {
                        System.out.print("Valor do depósito: ");
                        double deposito = sc.nextDouble();
                        c.saldo += deposito;
                        System.out.println("Depósito realizado. Novo saldo: " + c.saldo);
                    }
                }
            }
        } while (opcao != 0);
        sc.close();
    }
}

