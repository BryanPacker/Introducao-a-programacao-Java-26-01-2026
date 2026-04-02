package Un4;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        System.out.println("Escolha um número de 1 a 4");
        int number = prompt.nextInt();
        prompt.close();
        switch (number) {
            case 1:
                System.out.println("Número 1");
                break;
            case 2:
                System.out.println("Número 2");
                break;    
            case 3:
                System.out.println("Número 3");
                break;
            case 4:
                System.out.println("Número 4");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
