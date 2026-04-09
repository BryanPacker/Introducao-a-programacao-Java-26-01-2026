package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        String escolha;
        int base, altura, soma;
        System.out.println("Escolha uma Opção Q, T, R ou C");
        escolha = prompt.next();
        switch (escolha) {
            case "T":
                System.out.println("Qual a base do triângulo");
                base = prompt.nextInt();
                System.out.println("Qual a altura do triângulo");
                altura = prompt.nextInt();
                soma = base * altura / 2;
                System.out.println("");
                break;
        
            default:
                break;
        }

    }
}
