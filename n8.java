import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //cedulas
        int[] cedulas = {100, 50, 20, 10, 5, 2, 1};

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = scanner.nextDouble();
        
        System.out.print("Digite o valor pago: R$ ");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorCompra) {
            System.out.println("O valor pago é insuficiente.");
        } else {
            double troco = valorPago - valorCompra;
            System.out.printf("O troco a ser dado é: R$ %.2f\n", troco);
            calcularTroco(troco, cedulas);
        }

        scanner.close();
    }

    public static void calcularTroco(double troco, int[] cedulas) {
        int valorTroco = (int) Math.round(troco); //proxima

        System.out.println("Cédulas necessárias para o troco:");
        for (int cedula : cedulas) {
            int quantidade = valorTroco / cedula;
            if (quantidade > 0) {
                System.out.println(quantidade + " cédula(s) de R$ " + cedula);
                valorTroco %= cedula;
            }
        }
    }
}
