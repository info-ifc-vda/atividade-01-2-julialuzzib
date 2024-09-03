import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        //recebe dados
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        double salarioBruto = horasTrabalhadas * valorHora;
        double imposto = salarioBruto * 0.30;
        double salarioReceber = salarioBruto - imposto;

        //resultado
        System.out.printf("Salário bruto: R$ %.2f%n", salarioBruto);
        System.out.printf("Imposto (30%%): R$ %.2f%n", imposto);
        System.out.printf("Salário a receber: R$ %.2f%n", salarioReceber);

        scanner.close();
    }
}
