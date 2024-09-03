import java.util.Scanner;

public class FatoriaisIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int numero2 = scanner.nextInt();

        //menor e maior
        int inicio = Math.min(numero1, numero2);
        int fim = Math.max(numero1, numero2);

        System.out.println("Fatoriais dos números no intervalo de " + inicio + " a " + fim + ":");

        //fatorial de cada n
        for (int i = inicio; i <= fim; i++) {
            System.out.println("Número: " + i + " | Fatorial: " + calcularFatorial(i));
        }

        scanner.close();
    }

    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return 0; //nao tem fatorial para n neg
        }
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}
