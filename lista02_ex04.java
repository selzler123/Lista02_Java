import java.util.Scanner;

public class lista02_ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int numero;

        System.out.println("Informe números entre 0 e 100. Para encerrar, digite 0.");

        while (true) {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            
            if (numero == 0) {
                break;
            }

            
            if (numero < 0 || numero > 100) {
                System.out.println("Número inválido! Informe um número entre 0 e 100.");
                continue; 
            }

            
            if (numero % 2 == 0) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números pares informados é: " + soma);
        scanner.close(); 
    }
}
