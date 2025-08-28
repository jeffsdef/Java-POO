import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Circulo circulo = null;
        int opcao;

        do{
            System.out.println("\n --- MENU DE OPÇÕES ---");
            System.out.println("1. Criar um círculo");
            System.out.println("2. Calcular área.");
            System.out.println("3. Calcular perímetro");
            System.out.println("0. Sair.");
            System.out.print("Escolha uma opção: ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Informe o valor de r (raio): ");
                    double r = entrada.nextDouble();

                    circulo = new Circulo(r);
                    System.out.println("Circulo criado com sucesso!");
                    break;

                case 2:
                    if(circulo != null){
                        double Area = circulo.Area();
                        System.out.println("A área do círculo é: " + Area);
                    }else{
                        System.out.println("ERRO! Crie um círculo primeiro.");
                    }
                    break;
                
                case 3:
                    if(circulo != null){
                        double Perimetro = circulo.Perimetro();
                        System.out.println("O perímetro do círculo é: " + Perimetro);
                    }else{
                        System.out.println("ERRO! Crie um círculo primeiro.");
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

        entrada.close();
    }
}
