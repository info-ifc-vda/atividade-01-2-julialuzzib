import java.util.Scanner;

public class Energia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: R$ ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite a quantidade de quilowatts consumida: ");
        double quilowattsConsumidos = scanner.nextDouble();

        double valorQuilowatt = salarioMinimo * 0.01;
        double valorTotal = valorQuilowatt * quilowattsConsumidos;

        //imprime
        System.out.printf("Valor de cada quilowatt: R$ %.2f%n", valorQuilowatt);
        System.out.printf("Valor a ser pago pela residência: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
