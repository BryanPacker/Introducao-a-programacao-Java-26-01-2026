package Un4.Exe;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        int numChoose, num1, num2, num3;
        Scanner prompt = new Scanner(System.in);

        System.out.println("Qual a ordenação desejada?");
        numChoose = prompt.nextInt();
        System.out.println("Qual o primeiro número?");
        num1 = prompt.nextInt();
        System.out.println("Qual o primeiro número?");
        num2 = prompt.nextInt();
        System.out.println("Qual o primeiro número?");
        num3 = prompt.nextInt();

        switch (numChoose) {
            case 1:
                if (num1 > num2 && num1 > num3 && num2 < num1 && num2  > num3) {
                   System.out.println("A ordem é igual a");
                   System.out.println(num1);
                   System.out.println(num2);
                   System.out.println(num3);
                }                
                else if (num2 > num1 && num2 > num3 && num3 < num1 && num2  > num3) {
                    System.out.println("A ordem é igual a");
                    System.out.println(num2);
                    System.out.println(num3);
                    System.out.println(num1);
                }
                break;
        
            default:
                break;
        }
    }
}
