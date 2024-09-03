import java.util.Scanner;

public class CampeonatoFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTimes = 5;
        int jogadoresPorTime = 11;
        
        int totalJogadores = numTimes * jogadoresPorTime;
        int countMenor18 = 0;
        double somaIdadeTimes[] = new double[numTimes];
        double somaAltura = 0;
        int countMais80kg = 0;
        
        for (int time = 0; time < numTimes; time++) {
            double somaIdadeTime = 0;
            
            for (int jogador = 0; jogador < jogadoresPorTime; jogador++) {
                System.out.println("Digite a idade do jogador " + (jogador + 1) + " do time " + (time + 1) + ": ");
                int idade = scanner.nextInt();
                
                System.out.println("Digite o peso do jogador " + (jogador + 1) + " do time " + (time + 1) + ": ");
                double peso = scanner.nextDouble();
                
                System.out.println("Digite a altura do jogador " + (jogador + 1) + " do time " + (time + 1) + ": ");
                double altura = scanner.nextDouble();
                
                if (idade < 18) {
                    countMenor18++;
                }
                
                somaIdadeTime += idade;
                somaAltura += altura;
                
                if (peso > 80) {
                    countMais80kg++;
                }
            }
            
            somaIdadeTimes[time] = somaIdadeTime / jogadoresPorTime;
        }
        
        scanner.close();
        
        System.out.println("\nQuantidade de jogadores com idade inferior a 18 anos: " + countMenor18);
        
        for (int i = 0; i < numTimes; i++) {
            System.out.println("Média das idades dos jogadores do time " + (i + 1) + ": " + somaIdadeTimes[i]);
        }
        
        System.out.println("Média das alturas de todos os jogadores: " + (somaAltura / totalJogadores));
        System.out.println("Porcentagem de jogadores com mais de 80kg: " + ((double) countMais80kg / totalJogadores * 100) + "%");
    }
}
