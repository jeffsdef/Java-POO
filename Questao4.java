import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Produto {
    String nome;
    String codigo;
    double preco;
    int quantidade;

    Produto(String nome, String codigo, double preco, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1. Cadastrar produto");
            System.out.println("2. Buscar Produto");
            System.out.println("3. Listar todos os produtos disponíveis");
            System.out.println("4. Efetuar venda de um produto");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Nome: ");
                String nome = sc.nextLine();
                System.out.print("Código: ");
                String codigo = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                System.out.print("Quantidade: ");
                int quantidade = sc.nextInt();
                produtos.add(new Produto(nome, codigo, preco, quantidade));
            } else if (opcao == 2) {
                System.out.print("Digite o nome do produto: ");
                String nome = sc.nextLine();
                for (Produto p : produtos) {
                    if (p.nome.equalsIgnoreCase(nome)) {
                        System.out.println("Nome: " + p.nome + ", Código: " + p.codigo + ", Preço: " + p.preco + ", Quantidade: " + p.quantidade);
                    }
                }
            } else if (opcao == 3) {
                for (Produto p : produtos) {
                    System.out.println("Nome: " + p.nome + ", Código: " + p.codigo + ", Preço: " + p.preco + ", Quantidade: " + p.quantidade);
                }
            } else if (opcao == 4) {
                System.out.print("Digite o nome do produto: ");
                String nome = sc.nextLine();
                for (Produto p : produtos) {
                    if (p.nome.equalsIgnoreCase(nome)) {
                        System.out.print("Quantidade a vender: ");
                        int qtd = sc.nextInt();
                        if (qtd <= p.quantidade) {
                            p.quantidade -= qtd;
                            System.out.println("Venda realizada. Estoque atualizado: " + p.quantidade);
                        } else {
                            System.out.println("Estoque insuficiente.");
                        }
                    }
                }
            }
        } while (opcao != 0);
        sc.close();
    }
}

