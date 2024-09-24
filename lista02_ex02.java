import java.util.Scanner;
/**
 *
 * @author Acer
 */
public class lista02_ex02 {
    public static void main(String[] args){
        
        int num1, num2;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        num1 = s.nextInt();
        
        System.out.println("Informe o segundo numero: ");
        num2 = s.nextInt();
       
        if (num1 < num2){
            for (int i = num1 + 1; i < num2; i++)
                System.out.println(i);
        
        }
    }
}
