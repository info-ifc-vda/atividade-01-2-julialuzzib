import java.util.Scanner;

public class NotaFiscal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 40): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        double precoUnitario = 0.0;
        double desconto = 0.0;

        if (codigoProduto >= 1 && codigoProduto <= 10) {
            precoUnitario = 10.00;
        } else if (codigoProduto >= 11 && codigoProduto <= 20) {
            precoUnitario = 15.00;
        } else if (codigoProduto >= 21 && codigoProduto <= 30) {
            precoUnitario = 20.00;
        } else if (codigoProduto >= 31 && codigoProduto <= 40) {
            precoUnitario = 40.00;
        } else {
            System.out.println("Código do produto inválido.");
            scanner.close();
            return;
        }

        double precoTotal = precoUnitario * quantidade;

        //desconto
        if (precoTotal <= 100) {
            desconto = precoTotal * 0.05; 
        } else if (precoTotal <= 200) {
            desconto = precoTotal * 0.10; 
        } else {
            desconto = precoTotal * 0.15; 
        }

        double precoFinal = precoTotal - desconto;

        //resultados
        System.out.printf("Preço unitário do produto: R$ %.2f%n", precoUnitario);
        System.out.printf("Preço total da nota: R$ %.2f%n", precoTotal);
        System.out.printf("Valor do desconto: R$ %.2f%n", desconto);
        System.out.printf("Preço final da nota após desconto: R$ %.2f%n", precoFinal);

        scanner.close();
    }
}
