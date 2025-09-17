import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Livro {
    String autor;
    String editora;
    String isbn;
    String titulo;
    int anoEdicao;

    Livro(String autor, String editora, String isbn, String titulo, int anoEdicao) {
        this.autor = autor;
        this.editora = editora;
        this.isbn = isbn;
        this.titulo = titulo;
        this.anoEdicao = anoEdicao;
    }
}

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Buscar livro por título");
            System.out.println("3. Listar livros por autor");
            System.out.println("4. Listar todos os livros disponíveis");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 1) {
                System.out.print("Autor: ");
                String autor = sc.nextLine();
                System.out.print("Editora: ");
                String editora = sc.nextLine();
                System.out.print("ISBN: ");
                String isbn = sc.nextLine();
                System.out.print("Título: ");
                String titulo = sc.nextLine();
                System.out.print("Ano de edição: ");
                int ano = sc.nextInt();
                livros.add(new Livro(autor, editora, isbn, titulo, ano));
            } else if (opcao == 2) {
                System.out.print("Digite o título: ");
                String titulo = sc.nextLine();
                for (Livro l : livros) {
                    if (l.titulo.equalsIgnoreCase(titulo)) {
                        System.out.println("Título: " + l.titulo + ", Autor: " + l.autor + ", Editora: " + l.editora + ", ISBN: " + l.isbn + ", Ano: " + l.anoEdicao);
                    }
                }
            } else if (opcao == 3) {
                System.out.print("Digite o autor: ");
                String autor = sc.nextLine();
                for (Livro l : livros) {
                    if (l.autor.equalsIgnoreCase(autor)) {
                        System.out.println("Título: " + l.titulo + ", Editora: " + l.editora + ", ISBN: " + l.isbn + ", Ano: " + l.anoEdicao);
                    }
                }
            } else if (opcao == 4) {
                for (Livro l : livros) {
                    System.out.println("Título: " + l.titulo + ", Autor: " + l.autor + ", Editora: " + l.editora + ", ISBN: " + l.isbn + ", Ano: " + l.anoEdicao);
                }
            }
        } while (opcao != 0);
        sc.close();
    }
}
