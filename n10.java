import java.util.Scanner;

public class ContadorPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePrimos = 0;
        int totalNumeros = 10;

        System.out.println("Digite " + totalNumeros + " números inteiros:");

        for (int i = 0; i < totalNumeros; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();

            if (isPrimo(numero)) {
                quantidadePrimos++;
            }
        }

        System.out.println("Quantidade de numeros primos: " + quantidadePrimos);

        scanner.close();
    }

    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true; 
        }
        if (numero % 2 == 0) {
            return false; 
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
