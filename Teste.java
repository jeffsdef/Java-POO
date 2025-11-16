package exercicios.lista11;

import java.util.*;

public class Teste {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        List<ObjetoGeometrico> lista = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n--- MENU GERAL ---");
            System.out.println("1. Adicionar um Círculo");
            System.out.println("2. Adicionar um Retângulo");
            System.out.println("3. Calcular média das áreas");
            System.out.println("4. Calcular média dos perímetros");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scan.nextInt(); scan.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor de pi (use Math.PI se quiser precisão): ");
                    double pi = scan.nextDouble();
                    System.out.print("Digite o raio: ");
                    double raio = scan.nextDouble();
                    scan.nextLine();
                    Circulo c = new Circulo(raio, pi);
                    lista.add(c);
                    System.out.println("Círculo adicionado.");
                    break;

                case 2:
                    System.out.print("Digite a base: ");
                    double base = scan.nextDouble();
                    System.out.print("Digite a altura: ");
                    double altura = scan.nextDouble();
                    scan.nextLine();
                    Retangulo r = new Retangulo(base, altura);
                    lista.add(r);
                    System.out.println("Retângulo adicionado.");
                    break;

                case 3:
                    double mediaA = mediaAreas(lista);
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum objeto geométrico na lista.");
                    } else {
                        System.out.printf("Média das áreas: %.2f\n", mediaA);
                    }
                    break;

                case 4:
                    double mediaP = mediaPerimetros(lista);
                    if (lista.isEmpty()) {
                        System.out.println("Nenhum objeto geométrico na lista.");
                    } else {
                        System.out.printf("Média dos perímetros: %.2f\n", mediaP);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        } while (opcao != 0);

        scan.close();
    }

    public static double mediaAreas(List<ObjetoGeometrico> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double soma = 0.0;
        for (ObjetoGeometrico o : lista) soma += o.calcularArea();
        return soma / lista.size();
    }

    public static double mediaPerimetros(List<ObjetoGeometrico> lista) {
        if (lista == null || lista.isEmpty()) return 0.0;
        double soma = 0.0;
        for (ObjetoGeometrico o : lista) soma += o.calcularPerimetro();
        return soma / lista.size();
    }
}
