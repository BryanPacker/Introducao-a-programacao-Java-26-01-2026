package Un5.Ex;

import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        double altura = 0, soma = 0;
        for (int i = 1; i <= 20; i++) {
            System.out.println("Qual a altura da "+ i +" pessoa?");
            altura = prompt.nextInt();
            soma += altura;
        }
        double mediaAltura = (soma / 100f) / 20f;
        System.out.println("Média altura: " + mediaAltura);
    }
}
