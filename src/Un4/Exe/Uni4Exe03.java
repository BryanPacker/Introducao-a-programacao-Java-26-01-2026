package Un4.Exe;

import java.util.Scanner;

public class Uni4Exe03 {
    private int numero1;
    private int numero2;

    public Uni4Exe03(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Qual o primeiro número");
        numero1 = prompt.nextInt();

        System.out.println("Qual o segundo número");
        numero2 = prompt.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número 1 é maior que o número 2");            
        }
        else{
            if (numero1 == numero2) {
                System.out.println("Os dois números são iguais");
            }
            else{
                System.out.println("O número dois é maior que o número um");
            }
        }
    }
}
