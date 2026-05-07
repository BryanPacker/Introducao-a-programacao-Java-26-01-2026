package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        double n = 0, input = 0, inputLastRun = 0, min = 0, max = 0;
        System.out.println("Quantos números você deseja fornecer de input?");
        n = prompt.nextInt();
        for (double i = 1; i <= n; i++) {
            System.out.println("Qual o "+i+" número?");
            input = prompt.nextDouble();
            if (i == 1) {
                inputLastRun = input;
                min = input;
                max = input;
            }
            else{
            if (inputLastRun < input && input > max) {
                max = input;
                inputLastRun = input;
            }
            else if(inputLastRun > input && input < min) {
                min = input;
                inputLastRun = input;
            }
            }
        }
        System.out.println("Maior Número: "+max);
        System.out.println("Menor Número: "+min);
    }
}
