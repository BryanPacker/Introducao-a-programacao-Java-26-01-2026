package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        int num1, num2, operation;
        Scanner prompt = new Scanner(System.in);
        System.out.println("Qual o primeiro valor?");
        num1 = prompt.nextInt();
        System.out.println("Qual o segundo valor?");
        num2 = prompt.nextInt();
        System.out.println("Qual a operação desejada");
        operation = prompt.nextInt();
        int conta;
        switch (operation) {
            case 1:
                conta = num1 + num2;
                System.out.println("A soma dos dois números é igual a: " + conta);
                break;
            case 2:
                conta = num1 - num2;
                System.out.println("A diferença entre os dois números é igual a: " + conta);
                break;
            case 3:
                conta = num1 * num2;
                System.out.println("O produto dos dois números é igual a: " + conta);
                break;
            case 4:
                if (num1 != 0 || num2 != 0) {
                conta = num1 / num2;
                System.out.println("A divisão dos dois números é igual a: " + conta);                    
                }
                else{
                    System.out.println("Divisões não podem ser feitas com 0");
                }
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
