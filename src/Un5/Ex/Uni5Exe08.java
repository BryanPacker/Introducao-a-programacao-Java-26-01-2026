package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int n = 0, input = 0, inputLastRun = 0, qntPlus = 0, min = 0, media = 0, soma = 0;
        System.out.println("Quantos números você deseja fornecer de input?");
        n = prompt.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Qual o "+i+" número?");
            input = prompt.nextInt();
            if (i == 1) {
                min = input;
                inputLastRun = input;
            }
            if (input > 0) {
                soma = soma + input;
                qntPlus++;
            }
            else if (inputLastRun > input) {
                min = input;
                inputLastRun = input;
            }
        }
        media = soma / qntPlus;
        System.out.println("Média dos números positivos: "+media);
        System.out.println("Menor Número negativo: "+min);
    }
}
