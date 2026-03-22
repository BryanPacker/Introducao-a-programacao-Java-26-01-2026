package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        String cor;
        boolean ehOuNao;
        System.out.println("A cor é azul");
        cor = prompt.next();
        cor = cor.toLowerCase();
        if (cor.equals("sim") || cor.equals("s")) {
            ehOuNao = true;
        }
        else{
            ehOuNao = false;
        }
        if (ehOuNao == true) {
            System.out.println("A cor é azul");
        }
        else{
            System.out.println("A cor não é azul");
        }
    }
}
