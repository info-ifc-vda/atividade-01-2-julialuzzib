import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro ângulo do triângulo (em graus): ");
        double angulo1 = scanner.nextDouble();
        System.out.print("Digite o segundo ângulo do triângulo (em graus): ");
        double angulo2 = scanner.nextDouble();
        System.out.print("Digite o terceiro ângulo do triângulo (em graus): ");
        double angulo3 = scanner.nextDouble();

        System.out.print("Digite o comprimento do primeiro lado: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Digite o comprimento do segundo lado: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Digite o comprimento do terceiro lado: ");
        double lado3 = scanner.nextDouble();

        String tipoAngulo;
        if (angulo1 == 90 || angulo2 == 90 || angulo3 == 90) {
            tipoAngulo = "retangulo";
        } else if (angulo1 > 90 || angulo2 > 90 || angulo3 > 90) {
            tipoAngulo = "obtusangulo";
        } else {
            tipoAngulo = "acutangulo";
        }

        String tipoLado;
        if (lado1 == lado2 && lado2 == lado3) {
            tipoLado = "equilatero";
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            tipoLado = "isosceles";
        } else {
            tipoLado = "escaleno";
        }

        //classificacao
        System.out.printf("O triângulo é %s e %s.%n", tipoAngulo, tipoLado);

        scanner.close();
    }
}
