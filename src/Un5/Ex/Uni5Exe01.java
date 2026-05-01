package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe01 {
public static void main(String[] args) {
    Scanner prompt = new Scanner(System.in);
    for (int i = 0; i < 20; i++) {
        int number; 
        System.out.println("Qual o primeiro número?");
        number = prompt.nextInt();
        if (number % 2 == 0) {
            System.out.println("Par");
        }
        else{
            System.out.println("Ímpar");
        }
    }
}
}
