package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int altura = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Qual a altura da "+ i +" pessoa?");
            altura = prompt.nextInt();
            altura += altura;
        }
        float mediaAltura = (altura / 100) / 20;
        System.out.println("Média altura: " + mediaAltura);
    }
}
