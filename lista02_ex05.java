import java.util.Random;
import java.util.Scanner;

public class lista02_ex05{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        
        int numeroSecreto = random.nextInt(10) + 1; 
        int palpite = 0;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Seu palpite é baixo. Tente novamente!");
            } else if (palpite > numeroSecreto) {
                System.out.println("Seu palpite é alto. Tente novamente!");
            } else {
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas!");
            }
        }
    }
}

