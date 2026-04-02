package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int x, y;
        System.out.println("Qual o valor de x");
        x = prompt.nextInt();
        System.out.println("Qual o valor de y");
        y = prompt.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        }
        if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        }
        if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");
        }
        if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        }
        if (x < 0 && y > 0) {
            System.out.println("Quadrante 4");
        }

    }
}
