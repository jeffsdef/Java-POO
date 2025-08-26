import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo retangulo = null;
        int opcao;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1. Criar um retângulo");
            System.out.println("2. Calcular Área");
            System.out.println("3. Calcular Perímetro");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe a base do retângulo: ");
                    double base = entrada.nextDouble();
                    System.out.print("Informe a altura do retângulo: ");
                    double altura = entrada.nextDouble();
                    
                    retangulo = new Retangulo(base, altura);
                    System.out.println("Retângulo criado com sucesso!");
                    break;

                case 2:
                    if (retangulo != null) {
                        double area = retangulo.calcularArea();
                        System.out.println("A área do retângulo é: " + area);
                    } else {
                        System.out.println("Erro: Crie um retângulo primeiro (Opção 1).");
                    }
                    break;

                case 3:
                    if (retangulo != null) {
                        double perimetro = retangulo.calcularPerimetro();
                        System.out.println("O perímetro do retângulo é: " + perimetro);
                    } else {
                        System.out.println("Erro: Crie um retângulo primeiro (Opção 1).");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 0);

        entrada.close();
    }
}