package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Qual o número 1");
        numero1 = prompt.nextInt();
        System.out.println("Qual o número 2");
        numero2 = prompt.nextInt();
        int comparadorA = numero1 % numero2;
        int comparadorb = numero2 % numero1;

        if (comparadorA == 0 || comparadorb == 0) {
            System.out.println("É multiplo");
        }
        else{
            System.out.println("Não é multiplo");
        }
    }
}
